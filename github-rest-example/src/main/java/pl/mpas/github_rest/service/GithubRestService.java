package pl.mpas.github_rest.service;

import pl.mpas.github_rest.domain.RepositoryInfo;

public interface GithubRestService {
    RepositoryInfo[] getInfoOfMyRepos();
}
