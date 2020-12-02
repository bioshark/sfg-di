package roly.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import roly.springframework.sfgdi.controllers.ConstructorInjectedController;
import roly.springframework.sfgdi.controllers.MyController;
import roly.springframework.sfgdi.controllers.PropertyInjectedController;
import roly.springframework.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
            ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

            MyController controller = (MyController) ctx.getBean("myController");

            System.out.println(controller.hello());
            System.out.println(ctx.getBean(PropertyInjectedController.class).getGreeting());
            System.out.println(ctx.getBean(SetterInjectedController.class).getGreeting());
            System.out.println(ctx.getBean(ConstructorInjectedController.class).getGreeting());

    }

}
