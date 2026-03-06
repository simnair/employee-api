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

	stage('Stop Old Container') {
            steps {
                sh 'docker stop employee-api || true'
                sh 'docker rm employee-api || true'
            }
        }

        stage('Deploy') {
	   steps {
                 sh 'docker rm -f employee-api || true'
                 sh 'docker run -d -p 8088:8080 --add-host=host.docker.internal:host-gateway --name employee-api learn04mar26'
    }
}


    }
}
