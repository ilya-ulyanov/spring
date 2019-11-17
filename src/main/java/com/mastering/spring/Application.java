package com.mastering.spring;

import com.mastering.spring.data.DataService;
import com.mastering.spring.data.DataServiceImpl;
import com.mastering.spring.service.BusinessServiceImpl;
import com.mastering.spring.service.User;

public class Application {
    public static void main(String[] args) {
        DataService dataService = new DataServiceImpl();
        BusinessServiceImpl service = new BusinessServiceImpl(dataService);
        System.out.println(service.calculateSum(new User()));
    }
}
