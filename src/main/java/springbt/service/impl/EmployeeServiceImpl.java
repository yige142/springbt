package springbt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springbt.dao.EmployeeDao;
import springbt.domain.Employ;
import springbt.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public boolean add(Employ employ) {

       int a= employeeDao.add(employ);
       if(a>0){
           System.out.println(a);
           System.out.println("新增成功");
           return true;
       }else{
           return false;
       }

    }
}
