package pl.mpas.github_rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mpas.github_rest.domain.RepositoryInfo;
import pl.mpas.github_rest.service.GithubRestService;

@RestController
public class GithubRestController {

    private GithubRestService githubRestService;

    @Autowired
    public GithubRestController(GithubRestService githubRestService) {
        this.githubRestService = githubRestService;
    }

    @RequestMapping("/dawaj-moje-repos")
    RepositoryInfo[] getMyRepos() {
        return githubRestService.getInfoOfMyRepos();
    }
}
