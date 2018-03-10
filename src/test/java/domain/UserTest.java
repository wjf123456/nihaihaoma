package domain;

import config.RootConfig;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import reporsitory.Logeporsitory;
import reporsitory.Userreporsitory;
import service.SignInService;
import service.impl.LoginServiceImpl;
//import service.impl.UserDaoImplService;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Scanner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( classes = RootConfig.class)
public class UserTest {
   // @Autowired
//    private UserDaoImplService userDaoImplService;
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Autowired
    private LoginServiceImpl loginService;

    @Test
    public  void test(){
   SqlSession sqlSession=sqlSessionFactory.openSession();
   //sqlSession.getMapper(Userreporsitory.class)
            //  .list().forEach(e->System.out.println(e));
//      Userreporsitory userreporsitory= sqlSession.getMapper(Userreporsitory.class);
     User user=new User("87356511@qq.co","123456",2,new Timestamp(System.currentTimeMillis()));
//      User u=new User();
//      u.setId(1);
    //    Log log=new Log(new Timestamp(System.currentTimeMillis()),u);
   //     sqlSession.getMapper(Logeporsitory.class).save(log);
// userreporsitory.save(user);
//        User user=new User();
//        user.setId(1);
//        userreporsitory.update(user);
       //sqlSession.getMapper(Logeporsitory.class) .list().forEach(e->System.out.println(e));
   //     sqlSession.getMapper(Logeporsitory.class).list().forEach(e->System.out.println(e));

//        userDaoImplService.save(user);
//        userDaoImplService.list().forEach(e-> System.out.println(e));
        loginService.login(user);


        sqlSession.getMapper(Userreporsitory.class)
                .list().forEach(e->System.out.println(e));






        sqlSession.close();
    }

}