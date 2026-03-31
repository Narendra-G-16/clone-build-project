def call(Map config = [:]) {

    stage('Clone') {
        echo "Cloning repository..."
        git url: config.repoUrl, branch: 'main'
    }

    stage('Build') {
        echo "Building project..."
        sh 'mvn clean package'
    }

    stage('Deploy') {
        echo "Deploying application..."
        sh 'echo Deployment successful!'
    }
}
