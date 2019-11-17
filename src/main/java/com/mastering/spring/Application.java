package com.mastering.spring;

import com.mastering.spring.config.SpringContextConfiguration;
import com.mastering.spring.service.BusinessService;
import com.mastering.spring.service.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
//        DataService dataService = new DataServiceImpl();
//        BusinessService service = new BusinessServiceImpl(dataService);

        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringContextConfiguration.class);
        BusinessService service = context.getBean(BusinessService.class);
        System.out.println(service.calculateSum(new User()));
    }
}
