package com.cuiqi;

import com.cuiqi.domain.User;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 01439613 on 2016/11/15.
 */
public class JDBCTest {
    public static void main(String[] a){

        Connection conn = getConn();
        String sql = "select * from t_user t where t.id = ?";
        PreparedStatement stat;
        List<User> userList = new ArrayList();
        try {
            stat = conn.prepareStatement(sql);
            stat.execute();
            ResultSet resultSet = stat.getResultSet();
            while(resultSet.next()){
                Class<User> userClass = User.class;
                User user = userClass.newInstance();
                Field[] fields = userClass.getDeclaredFields();
                for(Field field:fields){
                    field.setAccessible(true);
                    Object value;
                    try{
                        value = resultSet.getObject(field.getName());
                    }catch (SQLException e){
                        System.out.println(e.getMessage());
                        continue;
                    }
                    field.set(user,value);
                }
                userList.add(user);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        assert userList != null;
    }

    private static Connection getConn(){
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mbs";
        String username = "root";
        String password = "";
        Connection conn = null;
        try{
            Class.forName(driver); //classLoader,加载对应驱动
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
