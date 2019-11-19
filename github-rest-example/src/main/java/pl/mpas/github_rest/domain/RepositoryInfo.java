package pl.mpas.github_rest.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RepositoryInfo {
    String full_name;
    Owner owner;
    String url;

    public RepositoryInfo() {
    }

    public RepositoryInfo(String full_name, Owner owner, String url) {
        this.full_name = full_name;
        this.owner = owner;
        this.url = url;
    }

    @Override
    public String toString() {
        return "RepositoryInfo{" +
                "full_name='" + full_name + '\'' +
                ", owner=" + owner +
                ", url='" + url + '\'' +
                '}';
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
