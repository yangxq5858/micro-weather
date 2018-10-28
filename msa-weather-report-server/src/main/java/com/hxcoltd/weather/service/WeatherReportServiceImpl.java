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

	@Override
	public Weather getDataByCityId(String cityId) {
		//改为天气数据api服务来提供
		Weather data = new Weather();
		data.setAqi("81");
		data.setCity("成都");
		data.setGanmao("容易感冒");
		data.setWendu("20");
		List<Forecast> forecastList = new ArrayList<>();
		Forecast forecast = new Forecast();
		forecast.setDate("28星期一");
		forecast.setType("晴");
		forecast.setFengxiang("小风");
		forecast.setHigh("高温 24");
		forecast.setLow("低温 14");
		forecastList.add(forecast);

		forecast = new Forecast();
		forecast.setDate("29星期一");
		forecast.setType("晴");
		forecast.setFengxiang("小风");
		forecast.setHigh("高温 24");
		forecast.setLow("低温 14");
		forecastList.add(forecast);

		forecast = new Forecast();
		forecast.setDate("30星期一");
		forecast.setType("晴");
		forecast.setFengxiang("小风");
		forecast.setHigh("高温 24");
		forecast.setLow("低温 14");
		forecastList.add(forecast);

		forecast = new Forecast();
		forecast.setDate("31星期一");
		forecast.setType("晴");
		forecast.setFengxiang("小风");
		forecast.setHigh("高温 24");
		forecast.setLow("低温 14");
		forecastList.add(forecast);



		data.setForecast(forecastList);

		return data;
	}

}
