multibranchpipelinejob('my-job') {

    scm {

        git('https://github.com/sahumahesh0512/jobDSL/blob/main/test.jenkinsfile')

    }

    triggers {

        scm('H/15 * * * *')

    }

    steps {

        maven('-e clean test')

    }

}
