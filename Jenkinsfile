pipeline{
    agent any
    tools{
        maven 'Maven 3.9.9'
    }
    stages{
        stage('Checkout'){
            steps {
                git branch: 'main', url: 'https://github.com/JennyZhang2022/COMP367-Lab02-Q2.git'
            }
        }
        stage('Build'){
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Test'){
            steps {
                sh 'mvn test'
            }
        }
        stage('Deploy'){
            steps {
                echo 'Deploying Spring Boot Application........'
            }
        }
    }
}
