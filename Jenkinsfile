pipeline {
    agent any 
     environment {
       version = "${env.BUILD_NUMBER}"
       workspace = "${env.WORKSPACE}"
      // workdir = pwd()
     }
     stages {
        stage('Delivery') {
          steps {
           sh "curl -X GET http://35.187.18.32:8081/repository/maven-releases/nexus/com/my-app/1.0.4-RELEASES/my-app-1.0.4-RELEASES.jar -O"
           sh "java -jar my-app-1.0.4-RELEASES.jar"
            }
        }
      }
    }