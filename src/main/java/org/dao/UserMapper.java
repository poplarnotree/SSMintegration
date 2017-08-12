package org.dao;

import org.apache.ibatis.annotations.Select;
import org.domain.TbUser;

public interface UserMapper {
    @Select("SELECT * FROM tb_user WHERE loginname = #{loginname}")
    public TbUser queryUserLogin(String loginname);
}
