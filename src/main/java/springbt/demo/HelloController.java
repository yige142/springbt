package springbt.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * 测试访问hello能否修改数据库数据F
     *
     * @return
     */
    @RequestMapping("/hello")
    public String hello() {
        String sql = "update c_tt set name=? where id=3";
        int count = jdbcTemplate.update(sql, "kdd3");
        System.out.print(count);
        return "333";
    }
}
