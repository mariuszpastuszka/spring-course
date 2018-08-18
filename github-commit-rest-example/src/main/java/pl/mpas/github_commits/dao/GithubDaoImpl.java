package pl.mpas.github_commits.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import pl.mpas.github_commits.domain.CommitsCollection;

@Repository
public class GithubDaoImpl implements GithubDao {

    @Value("${my.github.owner:mariuszpastuszka}")
    private static String REPO_OWNER;

    @Value("${my.github.repo}")
    private static String REPO_NAME;

    private static final String GITHUB_URL = String.format("https://api.github.com/repos/%s/%s/commits", REPO_OWNER, REPO_NAME);

    private RestTemplate restTemplate;

    @Autowired
    public GithubDaoImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public CommitsCollection readCommitsFromDestiny() {
        return restTemplate.getForObject(GITHUB_URL, CommitsCollection.class);
    }
}
