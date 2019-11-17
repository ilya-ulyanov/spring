package com.mastering.spring.service;

import com.mastering.spring.data.Data;
import com.mastering.spring.data.DataServiceImpl;

public class BusinessServiceImpl {
    public long calculateSum(User user) {
        DataServiceImpl dataService = new DataServiceImpl();
        long sum = 0;
        for (Data data : dataService.retrieveData(user)) {
            sum += data.getValue();
        }

        return sum;
    }
}
