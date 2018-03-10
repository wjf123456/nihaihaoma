package reporsitory;

import domain.User;

import java.util.List;

public interface Userreporsitory {
    List<User> list();
    void save(User user);
    String getEmail(String email);
    void update(User user);
    User get(User user);
}
