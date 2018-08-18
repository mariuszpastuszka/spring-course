package pl.mpas.github_commits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mpas.github_commits.domain.CommitsCollection;
import pl.mpas.github_commits.service.GithubService;

@RestController
public class GithubRestController {

    private GithubService githubService;

    @Autowired
    public GithubRestController(GithubService githubService) {
        this.githubService = githubService;
    }

    @RequestMapping("/get-commits-as-json")
    public CommitsCollection getCommits() {
        return githubService.getCommits();
    }
}
