package pl.mpas.github_rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mpas.github_rest.dao.GithubRestDao;
import pl.mpas.github_rest.domain.RepositoryInfo;

@Service
public class GithubRestServiceImpl implements GithubRestService {

    private GithubRestDao githubRestDao;

    @Autowired
    public GithubRestServiceImpl(GithubRestDao githubRestDao) {
        this.githubRestDao = githubRestDao;
    }

    @Override
    public RepositoryInfo[] getInfoOfMyRepos() {
        return githubRestDao.getMyRepos();
    }
}
