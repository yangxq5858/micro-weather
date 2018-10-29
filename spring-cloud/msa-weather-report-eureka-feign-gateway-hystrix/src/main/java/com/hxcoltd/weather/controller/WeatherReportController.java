package com.hxcoltd.weather.controller;

import com.hxcoltd.weather.service.DataClient;
import com.hxcoltd.weather.service.WeatherReportService;
import com.hxcoltd.weather.vo.City;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

/**
 * Weather Report Controller.
 * 
 * @since 1.0.0 2017年11月24日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@RestController
@RequestMapping("/report")
public class WeatherReportController {
	private final static Logger logger = LoggerFactory.getLogger(WeatherReportController.class);
	@Autowired
	private WeatherReportService weatherReportService;

	@Autowired
	private DataClient dataClient;
	
//	@GetMapping("/cityId/{cityId}")
	@RequestMapping(value = {"/cityId/{cityId}", "/cityId"}, method = RequestMethod.GET)
	public ModelAndView getReportByCityId(@PathVariable(required = false)  String cityId, Model model) throws Exception {
//		System.out.println("---cityId--"+ cityId);

		// 获取城市ID列表
		List<City> cityList = dataClient.listCity();

		if (cityId == null) cityId = "101270101";
		model.addAttribute("title", "老杨的天气预报");
		model.addAttribute("cityId", cityId);
		model.addAttribute("cityList", cityList);
		model.addAttribute("report", weatherReportService.getDataByCityId(cityId));
		return new ModelAndView("weather/report", "reportModel", model);
	}

}
