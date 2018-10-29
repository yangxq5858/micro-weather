package com.hxcoltd.weather.service;

import com.hxcoltd.weather.vo.City;
import com.hxcoltd.weather.vo.WeatherResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yxqiang
 * @create 2018-10-29 20:55
 */
@Component
public class DefaultDataClient implements DataClient {
    @Override
    public List<City> listCity() throws Exception {
        //这里模拟一个数据返回
        List<City> cityList = null;
        cityList = new ArrayList<>();

        City city = new City();
        city.setCityId("101270101");
        city.setCityName("成都");
        cityList.add(city);

        city = new City();
        city.setCityId("101270102");
        city.setCityName("龙泉驿");
        cityList.add(city);

        return cityList;
    }

    @Override
    public WeatherResponse getDataByCityId(String cityId) {
        //这个对象太复杂，就直接返回null了。
        return null;
    }
}
