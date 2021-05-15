package project.airquality.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WeatherTest {

    private Weather weather;

    @BeforeEach
    void setup(){
        weather = new Weather();
    }

    @Test
    void City_name(){
        weather.setCity_name("Aguda");
        assertEquals("Aguda", weather.getCity_name());
    }

    @Test
    void MoldLevel(){
        weather.setMold_level(1);
        assertEquals(1, weather.getMold_level());
    }

    @Test
    void Aqi(){
        weather.setAqi(1.1);
        assertEquals(1.1, weather.getAqi());
    }

    @Test
    void Pm25(){
        weather.setPm25(1.1);
        assertEquals(1.1, weather.getPm25());
    }

    @Test
    void Predominant_pollen_type(){
        weather.setPredominant_pollen_type("grass");
        assertEquals("grass" , weather.getPredominant_pollen_type());
    }

    @Test
    void So2(){
        weather.setSo2(1.1);
        assertEquals(1.1, weather.getSo2());
    }

    @Test
    void Pm10(){
        weather.setPm10(1.1);
        assertEquals(1.1, weather.getPm10());
    }

    @Test
    void Co(){
        weather.setCo(1.1);
        assertEquals(1.1, weather.getCo());
    }

    @Test
    void No2(){
        weather.setNo2(1.1);
        assertEquals(1.1, weather.getNo2());
    }

    @Test
    void O3(){
        weather.setO3(1.1);
        assertEquals(1.1, weather.getO3());
    }

    @Test
    void Pollen_level_weed(){
        weather.setPollen_level_weed(1);
        assertEquals(1, weather.getPollen_level_weed());
    }

    @Test
    void Pollen_level_grass(){
        weather.setPollen_level_grass(1);
        assertEquals(1, weather.getPollen_level_grass());
    }

    @Test
    void Pollen_level_tree(){
        weather.setPollen_level_tree(1);
        assertEquals(1, weather.getPollen_level_tree());
    }

    @Test
    void testing_ToString() {
        Weather weather = new Weather();
        weather.setCity_name("Porto");
        assertThat(weather.toString()).hasToString("Weather{city_name='Porto', mold_level=null, aqi=null, pm10=null, co=null, o3=null, predominant_pollen_type='null', so2=null, pollen_level_tree=null, pollen_level_weed=null, no2=null, pm25=null, pollen_level_grass=null}");
    }
 }
