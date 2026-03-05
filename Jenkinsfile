pipeline {
    agent any

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
                sh 'docker run -d -p 8082:8082 learn04mar26'
            }
        }
    }
}

