#!/usr/bin/env groovy

def call() {
   
// Run golint
   sh 'golangci-lint run \${WORKSPACE}/'
    }
post {
    always {
        recordIssues enabledForFailure: true, tool: goLint(), qualityGates: [[threshold: 1, type: 'TOTAL', unstable: true]]
        }
    }
