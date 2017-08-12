package mybatis;

import org.dao.UserDao;
import org.domain.TbUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations ={"classpath:application.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class MybaitisTest {
    @Autowired
    @Qualifier("userdao")
    private UserDao userDao;
    @Test
    public void SelectUser(){
        TbUser user = userDao.selectUser();
        System.out.println(user.getUsername());
        if(userDao.queryByLoginname("546837635@qq.com","123456")){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
