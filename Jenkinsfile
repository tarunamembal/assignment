
pipeline {
   agent any
   stages {
      stage('setup') {
         steps {
            browserstack(credentialsId: '7321986c-6a87-44de-bd54-573815224cdb') {
               echo "hello"
               sh 'javac -cp /Users/tarunamembal/selenium-grid/selenium-server-4.9.0.jar: /src/runonbstack/Chrome.java'
               browserStackReportPublisher 'automate'
            }
         }
      }
    }
  }
