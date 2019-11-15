package com.one2one_anno.dao;

import com.one2one_anno.domain.Users;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDAO {
    @Select("select user.* ,c.id cid,c.uid,c.cardnum from user LEFT JOIN card c on user.id = c.uid")
    public List<Users> findByOne2One();
}
