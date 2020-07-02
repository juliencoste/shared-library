#!/usr/bin/env groovy

// check markdown syntax
def call(){
    sh 'apk --no-cache add git'
    sh 'gem install mdl'
    sh 'mdl --version'
    sh 'mdl --style all --warnings --git-recurse \${WORKSPACE}'
}
