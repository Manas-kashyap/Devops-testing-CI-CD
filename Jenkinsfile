pipeline {
    agent none
    stages {
         stage('Example Username/Password') {
            environment {
                SSH_CREDS = credentials('sshgcp')
            }
            steps {
                sh 'echo "SSH private key is located at $SSH_CREDS"'
                sh 'echo "SSH user is $SSH_CREDS_USR"'
                sh 'echo "SSH passphrase is $SSH_CREDS_PSW"'
            }
        }
        stage('Clean Compile') {
            parallel {
                stage('Build on Windows') {
                    agent { 
                        label 'ubuntu_16.04(GCP)'
                    }
                    steps {
                        sh 'sbt clean compile'
                    }
                }
                stage('Build on Linux') {
                    agent { 
                        label 'ubuntu-slave'
                    }
                    steps {
                        sh 'sbt clean compile'
                    }
                }
            }
        }
    }
}
