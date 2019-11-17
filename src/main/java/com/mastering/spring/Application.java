package com.mastering.spring;

import com.mastering.spring.service.BusinessServiceImpl;
import com.mastering.spring.service.User;

public class Application {
    public static void main(String[] args) {
        BusinessServiceImpl service = new BusinessServiceImpl();
        System.out.println(service.calculateSum(new User()));
    }
}
