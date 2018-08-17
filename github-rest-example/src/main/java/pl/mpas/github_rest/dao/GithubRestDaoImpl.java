package pl.mpas.github_rest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import pl.mpas.github_rest.domain.InfosOfRepos;
import pl.mpas.github_rest.domain.RepositoryInfo;
import pl.mpas.github_rest.service.GithubRestServiceImpl;

import java.util.List;

@Repository
public class GithubRestDaoImpl implements GithubRestDao {

    @Value("${github.user.name:mariuszpastuszka}")
    private static String reposOwner;
    private static final String GITHUB_REPOS_URL;

    static {
        GITHUB_REPOS_URL = String.format("https://api.github.com/users/%s/repos", reposOwner);
    }

    private RestTemplate restTemplate;

    @Autowired
    public GithubRestDaoImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public InfosOfRepos getMyRepos() {
        return restTemplate.getForObject(GITHUB_REPOS_URL, InfosOfRepos.class);
    }
}
