package pl.mpas.github_commits.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mpas.github_commits.dao.GithubDao;
import pl.mpas.github_commits.domain.CommitsCollection;

@Service
public class GithubServiceImpl implements GithubService {

    private GithubDao githubDao;

    @Autowired
    public GithubServiceImpl(GithubDao githubDao) {
        this.githubDao = githubDao;
    }

    @Override
    public CommitsCollection getCommits() {
        return githubDao.readCommitsFromDestiny();
    }
}
