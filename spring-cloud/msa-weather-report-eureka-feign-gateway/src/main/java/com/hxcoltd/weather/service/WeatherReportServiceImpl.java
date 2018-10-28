package com.hxcoltd.weather.service;

import com.hxcoltd.weather.vo.Forecast;
import com.hxcoltd.weather.vo.Weather;
import com.hxcoltd.weather.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * Weather Report Service.
 * 
 * @since 1.0.0 2017年11月24日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {

	@Autowired
	private DataClient dataClient;

	@Override
	public Weather getDataByCityId(String cityId) {
        //改为天气数据api服务来提供
		WeatherResponse weatherResponse = dataClient.getDataByCityId(cityId);
		return weatherResponse.getData();
	}

}
