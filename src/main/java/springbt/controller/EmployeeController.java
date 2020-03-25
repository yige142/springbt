package springbt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import springbt.domain.Employ;
import springbt.service.impl.EmployeeServiceImpl;

import java.io.File;
import java.io.IOException;

/**
 * 员工控制器  分层 controller--service--entity-- dao
 * @author xyz
 */
@Controller
public class EmployeeController {
    @RequestMapping(value = {"/employee/getlist","/employee/getlist.html"})
    public String getlist(Model model) {

        //会输出到页面
        model.addAttribute("aa","是否输出");
        return "employee_list";
    }


    @RequestMapping(value = {"/employee/toadd","/employee/toadd.html"})
    public String toadd(Model model) {

        //会输出到页面
        model.addAttribute("aa","是否输出");
        return "employee_add";
    }
    @Autowired
    EmployeeServiceImpl employeeService;

    @PostMapping("/employee/add")
    public String add(@RequestParam("file") MultipartFile file,Employ employ) throws IOException {

        //文件名
        String fileName = file.getOriginalFilename();
        //上传文件不为空执行
        if(!fileName.isEmpty()){
            //上传路径
            String filePath = "F://images/";

            File dest = new File(filePath + fileName);
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdirs();
            }
            try {
                file.transferTo(dest);
            } catch (IOException e) {
                e.printStackTrace();
            }
            //保存的路径 filename
            String filename = "/images/" + fileName;

            System.out.println(fileName);
            System.out.println(filePath);
            System.out.println(filename);
        }

        System.out.println(employ);

        employeeService.add(employ);
        //会输出到页面
        //model.addAttribute("aa","是否输出");
        return "redirect:getlist";
    }
}
