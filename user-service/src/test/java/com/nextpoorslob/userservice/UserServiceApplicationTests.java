package com.nextpoorslob.userservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

@SpringBootTest
class UserServiceApplicationTests {

    @Autowired
    private UserServiceApplication application;

    @Test
    void contextLoads() {
        assertThat(application, notNullValue());
    }

}
