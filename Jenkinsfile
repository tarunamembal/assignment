
pipeline {
   agent any
   stages {
      stage('setup') {
         steps {
            browserstack(credentialsId: '7321986c-6a87-44de-bd54-573815224cdb') {
               echo "hello"
               sh 'javac -cp /src/runonbstack/Chrome.java'
               browserStackReportPublisher 'automate'
            }
         }
      }
    }
  }
