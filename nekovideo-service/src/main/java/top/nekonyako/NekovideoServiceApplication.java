package top.nekonyako;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j
@EnableTransactionManagement
@SpringBootApplication
public class NekovideoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NekovideoServiceApplication.class, args);
        log.info("服务器!启动!");
    }

}
