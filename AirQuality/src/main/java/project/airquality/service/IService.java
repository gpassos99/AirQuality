package project.airquality.service;

public interface IService<T> {

    T getAirQuality(String city) throws Exception;

}
