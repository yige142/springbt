package springbt.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import springbt.dao.EmployeeDao;
import springbt.domain.Employ;


@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    //引入数据连接池
    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * 添加员工
     * @param employ
     *
     *
     * @return
     */

    @Override
    public int add(Employ employ) {

        //定义sql
        String sql="insert into employ (id,name,department,sex,intro,creatdate,img) values(?,?,?,?,?,?,?)";
        int count=  jdbcTemplate.update(sql,null,
                employ.getName(),
                employ.getDepartment(),
                employ.getSex(),
                employ.getIntro(),
                employ.getCreatdate(),
                employ.getImg()
        );
       return count;

    }
}
