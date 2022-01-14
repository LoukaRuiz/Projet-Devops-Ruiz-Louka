#!groovy
println('------------------------------------------------------------------Import Job CAC/jobs-ansible')
def pipelineScript = new File('/var/jenkins_config/jobs/jobs-ansible-pipeline.groovy').getText("UTF-8")

pipelineJob('CAC/jobs-ansible') {
    description("Ansible")
    definition {
        cps {
            script(pipelineScript)
            sandbox()
        }
    }
    stringParam {
            name('ANSIBLE_PATH')
            defaultValue('/usr/share/ansible')
            description("ansible path in docker")
            trim(false)
        }
        stringParam {
            name('SSH_KEY_PATH')
            defaultValue('~/.ssh/id_rsa')
            description("ssh private key")
            trim(false)
        }
    }
    definition {
        cps {
            script(pipelineScript)
            sandbox()
        }
    }
}