package org.example.spring.service;

import org.example.spring.entity.Source;

/**
 * @author shaoqin.zhou@hand-china.com
 * @since 2024-11-10 17:33:46
 */
public class JuiceMaker {
    private Source source;

    /* setter and getter */

    public String makeJuice() {
        return "Order: " + String.join(", ", source.getFruit(), source.getSugar(), source.getSize());
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }
}
