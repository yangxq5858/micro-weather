package com.hxcoltd.weather.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yxqiang
 * @create 2018-10-28 15:22
 */

@Service
@FeignClient("micro-weather-city-eureka")
public interface CityClient {

    @GetMapping("/cities")
    public String CityList();
}
