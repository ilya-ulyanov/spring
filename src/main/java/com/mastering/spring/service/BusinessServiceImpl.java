package com.mastering.spring.service;

import com.mastering.spring.data.Data;
import com.mastering.spring.data.DataService;

public class BusinessServiceImpl {
    private final DataService dataService;

    public BusinessServiceImpl(DataService dataService) {
        this.dataService = dataService;
    }

    public long calculateSum(User user) {
        long sum = 0;
        for (Data data : this.dataService.retrieveData(user)) {
            sum += data.getValue();
        }

        return sum;
    }
}
