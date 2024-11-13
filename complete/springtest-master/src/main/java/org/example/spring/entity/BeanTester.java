package org.example.spring.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author shaoqin.zhou@hand-china.com
 * @since 2024-11-10 21:21:42
 */
@Configuration
public class BeanTester {
    @Bean(name = "testBean")
    public String test() {
        String str = "Test @Bean Annotation";
        return str;
    }
}
