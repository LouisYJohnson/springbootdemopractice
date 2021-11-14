package com.xkcoding.properties.controller;

import cn.hutool.core.lang.Dict;
import com.xkcoding.properties.property.ApplicationProperty;
import com.xkcoding.properties.property.DeveloperProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 测试Controller
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-09-29 10:49
 */
//@RestController是@ResponseBody与@Controller注解的组合
//@RestController是用于创建 Restful 控制器的便捷注解。
// 它是@Component的特长，可通过类路径扫描自动检测。
// 它添加了@Controller和@ResponseBody注解。
// 它将响应转换为 JSON 或 XML。
// 它不适用于视图技术，因此方法无法返回ModelAndView。
// 它通常与基于@RequestMapping注解的注解处理程序方法结合使用。
@RestController
public class PropertyController {
    private final ApplicationProperty applicationProperty;
    private final DeveloperProperty developerProperty;
    // Java变量的初始化顺序为：静态变量或静态语句块–>实例变量或初始化语句块–>构造方法–>@Autowired
    // 在方法上加入@AutoWired注解的意思是构造器注入,在构造方法中,使用已经托管给Spring的Bean
    // 如果@AutoWired放在20,21行的两个类上面,也是不行的,因为Java在最后才加载@AutoWired注解中的内容,
    //      在创建类的时候会找不到这两个类
    //reference:https://www.jianshu.com/p/4501b57df9cd
    //  https://www.pianshen.com/article/8529812221/
    @Autowired
    public PropertyController(ApplicationProperty applicationProperty, DeveloperProperty developerProperty) {
        this.applicationProperty = applicationProperty;
        this.developerProperty = developerProperty;
    }

    @GetMapping("/property")
    public Dict index() {
        return Dict.create().set("applicationProperty", applicationProperty).set("developerProperty", developerProperty);
    }
}
