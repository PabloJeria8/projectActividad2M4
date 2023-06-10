pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Construyendo la aplicacion'
            }
        }
 
        stage('Test') {
            steps {
                echo 'Ejecutar los tests '
				echo 'Finalizado los tests '
            }
        }
        stage('Deploy') {
            steps {
                echo 'Desplegando el area de desarrollo'
            }
        }
    } 
}