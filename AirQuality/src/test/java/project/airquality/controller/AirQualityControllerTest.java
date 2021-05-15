package project.airquality.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class AirQualityControllerTest {

    @Autowired
    AirQualityController controller;

    @Test
    void AirQualityController(){
        controller = new AirQualityController();
        String result = controller.airquality();
        assertEquals("redirect:/AirQuality/Aveiro", result);
    }

    @Test
    void IndexController(){
        controller = new AirQualityController();
        String result = controller.index();
        assertEquals("redirect:/AirQuality/Aveiro", result);
    }

    @Test
    void testing_city_request(){
        controller = new AirQualityController();
        String city = "London";
        String result = controller.showPage(city);
        assertEquals("redirect:/AirQuality/"+city, result);
    }


}

