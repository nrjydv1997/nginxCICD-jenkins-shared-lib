def call(String imageTag){
  withCredentials([usernamePassword(credentialsId: 'dockerCred', passwordVariable: 'dockerPass', usernameVariable: 'dockerUser')]) {
                  sh "docker login -u ${dockerUser} -p ${dockerPass}"
                  sh "docker image tag nginx-app:latest ${env.dockerUser}/nginx-app:latest"
                  sh "docker push ${env.dockerUser}/nginx-app:latest"
                }
}
