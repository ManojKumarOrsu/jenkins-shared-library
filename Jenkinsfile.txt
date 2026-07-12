@Library (my-shared-lib) _

pipeline {
    agent any
    tools {
        jdk 'java21'
        maven 'maven3.9.16'
    }
    stages {
        stage ('checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/ManojKumarOrsu/jenkins-shared-library.git'
            }
        }
        stage ('build') {
            steps {
                mavenBuild ()
            }
        }
        stage (post_build) {
            steps {
                echo 'Build usinig shared library succesfull'
            }
        }
    }
}
