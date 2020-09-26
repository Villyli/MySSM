package com.villy.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

//建设工厂
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            //第一步//获取sqlSessionFactory
            String resource= "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //获取 SqlSession
    public static SqlSession getSqlSession (){
            /*SqlSession sqlSession = sqlSessionFactory.openSession();
            return sqlSession;*/
        /*简化为*/
        return sqlSessionFactory.openSession();
    }
}
