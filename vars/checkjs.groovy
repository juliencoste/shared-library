#!/usr/bin/env groovy

// check javascript syntax
def call(){
    docker run -it --rm -v $(pwd):/data cytopia/eslint

}
