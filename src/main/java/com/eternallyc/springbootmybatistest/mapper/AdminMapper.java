package com.eternallyc.springbootmybatistest.mapper;


import com.eternallyc.springbootmybatistest.bean.Admin;
import org.apache.ibatis.annotations.*;

//指定这是一个操作数据库的mapper
@Mapper
public interface AdminMapper {

    @Select("select * from admin where id=#{id}")
    public Admin getAdminById(Integer id);

    @Delete("delete from admin where id=#{id}")
    public int deleteAdminById(Integer id);

    @Insert("insert into admin(username,userpwd) value(#{username},#{userpwd})")
    public int insertAdmin(Admin admin);

    @Update("update admin set username=#{username} where id=#{id}")
    public int updateAdmin(Admin admin);
}
