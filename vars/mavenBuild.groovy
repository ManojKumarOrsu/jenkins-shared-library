def call () {
    stage ('Build using shared library') {
        steps {
            echo 'running maven build from shared library...'
            sh 'mvn clean package'
        }
    }
