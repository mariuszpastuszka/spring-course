package pl.mpas.github_rest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import pl.mpas.github_rest.domain.RepositoryInfo;

@Repository
public class GithubRestDaoImpl implements GithubRestDao {

    @Value("${github.user.name:mariuszpastuszka}")
    private String reposOwner;
    private final String GITHUB_REPOS_URL;

    {
        GITHUB_REPOS_URL = String.format("https://api.github.com/users/%s/repos", reposOwner);
    }

    private RestTemplate restTemplate;

    @Autowired
    public GithubRestDaoImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public RepositoryInfo[] getMyRepos() {
        return restTemplate.getForObject(GITHUB_REPOS_URL, RepositoryInfo[].class);
    }
}
