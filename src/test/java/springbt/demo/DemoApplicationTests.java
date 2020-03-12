package springbt.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class DemoApplicationTests {

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

}
