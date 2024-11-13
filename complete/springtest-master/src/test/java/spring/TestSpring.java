package spring;

import org.example.spring.AnnotationConfig;
import org.example.spring.entity.Landlord;
import org.example.spring.entity.Source;
import org.example.spring.entity.Student;
import org.example.spring.service.JuiceMaker;
import org.example.spring.service.ProductService;
import org.example.spring.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shaoqin.zhou@hand-china.com
 * @since 2024-11-07 11:06:19
 */
public class TestSpring {
    /**
     * Inverse of Control
     */
    @Test
    public void testSource() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"applicationContext.xml"}
        );
        Source source = context.getBean("source", Source.class);
        source.setFruit("Banana");

        Source source1 = context.getBean("source", Source.class);
        System.out.println(source);
    }

    /**
     * Dependency Injection
     */
    @Test
    public void testMaker() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"applicationContext.xml"}
        );
        JuiceMaker juiceMaker = context.getBean("juickMaker", JuiceMaker.class);
        System.out.println(juiceMaker.makeJuice());
    }

    /**
     * 事务处理、日志管理、权限控制
     * Transaction, Log, Permission
     * Aspect Oriented Program
     */
    @Test
    public void testAop() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"applicationContext.xml"}
        );
        ProductService productService = context.getBean("productService", ProductService.class);
        productService.doSomeService();
    }

    @Test
    public void testAnnotation() {
        // 1 XML
        ApplicationContext xmlContext = new ClassPathXmlApplicationContext(
                new String[]{"applicationContext.xml"}
        );
        Student student1 = xmlContext.getBean(Student.class);
        System.out.println("Student Info 1: " + String.join(",", String.valueOf(student1.getStuId()), student1.getStuNumber(), student1.getStuName()));

        // 2 Component
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        // Get Bean
        Student student = context.getBean(Student.class);
        System.out.println("Student Info 2: " + String.join(",", String.valueOf(student.getStuId()), student.getStuNumber(), student.getStuName()));
        // DI
        StudentService studentService = context.getBean(StudentService.class);
        System.out.println(studentService.getInformation());
    }

    @Test
    public void testBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext("org.example.spring.entity");
        System.out.println(context.getBean("testBean"));
    }

    /**
     * Use Annotation
     */
    @Test
    public void testAopAnnotation() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        Landlord landlord = context.getBean("landlord", Landlord.class);
        landlord.service();
    }
}
