package org.dao;

import org.apache.ibatis.annotations.Select;
import org.domain.TbUser;


public interface UserDao {
    public TbUser selectUser();
    public boolean queryByLoginname(String loginname,String password);
    }
