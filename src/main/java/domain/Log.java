package domain;

import java.sql.Timestamp;

public class Log {
    private Integer id;
    private Timestamp login_time;
    private User user;

    public Log() {
    }

    public Log(Timestamp login_time, User user) {
        this.login_time = login_time;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getLogin_time() {
        return login_time;
    }

    public void setLogin_time(Timestamp login_time) {
        this.login_time = login_time;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", login_time=" + login_time +
                ", user=" + user +
                '}';
    }
}
