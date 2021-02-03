pipeline {
    agent none
    stages {
        stage('Non Parallel Stage') {
            agent {
                label 'master'
            }
            
            steps {
                echo 'This stage wiil be executed first'
            }
        }
        
        stage('Run Tests') {
            parallel {
                stage ('Test on Windows') {
                    agent {
                        label 'windows-node'
                    }
                    steps {
                        echo 'task on Agent'
                    }
                }
                
                stage ('Test on Master') {
                    agent {
                        label 'master'
                    }
                    steps {
                        echo 'task on Master'
                    }
                }
            }
        }
    }
}
