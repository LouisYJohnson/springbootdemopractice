package com.xkcoding.helloworld;

import cn.hutool.core.util.StrUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * SpringBoot启动类
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-09-28 14:49
 */
@SpringBootApplication
@RestController
public class SpringBootDemoHelloworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoHelloworldApplication.class, args);
    }

    /**
     * Hello，World
     *
     * @param realWho 参数，非必须
     * @return Hello, ${realWho}
     */
    // @GetMapping表示将方法映射到/hello下面,和yml中的配置组合在一起就是'localhost:8080/demo/hello'
    @GetMapping("/hello")
    //  @RequestParam参数:
    //  required参数让传入的参数变为可选的,如果不传入,也不会报错
    //  name参数让url中的传入参数名和变量名可以进行映射,
    //      拼接的url如下所示:localhost:8080/demo/hello?who=me
    //      who接受的参数会传给realWho这个参数作为方法的入参
    //reference:https://www.baeldung.com/spring-request-param
    public String sayHello(@RequestParam(required = false, name = "who") String realWho) {
        // 这个判断其实可以省去,使用@RequesParam中的defaultValue="World",这样,即使不输入who这个参数,也会返回结果
        // 在添加defaultValue后拼接的url为'localhost:8080/demo/hello'
        if (StrUtil.isBlank(realWho)) {
            realWho = "World";
        }
        return StrUtil.format("Hello, {}!", realWho);
    }
}
