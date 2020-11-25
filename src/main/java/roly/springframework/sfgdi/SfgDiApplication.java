package roly.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import roly.springframework.sfgdi.controllers.ConstructorInjectedController;
import roly.springframework.sfgdi.controllers.MyController;
import roly.springframework.sfgdi.controllers.PropertyInjectedController;
import roly.springframework.sfgdi.controllers.SetterInjectedController;

import java.util.Arrays;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");

        String greeting = myController.sayHello();

        System.out.println(greeting);

        System.out.println("------------------------ PROPERTY ------------------");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("------------------------ SETTER ------------------");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

        System.out.println(setterInjectedController.getGreeting());

        System.out.println("------------------------ CONSTRUCTOR ------------------");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());

//        System.out.println("------------AVAILABLE BEANS ------------");
//        Arrays.stream(ctx.getBeanDefinitionNames())
//                .forEach(System.out::println);




    }

}
