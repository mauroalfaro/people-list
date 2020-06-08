package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;
import service.CustomerService;
import service.EmployeeService;
import service.StoreService;

@Configuration
public class PeopleListConfiguration {

    @Bean
    @RequestScope
    public CustomerService customerService(){
        return new CustomerService();
    }

    @Bean
    @RequestScope
    public EmployeeService employeeService(){
        return new EmployeeService();
    }

    @Bean
    @RequestScope
    public StoreService storeService(){
        return new StoreService();
    }
}
