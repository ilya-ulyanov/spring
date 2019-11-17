package com.mastering.spring.data;

import com.mastering.spring.service.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class DataServiceImpl implements DataService {
    @Override
    public List<Data> retrieveData(User user) {
        return Arrays.asList(new Data(10));
    }
}
