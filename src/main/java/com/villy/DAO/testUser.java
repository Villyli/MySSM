package com.villy.DAO;

import com.villy.utils.MybatisUtils;
import com.villy.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/*
增删改需要提交事务（注意）
 */
public class testUser {
    @Test
    public void test(){
        //获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行sql
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userDao.getUserList();
        for (User user : userList) {
            System.out.println(user.getCounts());
        }
        //关闭资源
        sqlSession.close();
    }
}





