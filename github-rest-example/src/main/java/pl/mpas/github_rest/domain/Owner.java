package pl.mpas.github_rest.domain;

public class Owner {
    String avatar_url;

    public Owner(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "avatar_url='" + avatar_url + '\'' +
                '}';
    }
}