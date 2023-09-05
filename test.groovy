multibranchPipelineJob('my-job') {
  displayName('moy-job')
  branchSources {
    branchSource {
      source {
        github {
          configuredByUrl(false)
          repoOwner('/sahumahesh0512')
          repository('jobDSL')
          repositoryUrl('https://github.com/sahumahesh0512/jobDSL.git')
          apiUri("https://github.com")
          credentialsId('mahesh-github')
          traits {
            gitHubBranchDiscovery {
                strategyId(3)
            }
            gitHubPullRequestDiscovery {
              strategyId(2)
            }
          }
        }
      }
      strategy {
        allBranchesSame {
          props {
            suppressAutomaticTriggering {
              strategy('INDEXING')
              triggeredBranchesRegex('.*')
            }
          }
          }
      }

      buildStrategies {
        buildAllBranches {
          strategies {
            buildChangeRequests {
              ignoreTargetOnlyChanges(true)
              ignoreUntrustedChanges(false)
            }
          }
        }
      }
    }
  }
  factory {
    workflowBranchProjectFactory {
      scriptPath('test.jenkinsfile')
    }
  }
  orphanedItemStrategy {
    discardOldItems {
      daysToKeep(3)
      }
  }
}
