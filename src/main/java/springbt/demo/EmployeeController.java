package springbt.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 员工控制器  分层 controller--service--entity-- dao
 * @author xyz
 */
@Controller
public class EmployeeController {
    @RequestMapping(value = {"/employee/getlist","/employee/getlist.html"})
    public String login(Model model) {

        //会输出到页面
        model.addAttribute("aa","是否输出");
        return "employee_list";
    }
}
