package Project.AirQuality.service;

import Project.AirQuality.model.Response;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.annotation.PostConstruct;

@Service
public class AirQualityService implements IService<Response>{

    private UriComponentsBuilder urlb;

    @PostConstruct
    protected void init() {

        urlb = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("api.weatherbit.io/")
                .path("/v2.0/current/airquality")
                .queryParam("city", "Porto")
                .queryParam("key", "ebb1c7d8ba804ebbad543488a0cdff00");
    }


    @Override
    @Cacheable("city_airquality")
    public Response getAirQuality(String city_name) {
        String url = urlb.replaceQueryParam("city", city_name).build().toUriString();
        return new RestTemplate().getForObject(url, Response.class);
    }

}
