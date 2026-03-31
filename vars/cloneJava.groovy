def call(Map config = [:]) {

    stage('Clone') {
        echo "Cloning repository..."
        git url: config.repoUrl, branch: 'main'
    }

    stage('Docker Build') {
        echo "Building Docker Image..."
        sh 'docker build -t java-demo-app .'
    }

    stage('Run Container') {
        echo "Running Docker Container..."
        sh 'docker run java-demo-app'
    }

}
