package pl.mpas.github_commits.service;

import pl.mpas.github_commits.domain.CommitsCollection;

public interface GithubService {
    CommitsCollection getCommits();
}
