package com.hxcoltd.weather.job;

import com.hxcoltd.weather.service.CityClient;
import com.hxcoltd.weather.service.WeatherCollectionService;
import com.hxcoltd.weather.vo.City;
import com.netflix.discovery.converters.Auto;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yxqiang
 * @create 2018-10-27 11:34
 */
public class WeatherDataSyncJob extends QuartzJobBean {
    private final static Logger logger = LoggerFactory.getLogger(WeatherDataSyncJob.class);

    @Autowired
    private CityClient cityClient;

    @Autowired
    private WeatherCollectionService weatherCollectionService;
    /* (non-Javadoc)
     * @see org.springframework.scheduling.quartz.QuartzJobBean#executeInternal(org.quartz.JobExecutionContext)
     */
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {

        logger.info("Weather Data Sync Job. Start！");
        // 获取城市ID列表
        List<City> cityList = cityClient.cityList();


        // 遍历城市ID获取天气
        for (City city : cityList) {
            String cityId = city.getCityId();
            logger.info("Weather Data Sync Job, cityId:" + cityId);

            weatherCollectionService.SyncDataByCityId(cityId);
        }

        logger.info("Weather Data Sync Job. End！");
    }
}
