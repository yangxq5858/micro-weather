package com.hxcoltd.weather.service;

import com.hxcoltd.weather.vo.WeatherResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author yxqiang
 * @create 2018-10-28 16:53
 */
@Service
@FeignClient("micro-weather-data-eureka")
public interface WeatherDataClient {

    @GetMapping("/weather/cityId/{cityId}")
    public WeatherResponse getDataByCityId(@PathVariable("cityId") String cityId);



}
