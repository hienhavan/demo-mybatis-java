package com.example.demo_MyBatis.mybatis;

import com.example.demo_MyBatis.model.UserDao;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapperProvider {
    @SelectProvider(type = UserSqlProvider.class, method = "selectByCondition")
    List<UserDao> findByCondition(Map<String, Object> params);

    @InsertProvider(type = UserSqlProvider.class, method = "insertUser")
    void insert(UserDao user);
}