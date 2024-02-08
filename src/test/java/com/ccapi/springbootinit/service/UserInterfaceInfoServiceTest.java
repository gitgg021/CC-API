package com.ccapi.springbootinit.service;

import com.ccapi.springbootinit.service.impl.UserInterfaceInfoServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.Assert.*;
@SpringBootTest
public class UserInterfaceInfoServiceTest {

    @Resource
    private UserInterfaceInfoServiceImpl userInterfaceInfoService;

    @Test
    public void invokeCount() {
        boolean b = userInterfaceInfoService.invokeCount(1L, 1L);
        Assertions.assertTrue(b);
    }
}