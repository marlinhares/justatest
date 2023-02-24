pipeline {
    agent any 
    parameters{
    	string(
    	      name: 'sha1',
    	      defaultValue:"master",
    	      description: "commit id ou refname (eg: origin/pr/9/head) desse repositorio. Obrigatorio que esse parametro tenha o nome sha1 por conta do plugin GHPRB")
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
                    sleep 10
                    echo "Terminei"
                    echo "${DATABASE}"
                    echo "${GITURL}"
                    
                    """
                    
                    
                }
            }
        }
    }
}