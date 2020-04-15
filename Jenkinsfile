pipeline {
    agent any
    stages {
        stage('clean compile') {
            steps {
                sh 'sbt clean compile'
            }
        }
        stage('build') {
            steps {
                sh 'sbt run'
            }
        }
    }
}
