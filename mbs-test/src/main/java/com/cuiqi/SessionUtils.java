package com.cuiqi;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by 01439613 on 2016/11/14.
 */
public class SessionUtils {
    public static SqlSession openSession() throws IOException {

        String resouce = "conf.xml";
        //InputStream is = TestMain.class.getClassLoader().getResourceAsStream(resouce);
        InputStream is;
        is = Resources.getResourceAsStream(resouce);

        // 构建sqlSession工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        return sqlSessionFactory.openSession();
    }
}
