pipelineJob('my-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/sahumahesh0512/jobDSL.git')
                    }
                    branches('*/main') // Configure the branch patterns to build
                    scriptPath('test.jenkinsfile') // Specify the location of the Jenkinsfile in your repository
                }
            }
        }
    }
}

