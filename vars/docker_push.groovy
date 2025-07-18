def call(String projectName, String imageTag,String dockerHubUser){
  withCredentials([usernamePassword(credentialsId: 'dockerCred', passwordVariable: 'dockerPass', usernameVariable: 'dockerUser')]) {
                  sh "docker login -u ${dockerUser} -p ${dockerPass}"
                  sh "docker push ${dockerUser}/${projectName}:${imageTag}"
                }
}
