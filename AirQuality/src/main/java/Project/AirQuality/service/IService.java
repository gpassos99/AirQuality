package Project.AirQuality.service;

public interface IService<T> {

    public T getAirQuality(String city) throws Exception;

}
