pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/MKawcz/helloworld.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
                junit '**/target/surefire-reports/*.xml'
            }
        }
        stage('Static Analysis') {
            steps {
                sh 'mvn sonar:sonar'
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
            junit 'target/surefire-reports/*.xml'
        }
    }
}
