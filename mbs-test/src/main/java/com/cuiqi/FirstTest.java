package com.cuiqi;

import com.alibaba.fastjson.JSON;
import com.cuiqi.domain.Article;
import com.cuiqi.domain.User;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

/**
 * Created by 01439613 on 2016/11/8.
 */
public class FirstTest {
    public static void main(String[] args) throws IOException {
        SqlSession session = SessionUtils.openSession();
        firstTest(session);

    }

    /**
     * 两种执行sql的方式
     * @param session
     */
    private static void firstTest(SqlSession session){

        /**
         * 第一种方式: 直接执行已映射的 SQL 语句
         */
        String statement = "com.cuiqi.dao.UserDao.get";
        User user = session.selectOne(statement, 1);
        System.out.println(user);

        System.out.println("---------------------");

        /**
         * 第二种方式: 执行更清晰和类型安全的代码
         */
//        UserDao userDao = session.getMapper(UserDao.class);
//        user = userDao.get(1);
//        System.out.println(user);
    }

    /**
     * 复杂结果集
     * @param session
     */
    public static void resultMapTest(SqlSession session){
        String statement = "com.cuiqi.dao.ArticleDao.selectList";
        List<Article> articleList = session.selectList(statement);
        print(articleList);

    }

    private static void print(Object obj){
        System.out.println(JSON.toJSONString(obj));
    }
}
