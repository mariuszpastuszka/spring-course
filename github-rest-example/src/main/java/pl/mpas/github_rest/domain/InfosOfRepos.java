package pl.mpas.github_rest.domain;

import java.util.List;

public class InfosOfRepos {
    List<RepositoryInfo> infos;

    public InfosOfRepos() {
        //
    }

    public InfosOfRepos(List<RepositoryInfo> infos) {
        this.infos = infos;
    }

    public List<RepositoryInfo> getInfos() {
        return infos;
    }

    public void setInfos(List<RepositoryInfo> infos) {
        this.infos = infos;
    }

    @Override
    public String toString() {
        return "InfosOfRepos{" +
                "infos=" + infos +
                '}';
    }
}
