def call(String projectName,String imageTag,String dockerHubUser){
  sh "docker rm -f $(docker ps -aq)"
  sh "docker rmi ${dockerHubUser}/${projectName}:${imageTag}"
  sh "docker build -t ${dockerHubUser}/${projectName}:${imageTag} ."
}
