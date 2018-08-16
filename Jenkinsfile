pipeline {
    agent any 
     environment {
       version = "${env.BUILD_NUMBER}"
       workspace = "${env.WORKSPACE}"
       workdir = pwd()
     }
     stages {
        dir("${workdir}"){
        stage('Build') {
          steps {
            sh "mvn versions:set -DnewVersion=1.0.${version}-SNAPSHOT"
            sh "mvn -Dmaven.test.failure.ignore clean package"
            }
        }
      }
    }
  }