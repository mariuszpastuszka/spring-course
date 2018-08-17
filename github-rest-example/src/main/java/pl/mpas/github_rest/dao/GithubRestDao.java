package pl.mpas.github_rest.dao;

import pl.mpas.github_rest.domain.RepositoryInfo;

import java.util.List;

public interface GithubRestDao {

    List<RepositoryInfo> getMyRepos();
}
