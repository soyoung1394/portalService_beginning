package kr.ac.jejunu;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import java.sql.SQLException;


public class UserDaoTest {
    @Test
    public void get() throws SQLException, ClassNotFoundException {
        kr.ac.jejunu.UserDao userDao = new kr.ac.jejunu.UserDao();
        int id= 1;
        kr.ac.jejunu.User user = userDao.get(id);
        assertThat(user.getId(), is(1));
        assertThat(user.getName(), is("a"));
        assertThat(user.getPassword(), is("1234"));
    }
}