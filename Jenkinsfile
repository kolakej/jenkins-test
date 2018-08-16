pipeline {
    agent any 
     environment {
       version = "${env.BUILD_NUMBER}"
       workspace = "${env.WORKSPACE}"
      // workdir = pwd()
     }
     stages {
        stage('Build') {
          steps {
        //    dir("${workdir}") {
            sh "mvn versions:set -DnewVersion=1.0.${version}-SNAPSHOT"
            sh "mvn -Dmaven.test.failure.ignore clean package"
            }
        }
      }
    }