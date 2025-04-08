pipeline{
    agent {
        docker {
            image "maven:latest"
            args "--entrypoint ''"
        }
    }
    parameters {
    string(name: 'mode', defaultValue: 'list', description: 'Mode d\'exécution')
  }
    stages{
        // stage('check version'){
        //     steps{
        //         sh 'mvn --version'
        //     }
        // }
        stage('Build'){
            steps{
                sh "mvn clean compile"
            }
        }
        stage('test'){
            steps{
                sh 'mvn test'
            }
        }
    }
    post {
        always {
            junit 'target/surefire-reports/**/*.xml'
        }
    }
}
