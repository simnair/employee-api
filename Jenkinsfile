pipeline {
    agent any

    tools {
        maven 'maven'
    }

    stages {

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t learn04mar26 .'
            }
        }

        stage('Deploy') {
            steps {
                sh 'docker run -d -p 8088:8080 learn04mar26'
            }
        }

    }
}
