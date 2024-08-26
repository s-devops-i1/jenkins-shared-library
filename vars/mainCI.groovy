def call(){
    node('ci-server'){
        if(env.TAG_NAME ==~ ".*"){
            stage('Build Code'){
                print 'OK'
            }
            stage('Release Software'){
                print 'OK'
            }
        }else {
            stage('Lint code'){
                print 'OK'
            }
            if(env.BRANCH_NAME != 'main') {
                stage('Run Unit Test'){
                    print 'OK'
                }
                stage('Run Integration Tet'){
                    print 'OK'
                }
            }
        }

        stage('Sonar Scan Code Review'){
            print 'OK'
        }

    }


}


