package pl.mpas.github_rest.service;

import pl.mpas.github_rest.domain.RepositoryInfo;

import java.util.List;

public interface GithubRestService {
    List<RepositoryInfo> getInfoOfMyRepos();
}
