package kr.ed.haebeop.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import kr.ed.haebeop.persistence.UserPersistence;
import kr.ed.haebeop.persistence.UserPersistenceImpl;
import kr.ed.haebeop.repository.TestRepository;
import kr.ed.haebeop.repository.TestRepositoryImpl;
import kr.ed.haebeop.service.TestService;
import kr.ed.haebeop.service.TestServiceImpl;
import kr.ed.haebeop.service.UserService;
import kr.ed.haebeop.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
@ComponentScan(basePackages = "kr.ed.haebeop")
public class ApplicationConfig {
    @Bean
    public TestService testService(){ return new TestServiceImpl(); }

    @Bean
    public TestRepository testRepository(){ return new TestRepositoryImpl(); }

    @Bean
    public UserService userService(){ return new UserServiceImpl(); }

    @Bean
    public UserPersistence userPersistence() { return new UserPersistenceImpl(); }

    @Bean
    public SessionLocaleResolver localeResolver() { return new SessionLocaleResolver(); }

    @Bean
    public ObjectMapper objectMapper() { return new ObjectMapper(); }
}
