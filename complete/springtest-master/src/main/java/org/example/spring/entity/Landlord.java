package org.example.spring.entity;

import org.springframework.stereotype.Component;

/**
 * @author shaoqin.zhou@hand-china.com
 * @since 2024-11-10 22:04:08
 */
@Component
public class Landlord {
    public void service() {
        // core business functions
        System.out.println("sign contract");
        System.out.println("collect rent");
    }
}
