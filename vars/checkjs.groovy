#!/usr/bin/env groovy

// check javascript syntax
def call(){
    sh 'eslint --quiet'

}
