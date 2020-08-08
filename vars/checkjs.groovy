#!/usr/bin/env groovy

// check javascript syntax
def call(){
    sh docker run -it --rm -v $(workspace):/data cytopia/eslint .

}
