#!/usr/bin/env groovy

// check javascript syntax
def call(){
    step([$class: 'hudson.plugins.checkstyle.CheckStylePublisher', checkstyle: 'src/ahl.com/dockit/static/eslint.xml'])

}
