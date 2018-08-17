package pl.mpas.github_rest.dao;

import org.springframework.stereotype.Repository;
import pl.mpas.github_rest.domain.RepositoryInfo;

import java.util.List;

@Repository
public class GithubRestDaoImpl implements GithubRestDao {
    @Override
    public List<RepositoryInfo> getMyRepos() {
        return null;
    }
}
