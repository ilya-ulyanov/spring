package com.mastering.spring.data;

import com.mastering.spring.service.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataServiceImpl2 implements DataService {
    @Override
    public List<Data> retrieveData(User user) {
        return null;
    }
}
