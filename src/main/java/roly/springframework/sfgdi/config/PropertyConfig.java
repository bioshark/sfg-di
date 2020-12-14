package roly.springframework.sfgdi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import roly.springframework.sfgdi.examplebeans.FakeDataSource;
import roly.springframework.sfgdi.examplebeans.FakeJmsBroker;

@Configuration
public class PropertyConfig {

    @Value("${roly.username}")
    String user;
    @Value("${roly.password}")
    String password;
    @Value("${roly.dburl}")
    String url;
    @Value("${roly.jms.username}")
    String jmsUser;
    @Value("${roly.jms.password}")
    String jmsPassword;
    @Value("${roly.jms.dburl}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUser(jmsUser);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }
}
