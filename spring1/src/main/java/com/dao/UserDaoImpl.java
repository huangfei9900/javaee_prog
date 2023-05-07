package com.dao;

import com.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * @author admincoder
 * @create 2023-03-01 21:02
 */
@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void save(){}
    @Override

    public  User selectUser(int id) throws IOException {
      select();
      return null;
    }

    @Override
    public int insertUser(String name,int age,String password) throws IOException {
        insert();
        return 0;
    }



    @Override
    public void deleteUser(int id) throws IOException {
        delete();


    }

    @Override
    public void updateUser(int id,String name,int age,String password) throws IOException {
        System.out.println("更新操作，请输入要操作的id，name,age,password：");
        update();
    }

    public void select() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try (SqlSession session = sqlSessionFactory.openSession(true)) {
            UserDao mapper1 = session.getMapper(UserDao.class);
            Scanner scanner = new Scanner(System.in);
          //  System.out.println("请输入要查询的id：");
            System.out.println("查询结果："+mapper1.selectUser(scanner.nextInt()));

        }
    }
    public void insert() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try (SqlSession session = sqlSessionFactory.openSession(true)) {
            UserDao mapper1 = session.getMapper(UserDao.class);
            Scanner scanner = new Scanner(System.in);
            mapper1.insertUser(scanner.next(),scanner.nextInt(),scanner.next());
        }
    }
    public void delete() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try (SqlSession session = sqlSessionFactory.openSession(true)) {
            UserDao mapper1 = session.getMapper(UserDao.class);
            Scanner scanner = new Scanner(System.in);
            mapper1.deleteUser(scanner.nextInt());
        }
    }
    public void update() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try (SqlSession session = sqlSessionFactory.openSession(true)) {
            UserDao mapper1 = session.getMapper(UserDao.class);
            Scanner scanner = new Scanner(System.in);
            mapper1.updateUser(scanner.nextInt(),scanner.next(),scanner.nextInt(),scanner.next());
        }
    }
}