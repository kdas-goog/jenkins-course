job('Spring projects') {
    scm {
        git('git://github.com/kdas-goog/spring-boot-2-rest-service-basic') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('DSL User')
            //node / gitConfigEmail('jenkins-dsl@newtech.academy')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    steps {
        maven('-e clean test')
    }
}
