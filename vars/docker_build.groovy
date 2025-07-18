def call(String projectName,String imageTag,String dockerHubUser){
  sh "docker rmi ${dockerHubUser}/${projectName}:${imageTag}"
  sh "docker build -t ${dockerHubUser}/${projectName}:${imageTag} ."
}
