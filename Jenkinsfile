pipeline {
    agent none
    stages {
        stage('Clean Compile') {
            parallel {
                stage('Build on Windows') {
                    agent { 
                        label 'ubuntu-slave'
                    }
                    steps {
                        sh 'sbt clean compile'
                    }
                }
                stage('Build on Linux') {
                    agent { 
                        label 'debian-slave'
                    }
                    steps {
                        sh 'sbt clean compile'
                    }
                }
            }
        }
    }
    post {
        always {
            emailext body: 'A Test EMail', recipientProviders: [[$class: 'DevelopersRecipientProvider'], [$class: 'RequesterRecipientProvider']], subject: 'Test'
        }
    }
}
