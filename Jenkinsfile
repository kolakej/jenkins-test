pipeline {
    agent any 
        node {
     def version = env.BUILD_NUMBER
     def workspace = env.WORKSPACE
     } stages {}
        stage('Build') {
          steps {
            sh "mvn versions:set -DnewVersion=1.0.${version}-SNAPSHOT"
            sh "mvn -Dmaven.test.failure.ignore clean package"
        }
      }
  }