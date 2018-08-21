pipeline {
    agent any 
     environment {
       version = "${params.version}"
       workspace = "${env.WORKSPACE}"
     }
     stages {
        stage('Delivery') {
          steps {
           sh "curl -X GET http://35.187.18.32:8081/repository/maven-releases/nexus/com/my-app/${version}-RELEASES/my-app-${version}-RELEASES.jar -O"
           sh "java -jar my-app-${version}-RELEASES.jar"
            }
        }
      }
    }