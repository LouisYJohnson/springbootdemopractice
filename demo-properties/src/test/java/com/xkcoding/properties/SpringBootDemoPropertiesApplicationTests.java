package com.xkcoding.properties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoPropertiesApplicationTests {

    @Test
    public void contextLoads() {
    }
    @Test
    public void test1(){
        Integer a = 100;
        Integer b = 100;
        Integer c = 999;
        Integer d = 999;
        System.out.print(a.equals(b));
        System.out.printf("");
    }
}
