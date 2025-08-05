package com.javatech.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class GithubCidActionsApplication {
    @GetMapping()
    public  String welComeMessage(){
        return "Welcome to Github CI/CD Actions";
    }
    public static void main( String[] args ){
        SpringApplication.run(GithubCidActionsApplication.class,args);
    }
//    echo "# -github-cicd-actions" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/seidyesufali77/-github-cicd-actions.git
//    git push -u origin maigitn

}
