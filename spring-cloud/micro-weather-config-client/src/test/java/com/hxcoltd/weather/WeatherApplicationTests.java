package com.hxcoltd.weather;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WeatherApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Value("${auther}")
    private String auther;
    @Test
    public void testConfigFromCenter(){
        assertEquals("yxqiang",auther);
    }
}
