pipeline {
    agent any
    stages {
        stage('Clean Compile') {
            parallel {
                stage('Build on Windows') {
                    steps {
                        sh 'sbt clean compile'
                    }
                }
                stage('Build on Linux') {
                    steps {
                        sh 'sbt clean compile'
                    }
                }
            }
        }
    }
}
