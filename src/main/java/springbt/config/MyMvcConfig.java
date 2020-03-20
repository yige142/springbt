package springbt.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.LocaleResolver;
import springbt.component.MyLocalResolver;

/**
 * @author Hasee
 */
@Configuration
public class MyMvcConfig{
    /**
     * 把切换国际化的功能加入到spring容器中
     */
    @Bean
    public LocaleResolver localeResolver(){
        return  new MyLocalResolver();
    }
}
