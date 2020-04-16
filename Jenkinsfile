pipeline {
    agent any
    stages {
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
