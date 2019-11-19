package pl.mpas.github_rest.dao;

import pl.mpas.github_rest.domain.RepositoryInfo;

public interface GithubRestDao {

    RepositoryInfo[] getMyRepos();
}
