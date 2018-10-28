package com.hxcoltd.weather.controller;

import com.hxcoltd.weather.service.CityDataService;
import com.hxcoltd.weather.vo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yxqiang
 * @create 2018-10-28 10:35
 */

@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private CityDataService cityDataService;

    @GetMapping
    public List<City> cityList() throws Exception {
        return cityDataService.listCity();


    }
}
