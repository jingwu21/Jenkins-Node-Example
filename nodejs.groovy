job('project nodejs'){
    scm{
        git('https://github.com/jingwu21/Jenkins-Node-Example.git'){ node ->
            node / gitConfigName("jingwu21")
            node / gitConfigEmail("jingwu721@gmail.com")
        }
    }
    triggers{
        scm('H/S * * * *')
    }
    wrappers{
        nodejs('nodejs')
    }
    steps{
        shell('npm install')
    }
}