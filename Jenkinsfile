node {
     def version = env.BUILD_NUMBER
     def workspace = env.WORKSPACE
}
stage('Build') {
        sh "mvn versions:set -DnewVersion=1.0.${version}-SNAPSHOT"
        sh "mvn -Dmaven.test.failure.ignore clean package"
      }