package springbt.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.LocaleResolver;
import springbt.component.MyLocalResolver;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Controller
//@RestController
public class IndexController {

//    @Bean
//    public LocaleResolver localeResolver(){
//        return  new MyLocalResolver();
//    }

    @RequestMapping(value = {"/login","/login.html"})
    public String login(Model model) {

        //会输出到页面
        model.addAttribute("aa","是否输出");
        return "login";
    }


    @RequestMapping("/home")
    public String home(Model model) {
        User user = new User();
        user.setUsername("jack");
        user.setPassword("112233");
        user.setHobbies(Arrays.asList(new String[]{"singing", "dancing", "football"}));
        Map<String, String> maps = new HashMap<>();
        maps.put("1", "o");
        maps.put("2", "g");
        maps.put("3", "a");
        maps.put("4", "j");
        user.setSecrets(maps);
        model.addAttribute("user", user);
        return "home";
    }

    @RequestMapping(value = {"/index","/index.html"})
    public String index(Model model) {
        return "index";
    }

    /**
     * 测试thymleaf 模板语法
     * @return
     */
    @RequestMapping("/tt")
    public String tt(Model model){
        User user = new User();
        user.setUsername("jack");
        user.setPassword("112233");
        user.setHobbies(Arrays.asList(new String[]{"singing", "dancing", "football"}));
        Map<String, String> maps = new HashMap<>();
        maps.put("1", "o");
        maps.put("2", "g");
        maps.put("3", "a");
        maps.put("4", "j");
        user.setSecrets(maps);
        model.addAttribute("user", user);
        return "tt";
    }

    /**
     * 测试thymleaf 模板语法
     * @return
     */
    @RequestMapping("/cc")
    public String cc(Model model){
        String aa="123";
        //不加model html出Thymleaf语法不识别
        model.addAttribute("aa", aa);
        return "cc";
    }
}
