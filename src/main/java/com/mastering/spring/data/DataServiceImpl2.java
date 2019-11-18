package com.mastering.spring.data;

import com.mastering.spring.service.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Qualifier("secondaryDataService")
@Repository
public class DataServiceImpl2 implements DataService {
    @Override
    public List<Data> retrieveData(User user) {
        return Arrays.asList(new Data(20));
    }
}
