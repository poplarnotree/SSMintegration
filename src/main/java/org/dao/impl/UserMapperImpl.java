package org.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.dao.UserDao;
import org.dao.UserMapper;
import org.domain.TbUser;
import org.utils.MybatisUtil;

public class UserMapperImpl {
    SqlSession sqlSession;

    public boolean queryUserLogin(String loginname, String password) {
        sqlSession = MybatisUtil.getSqlSession();
        TbUser user = null;
        try {
            MybatisUtil.getSqlSessionFactory().getConfiguration().addMapper(UserMapper.class);
            UserMapper um = sqlSession.getMapper(UserMapper.class);
            user = um.queryUserLogin(loginname);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MybatisUtil.closeSession(sqlSession);
        }
        if (user.getLoginname().equals(loginname)&&user.getPassword().equals(password)){
            return true;
        }else {
            return false;
        }
    }
}
