package com.xkcoding.properties.property;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 项目配置
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-09-29 10:50
 */
@Data
@Component
public class ApplicationProperty {
//@Value和@ConfigurationProperties是两种读取配置文件的方法,可以切换使用
//    如果使用@ConfigurationProperties,类中的属性需要和配置文件中的一致才能够对应上

    @Value("${application.name}")
    private String name;
    @Value("${application.version}")
    private String version;
}
