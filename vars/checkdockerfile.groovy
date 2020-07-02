#!/usr/bin/env groovy

// check dockerfile syntax
def call(){
    sh '/bin/hadolint  \${WORKSPACE}/'

}
