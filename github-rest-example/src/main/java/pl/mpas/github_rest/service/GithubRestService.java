package pl.mpas.github_rest.service;

import pl.mpas.github_rest.domain.InfosOfRepos;

import java.util.List;

public interface GithubRestService {
    InfosOfRepos getInfoOfMyRepos();
}
