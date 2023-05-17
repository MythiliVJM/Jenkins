pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                // Perform build steps here
                sh 'mvn clean install'
            }
        }
        
        stage('Test') {
            steps {
                // Perform testing steps here
                sh 'mvn test'
            }
        }
        
        stage('Deploy') {
            steps {
                // Perform deployment steps here
                sh 'mvn deploy'
            }
        }
    }
}
