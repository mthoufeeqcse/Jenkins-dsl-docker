job("Deploy") {
 scm {
  git {
   remote {
     url 'https://github.com/mthoufeeqcse/dsl-groovy'  
  }
  branch 'master'
  doGenerateSubmoduleConfigurations: false  
  }
 }
 steps{
   shell(readFileFromWorkspace('deploy.sh'))
 }
}
