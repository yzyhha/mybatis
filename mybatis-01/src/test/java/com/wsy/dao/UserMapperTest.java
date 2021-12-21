package com.wsy.dao;

import com.wsy.pojo.User;
import com.wsy.untils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void test() {
//        获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        执行sql
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user:userList
             ) {
            System.out.println(user);
            
        }
//        关闭sqlSession
        sqlSession.close();
    }
    @Test
    public void Test2(){
//        通过工具类获取sqlSession
        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        拿到对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        调用方法
        User user = mapper.getUserById(1);
        System.out.println(user);

        sqlSession.close();

    }
}
