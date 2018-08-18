package pl.mpas.github_commits.dao;

import pl.mpas.github_commits.domain.CommitsCollection;

public interface GithubDao {
    CommitsCollection readCommitsFromDestiny();
}
