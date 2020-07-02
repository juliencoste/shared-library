#!/usr/bin/env groovy

def call() {
// Retrieve golint tool
   sh 'go get -u golang.org/x/lint/golint'
   
// Run golint
   sh 'golint \${WORKSPACE}/'

// Run go vet 
   sh 'go vet ./... || true'
    }
post {
    always {
        recordIssues enabledForFailure: true, tool: goLint(), qualityGates: [[threshold: 1, type: 'TOTAL', unstable: true]]
        }
    }
