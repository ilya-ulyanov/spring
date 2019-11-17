package com.mastering.spring.data;

import com.mastering.spring.service.User;

import java.util.Arrays;
import java.util.List;

public class DataServiceImpl implements DataService {
    @Override
    public List<Data> retrieveData(User user) {
        return Arrays.asList(new Data(10));
    }
}
