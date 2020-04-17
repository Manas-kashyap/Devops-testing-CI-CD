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
}
