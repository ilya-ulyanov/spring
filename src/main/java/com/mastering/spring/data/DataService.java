package com.mastering.spring.data;

import com.mastering.spring.service.User;

import java.util.List;

public interface DataService {
    List<Data> retrieveData(User user);
}
