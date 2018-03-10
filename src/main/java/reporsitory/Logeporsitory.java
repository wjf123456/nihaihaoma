package reporsitory;

import domain.Log;
import domain.User;

import java.util.List;

public interface Logeporsitory {
    List<Log> list();
    List<Log> select(User user);
    void save(Log log);
}
