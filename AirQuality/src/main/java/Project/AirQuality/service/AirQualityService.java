package Project.AirQuality.service;

import Project.AirQuality.model.City;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.annotation.PostConstruct;

@Service
public class AirQualityService implements IService<City>{

    private UriComponentsBuilder builder;

    @PostConstruct
    protected void init() {

        builder = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("api.weatherbit.io/")
                .path("/v2.0/current/airquality")
                .queryParam("city", "Porto")
                .queryParam("key", "ebb1c7d8ba804ebbad543488a0cdff00");
    }


    @Override
    @Cacheable("cities_info")
    public City getAirQuality(String city_name) {
        String url = builder.replaceQueryParam("city", city_name).build().toUriString();
        return new RestTemplate().getForObject(url, City.class);
    }

}
