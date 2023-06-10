pipeline {
    agent any
    tools {
        maven 'jenkinsmaven'
    }
    stages {
        stage('Build') {
            steps {
                echo 'Construyendo la aplicacion'
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
            	echo 'Ejecutando los tests '
            	sh 'mvn test'
				echo 'Finalizado los tests '
            }
        }
        stage('Deploy') {
            steps {
                echo 'Desplegando el area de desarrollo'
                sh 'mvn install'
            }
        }
    }
}
 