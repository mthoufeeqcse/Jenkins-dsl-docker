job("Deploy") {
 scm {
  git {
   remote {
     url 'https://github.com/mthoufeeqcse/Custom-Jenkins-Docker-Image'  
  }
  branch 'master'
  doGenerateSubmoduleConfigurations: false  
  }
 }
 steps{
   shell(readFileFromWorkspace('deploy.sh'))
 }
}
