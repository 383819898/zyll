package cn.lp.zyll;

import cn.lp.zyll.quartz.SpringContextHolder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAsync
@RestController
@SpringBootApplication
public class ZyllApplication {



    public static void main(String[] args) {
        SpringApplication.run(ZyllApplication.class, args);
    }

    /**
     * 访问首页提示
     *
     * @return /
     */
    @RequestMapping("/")
    public String index() {
        return "Backend service started successfully";
    }


    @Bean
    public SpringContextHolder springContextHolder() {
        return new SpringContextHolder();
    }
}
