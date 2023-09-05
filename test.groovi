job('my-job') {

    scm {

        git('https://github.com/AstroTech/ecosystem-example-java.git')

    }

    triggers {

        scm('H/15 * * * *')

    }

    steps {

        maven('-e clean test')

    }

}
