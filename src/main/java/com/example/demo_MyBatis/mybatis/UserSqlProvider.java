package com.example.demo_MyBatis.mybatis;

import com.example.demo_MyBatis.model.UserDao;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;


public class UserSqlProvider {
    public static String selectByCondition(Map<String, Object> params) {
        StringBuilder sql = new StringBuilder("SELECT * FROM users WHERE 1=1");
        if (params.get("name") != null) {
            sql.append(" AND name = #{name}");
        }
        if (params.get("email") != null) {
            sql.append(" AND email = #{email}");
        }
        return sql.toString();
    }

    public String insertUser(UserDao user) {
        return new SQL() {{
            INSERT_INTO("users");
            if (user.getName() != null) {
                VALUES("name", "#{name}");
            }
            if (user.getEmail() != null) {
                VALUES("email", "#{email}");
            }
        }}.toString();
    }
}