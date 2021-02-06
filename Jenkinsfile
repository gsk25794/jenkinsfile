def gv

pipeline {
    agent any
    parameters{
        string(name: 'VERSION', defaultValue: '', description: 'Version to deploy on prod')
        choice(name: 'VERSION', choices: ['1.1', '1.2', '1.3'], description: 'whatever u like')
        booleanParam(name: 'executeTests', defaultValue: true , description: 'whatever u like')
    }
    stages {
            stage('init'){
                steps {
                    script{
                        gv = load "script.groovy"
                    } 
                }
            }

            stage('Build'){
                steps { 
                    script {
                        gv.buildApp()
                    }
                }
            }
            
            stage('Unit-Test'){
                when{
                    expression{
                        params.executeTests //when executeTests parameter is set to true then next step will execute otherwise not
                    }
                }
                steps { 
                    script {
                        gv.testApp()
                    }
                }
            }
            
            stage('Quality'){
                steps { 
                    echo 'Testing the Quality of application'
                }
            }
            
            stage('Deploy'){
                steps { 
                    script {
                        gv.buildApp()
                    }
            }
        }
    }
}
