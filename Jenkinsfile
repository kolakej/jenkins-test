pipeline {
    agent any 
     environment {
       version = "${env.BUILD_NUMBER}"
       workspace = "${env.WORKSPACE}"
     }
     stages {
        stage('Build') {
          steps {
            dir('test-pipeline'){
            sh "mvn versions:set -DnewVersion=1.0.${version}-SNAPSHOT"
            sh "mvn -Dmaven.test.failure.ignore clean package"
            }
        }
      }
    }
  }