package com.xkcoding.properties.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 开发人员配置信息
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-09-29 10:51
 */
//@Data源自于lombok包,
// @Data : 注解在类上, 为类提供读写属性,
// 此外还提供了 equals()、hashCode()、toString() 方法
@Data
//将指定前缀的配合信息注入到bean中，
// spring boot 1.5版本以前可以通过location属性指定配置文件路径，
// 1.5以后configurationProperties删除了location属性，可以用@PropertySource来指定要读取的配置文件。
// reference:https://blog.csdn.net/xdkb159/article/details/79359331
@ConfigurationProperties(prefix = "developer")
@Component
public class DeveloperProperty {
    private String name;
    private String website;
    private String qq;
    private String phoneNumber;
}
