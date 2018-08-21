pipelineJob ('BuildAndPush') {
    parameters {
      stringParam('version', null, 'Version of nexus build')
    }
definition {
    cpsScm {
      scm {
        git {
          remote { url('https://github.com/kolakej/jenkins-test.git') }
          branches('master')
          scriptPath("test-pipeline/Jenkinsfile")
        }
      }
    }
  }
}
pipelineJob ('MavenDelivery') {
   parameters {
    activeChoiceParam ('version') {
         groovyScript {
           script'''def NEXUS_URL = "http://35.187.18.32:8081/repository/maven-releases/nexus/com/my-app/maven-metadata.xml"
def projectXml = new XmlSlurper().parse("${NEXUS_URL}")
def test = projectXml.versioning.versions.version.toString()
def split = test.split("-RELEASES")
def result = []
for (string in split) {
test = "${string}"
result << test.toString()
}
return result
'''
     }
    }
   }
definition {
    cpsScm {
      scm {
        git {
          remote { url('https://github.com/kolakej/jenkins-test.git') }
          branches('master')
          scriptPath("Jenkinsfile")
        }
      }
    }
  }
}