package springbt.demo;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import springbt.utils.DruidDataS;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;


@SpringBootTest
class DemoApplicationTests {

    //测试日志功能
    Logger logger= LoggerFactory.getLogger(getClass());
    @Test
    public void test6(){
        //日志级别由高到低
        //error>info>debug>trace
        logger.trace("trace运行日志");
        logger.info("info日志");
        logger.error("错误日志");
    }









    @Autowired
     Person p;

    //测试是否输出yml配置属性
    @Test
    void test1() {
        System.out.println(p);
    }


    //测试是否输出dog类
    @Autowired
    Dog dog;
    @Test
    void test2(){
        System.out.println(dog.getName());
    }


    //测试添加@bean 能否从spring context容器中获取到
    @Test
    void test3(){
        Dog dog =new Dog();
        System.out.println(dog.getName());
    }


    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    //测试是否连接druid
    @Test
    void test4() throws SQLException {
        System.out.println(dataSource.getClass());

        Connection conn=dataSource.getConnection();

        System.out.println(conn);
        conn.close();

    }

    //测试连接上druid能否从mysql里取数据
    @Test
    void test5() throws SQLException {
        System.out.println(dataSource.getClass());
       // Connection conn=dataSource.getConnection();


        String sql="update c_tt set name=? where id=3";
        int count=jdbcTemplate.update(sql,"kdd");
        System.out.print(count);
        System.out.print(dataSource);
        System.out.print(jdbcTemplate);
        System.out.print(jdbcTemplate);
       // conn.close();
    }

}
