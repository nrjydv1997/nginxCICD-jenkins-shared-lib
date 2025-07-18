def call(String url, String branch){
  echo "this is clonging the code"
  git url: "${url}", branch: "${branch}"
  echo "Clonging successfull"
}
