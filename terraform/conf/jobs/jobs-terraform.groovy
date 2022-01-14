#!groovy
println('------------------------------------------------------------------Import Job IaC/jobs-terraform')
def pipelineScript = new File('/var/jenkins_config/jobs/jobs-terraform-pipeline.groovy').getText("UTF-8")

pipelineJob('IaC/jobs-terraform') {
    description("Create instance aws terraform and destroy")
    definition {
        cps {
            script(pipelineScript)
            sandbox()
        }
    }
}