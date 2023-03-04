import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat beancat =
                (Cat) applicationContext.getBean("cat");
        Cat beancat1 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean.getMessage());
        System.out.println(bean2.getMessage());
        System.out.println(bean.equals(bean2));

        System.out.println(beancat.getMessage());
        System.out.println(beancat1.getMessage());
        System.out.println(beancat.equals(beancat1));
    }
}