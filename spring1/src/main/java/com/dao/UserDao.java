package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.*;

import java.io.IOException;

/**
 * @author admincoder
 * @create 2023-03-01 20:56
 */
public interface UserDao {

    @Select("select * from user where id = #{id}")
    User selectUser(int id) throws IOException;
    @Insert("insert into user (name,age,password) values (#{name},#{age},#{password})")
    int insertUser(@Param("name") String name, @Param("age") int age,@Param("password") String password) throws IOException;

    @Delete("delete from user where id =#{id}")
    void deleteUser(int id) throws IOException;
    @Update("update user set name = #{name},age=#{age} ,password=#{password} where id = #{id}")
    void updateUser(@Param("id") int id, @Param("name") String name, @Param("age") int age, @Param("password") String password) throws IOException;
    void save();



}
