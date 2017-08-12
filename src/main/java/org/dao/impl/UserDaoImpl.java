package org.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.dao.UserDao;
import org.domain.TbUser;
import org.springframework.stereotype.Service;
import org.utils.MybatisUtil;

@Service("userdao")
public class UserDaoImpl implements UserDao {
    SqlSession sqlSession;
    @Override
    public TbUser selectUser() {
        sqlSession = MybatisUtil.getSqlSession();
        TbUser user = null;
        try {
            user = sqlSession.selectOne("selectByPrimaryKey",1);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            MybatisUtil.closeSession(sqlSession);
        }
        return user;
    }

    @Override
    public boolean queryByLoginname(String loginname, String password) {
        sqlSession = MybatisUtil.getSqlSession();
        TbUser user = null;
        try {
            user = sqlSession.selectOne("selectByloginname",loginname);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            MybatisUtil.closeSession(sqlSession);
        }
        if(user.getLoginname().equals(loginname)&&user.getPassword().equals(password)){
            return true;
        }else{
            return false;
        }
    }
}
