package pl.mpas.github_commits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.mpas.github_commits.service.GithubService;

@Controller
public class GithubWebController {

    private GithubService githubService;

    @Autowired
    public GithubWebController(GithubService githubService) {
        this.githubService = githubService;
    }

    @GetMapping("/my-commits")
    String myCommits(Model model) {
        model.addAttribute("commitInfo", githubService.getCommits());
        return "my-commits";
    }
}
