package gx.dao;

import gx.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class LoginTest {


    @Test
    public void LoginTest() throws IOException {
//1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
//2.创建 SqlSessionFactory 的构建者对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//3.使用构建者创建工厂对象 SqlSessionFactory
        SqlSessionFactory factory = builder.build(in);
//4.使用 SqlSessionFactory 生产 SqlSession 对象
        SqlSession session = factory.openSession();
//5.使用 SqlSession 创建 dao 接口的代理对象
        IUserDao userDao = session.getMapper(IUserDao.class);
//6.使用代理对象执行查询所有方法
/*
        List<User> users = userDao.findAll();
        for(User user : users) {
*/
        List<User> users = userDao.findAll();
        for(User user : users) {
            System.out.println(user.toString());
        }
//7.释放资源
        session.close();
        in.close();
    }
}
