def call(String GitUrl, String GitBranch){
  echo "This is Mamun-Coding stage"
  git url: "${GitUrl}", branch: "${GitBranch}"
  echo "Code cloning successful!"
}
