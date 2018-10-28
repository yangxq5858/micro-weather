package com.hxcoltd.weather.service;

import com.hxcoltd.weather.vo.City;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author yxqiang
 * @create 2018-10-28 16:43
 */

@FeignClient("micro-weather-city-eureka")
public interface CityClient {

    @GetMapping("/cities")
    public List<City> cityList();
}
