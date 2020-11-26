package roly.springframework.sfgdi.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware,
        ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("LifeCycleDemoBean - Constructor!");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) {
        System.out.println("LifeCycleDemoBean - Set Bean Factory!");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("LifeCycleDemoBean - Set Bean Name!");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("LifeCycleDemoBean - Bean Destroy!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("LifeCycleDemoBean - After property set!");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        System.out.println("LifeCycleDemoBean - After application context!");
    }

    @PostConstruct
    public void postConstructor() {
        System.out.println("LifeCycleDemoBean - Post Constructor annotation!");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("LifeCycleDemoBean - Pre Destroy annotation!");
    }

}
