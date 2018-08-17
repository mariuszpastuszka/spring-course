package pl.mpas.github_rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mpas.github_rest.dao.GithubRestDao;
import pl.mpas.github_rest.domain.RepositoryInfo;

import java.util.List;

@Service
public class GithubRestServiceImpl implements GithubRestService {

    private GithubRestDao githubRestDao;

    @Autowired
    public GithubRestServiceImpl(GithubRestDao githubRestDao) {
        this.githubRestDao = githubRestDao;
    }

    @Override
    public List<RepositoryInfo> getInfoOfMyRepos() {
        return githubRestDao.getMyRepos();
    }
}
