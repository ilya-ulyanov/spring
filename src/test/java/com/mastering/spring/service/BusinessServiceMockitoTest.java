package com.mastering.spring.service;

import com.mastering.spring.data.Data;
import com.mastering.spring.data.DataService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class BusinessServiceMockitoTest {
    @Mock
    private DataService dataService;

    @InjectMocks
    private BusinessService businessService = new BusinessServiceImpl();

    @Test
    public void testCalculateSum() {
        BDDMockito.given(
                dataService.retrieveData(ArgumentMatchers.any())
        ).willReturn(
                Arrays.asList(
                        new Data(10),
                        new Data(20),
                        new Data(30)
                )
        );

        long sum = this.businessService.calculateSum(new User());
        assertThat(sum, is(60L));
    }
}