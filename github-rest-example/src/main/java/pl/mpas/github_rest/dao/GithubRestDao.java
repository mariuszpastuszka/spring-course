package pl.mpas.github_rest.dao;

import pl.mpas.github_rest.domain.InfosOfRepos;

public interface GithubRestDao {

    InfosOfRepos getMyRepos();
}
