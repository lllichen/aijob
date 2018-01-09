package fun.aijob.beef;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lichen@daojia.com on 2018-1-9.
 */
@EnableAutoConfiguration
@SpringBootApplication
public class Application {

        public static void main(String[] args) throws Exception {
            SpringApplication.run(Application.class, args);
        }

}


