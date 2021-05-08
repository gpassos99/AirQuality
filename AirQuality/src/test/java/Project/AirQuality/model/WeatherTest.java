package Project.AirQuality.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WeatherTest {

    @Test
    void testing_ToString() {
        Weather weather = new Weather();
        weather.setCity_name("Porto");
        assertThat(weather.toString()).isEqualTo("Weather{city_name='Porto', mold_level=null, aqi=null, pm10=null, co=null, o3=null, predominant_pollen_type='null', so2=null, pollen_level_tree=null, pollen_level_weed=null, no2=null, pm25=null, pollen_level_grass=null}");
    }
 }
