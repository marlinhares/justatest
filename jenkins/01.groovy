pipeline {
    agent any 
    parameters{
        
        choice(
            name: 'database',
            choices: "mysql\noracle\nsqlserver",
            description: 'Qual o banco de dados' )
    	string(
    	      name: 'urlGitSpe',
    	      defaultValue:"github.com:supergovbr/super.git",
    	      description: "Url do git onde encontra-se o Sistema de Processo Eletrônico a instalar o modulo")
        
    }
    stages {
        stage('Build') { 
            steps {
                script {
                    
                    DATABASE = params.database
					GITURL = params.urlGitSpe
                    
                    sh """
                    echo "Iniciando"
                    sleep 20
                    echo "Terminei"
                    echo "${DATABASE}"
                    echo "${GITURL}"
                    
                    """
                    
                    
                }
            }
        }
    }
}