package boot.activemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication	// 启动SpringBoot程序，而后自带子包扫描
@EnableTransactionManagement
@ComponentScan(basePackages = {"boot.activemq.dao","boot.activemq.service","boot.activemq.controller","boot.activemq.config"})
public class BootActivemqController {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(BootActivemqController.class, args);
    }
}
