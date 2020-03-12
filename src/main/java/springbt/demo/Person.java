package springbt.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
/**
 * 将配置的属性赋值过来
 *ConfigurationProperties 告诉spring组件绑定 application.yml 里面前缀为 person的 属性
 *@Component 注册为spring组件
 */
@Component
@ConfigurationProperties(prefix="person")
public class Person {
    private String name;
    private int age;
    private boolean boos;
    private Date birth;

    private Map<String,Object> maps;
    private List<Object> lists;

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", boos=" + boos +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBoos(boolean boos) {
        this.boos = boos;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    private Dog dog;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isBoos() {
        return boos;
    }

    public Date getBirth() {
        return birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public Dog getDog() {
        return dog;
    }
}
