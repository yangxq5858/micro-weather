package com.hxcoltd.weather.service;

import com.hxcoltd.weather.vo.City;
import com.hxcoltd.weather.vo.WeatherResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author yxqiang
 * @create 2018-10-28 17:07
 */

@Service
@FeignClient("micro-weather-eureka-client-zuul")
public interface DataClient {

    /**
     * 获取城市列表
     * @return
     * @throws Exception
     */
    @GetMapping("city/cities")
    List<City> listCity() throws Exception;

    /**
     * 根据城市id查询天气信息
     * @param cityId
     * @return
     */
    @GetMapping("data/weather/cityId/{cityId}")
    public WeatherResponse getDataByCityId(@PathVariable("cityId") String cityId);

}