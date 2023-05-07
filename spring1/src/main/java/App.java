import com.dao.*;
import com.mapper.UserMapper;
import com.mysql.cj.AbstractQuery;
import com.mysql.cj.protocol.a.MysqlBinaryValueDecoder;
import com.pojo.User;
import com.service.UserService;
import com.service.UserServiceImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

/**
 * @author admincoder
 * @create 2023-03-01 20:55
 */
public class App {
    public static void main(String[] args)throws IOException {
        // UserService userService=new UserServiceImpl();
        //   userService.save();
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

       // String path = "D:/log.txt";
        //String content = null;

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        UserDao userDao = context.getBean("userDao", UserDao.class);
        //userDao.save();
        //MyProxy jdkProxy=new MyProxy();
        // UserDao userDao=new UserDaoImpl();
        // UserDao userDao1=(UserDao) jdkProxy.createProxy(userDao);
        //userDao1.save ();
        //UserService userService= (UserService) context.getBean("userService");
        //userService.save();
           /* try {
                String i = "";
                if (i == null) {
                    System.out.println("111");
                    content = "hello  你好!天天向上!";
                }
                String[] strings = {"1", "2", "3"};
*/
        System.out.println("请输入数字：1：增加");
        System.out.println("请输入数字：2：删除");
        System.out.println("请输入数字：3：修改");
        System.out.println("请输入数字：4：查询");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        if (p == 1) {

            System.out.println("插入操作,请输入要操作的name,age,password：");
           userDao.insertUser("ddf",22,"923");
            System.out.println();

        } else if (p == 2) {
            System.out.println("请输入要删除的ID");
            //int del = sc.nextInt();
            userDao.deleteUser(12);
            System.out.println("删除成功！");
        } else if (p == 3) {
            userDao.updateUser(1,"jj",23,"29343");
            System.out.println("修改成功");
        } else if (p == 4) {
            System.out.println("请输入要查询的ID");
            //int id = sc.nextInt();
            userDao.selectUser(1);
            System.out.println("查询成功");

        } else {
            System.out.println("error");
        }

              /*  List<String> list = new ArrayList<>();
                list.add("1");
                list.add("2");
                list.add("3");
                for (String j : list) {
                    System.out.println(j);
                }
                String j = list.get(3);
            } catch (Exception e) {
                content = e.getClass().getName() + "  error Info  " + e.getMessage();
                content = e.getMessage();
            }
            Log_Exception le = new Log_Exception();
            le.writeEror_to_txt(path, content);*/
        }


    }


