import com.mapper.UserMapper;
import com.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try (SqlSession session = sqlSessionFactory.openSession(true)) {
            UserMapper mapper = session.getMapper(UserMapper.class);




            /*Scanner sc = new Scanner(System.in);
            System.out.println("输入用户名");
            String userName = sc.next();
            User user = mapper.getUserPassword(userName);
            System.out.println("输入密码");
            int password = sc.nextInt();
            User checkName = mapper.getUserName(password);
            String check = checkName.getName();
            if (check.equals(userName)) {
                System.out.println("登录成功");
            }
            else {
                System.out.println("登录失败");
            }*/

        }

    }

}
