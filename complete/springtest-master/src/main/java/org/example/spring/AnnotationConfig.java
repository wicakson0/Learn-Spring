package org.example.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author shaoqin.zhou@hand-china.com
 * @since 2024-11-10 20:26:05
 */
//@ComponentScan(basePackages = {"org.example.entity"})
//@ComponentScan(basePackageClasses = {org.example.entity.Student.class})
@ComponentScan
@EnableAspectJAutoProxy
public class AnnotationConfig {
}
