def call(String ProjectName, String ImageTag, String DockerHubUser){
  withCredentials([usernamePassword(
    credentialId: 'DockerHubCred', 
    passwordVariable: 'DockerHubPass',
    usernameVariable: 'DockerHubUser')]){
      sh 'echo $DockerHubPass | docker login -u $DockerHubUser --password-stdin'
      sh 'docker tag notes-app:latest $DockerHubUser/notes-app:latest'
      sh 'docker push $DockerHubUser/notes-app:latest'
  } 
}
