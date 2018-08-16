pipeline {
    agent any 
     stages {
        stage('Build') {
          steps {
            version = env.BUILD_NUMBER
            workspace = env.WORKSPACE
            sh "mvn versions:set -DnewVersion=1.0.${version}-SNAPSHOT"
            sh "mvn -Dmaven.test.failure.ignore clean package"
        }
      }
    }
  }