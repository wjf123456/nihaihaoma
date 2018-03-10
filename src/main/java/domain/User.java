package domain;

import java.sql.Timestamp;

public class User {
    private Integer id;
    private String email;
    private String pwd;
    private Integer count;
    private Timestamp last_login;

    public User() {
    }

    public User(String email, String pwd, Integer count, Timestamp last_login) {
        this.email = email;
        this.pwd = pwd;
        this.count = count;
        this.last_login = last_login;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Timestamp getLast_login() {
        return last_login;
    }

    public void setLast_login(Timestamp last_login) {
        this.last_login = last_login;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", pwd='" + pwd + '\'' +
                ", count=" + count +
                ", last_login=" + last_login +
                '}';
    }
}
