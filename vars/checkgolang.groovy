#!/usr/bin/env groovy

def call() {
// Retrieve golint tool
   sh 'go get -u golang.org/x/lint/golint'

// Run golint
   sh 'cd $GOPATH/src/github/jbleduigou/budgetcategorizer && golint ./...'

// Run go vet 
   sh 'cd $GOPATH/src/github/jbleduigou/budgetcategorizer && go vet ./... || true'
    }
post {
    always {
        recordIssues enabledForFailure: true, tool: goLint(), qualityGates: [[threshold: 1, type: 'TOTAL', unstable: true]]
        }
    }
