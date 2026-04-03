pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                dir('GitPracticeProject'){
                    bat 'mvn compile'
                }
            }
            post {
                always {
                    archiveArtifacts artifacts: 'target/*.jar', allowEmptyArchive: true
                }
            }
        }

        stage('Test') {
        steps {
                dir('GitPracticeProject'){
                    bat 'mvn test'
                }
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying to production...'
            }
        }
    }
}