#!/usr/bin/env groovy

def call() {
   
// Run golint
   sh 'golangci-lint run --enable-all \${WORKSPACE}/...'
    }
