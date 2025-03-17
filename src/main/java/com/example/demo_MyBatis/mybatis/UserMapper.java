package com.example.demo_MyBatis.mybatis;

import com.example.demo_MyBatis.model.UserDao;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM \"UserDao\"")
    List<UserDao> selectAllUsers();

    @Select("SELECT * FROM \"UserDao\" WHERE id = #{id}")
    UserDao selectUserById(int id);

    @Delete("Delete from \"UserDao\" where id = #{id}")
    void deleteUserById(int id);

    @Update("UPDATE \"UserDao\" SET name = #{name}, email = #{email} WHERE id = #{id}")
    UserDao updateUser(UserDao user);

    @Insert("INSERT INTO \"UserDao\" (name, email) VALUES (#{name}, #{email})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertUser(UserDao user);
}
