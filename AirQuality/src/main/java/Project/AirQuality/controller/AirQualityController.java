package Project.AirQuality.controller;
import Project.AirQuality.model.City;
import Project.AirQuality.model.Weather;
import Project.AirQuality.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class AirQualityController {

    @Autowired
    private IService<City> Service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "redirect:/AirQuality/Aveiro";
    }

    @RequestMapping(value = "/AirQuality", method = RequestMethod.GET)
    public String airquality() {
        return "redirect:/AirQuality/Aveiro";
    }

    @RequestMapping(value = "/AirQuality/{city_name}", method = RequestMethod.GET)
    public String getAirQuality(Model model, @PathVariable("city_name") String city_name) throws Exception {

        City city = Service.getAirQuality(city_name);
        List<Weather> data = city.getData();

        model.addAttribute("city_name", city_name);
        model.addAttribute("mold_level", level.get(data.get(0).getMold_level()));
        model.addAttribute("aqi", data.get(0).getAqi());
        model.addAttribute("pm10", String.valueOf(data.get(0).getPm10()) + " µg/m³");
        model.addAttribute("co", String.valueOf(data.get(0).getCo()) + " µg/m³");
        model.addAttribute("o3", String.valueOf(data.get(0).getO3()) + " µg/m³");
        model.addAttribute("predominant_pollen_type", data.get(0).getPredominant_pollen_type());
        model.addAttribute("so2", String.valueOf(data.get(0).getSo2()) + " µg/m³");
        model.addAttribute("pollen_level_tree", level.get(data.get(0).getPollen_level_tree()));
        model.addAttribute("pollen_level_weed", level.get(data.get(0).getPollen_level_weed()));
        model.addAttribute("no2", String.valueOf(data.get(0).getNo2()) + " µg/m³");
        model.addAttribute("pm25", String.valueOf(data.get(0).getPm25()) + " µg/m³");
        model.addAttribute("pollen_level_grass", level.get(data.get(0).getPollen_level_grass()));

        return "index";
    }

    private Map<Integer,String> level;
    public AirQualityController(){
        level = new HashMap<>();
        level.put(0, "None");
        level.put(1, "Low");
        level.put(2, "Medium");
        level.put(3, "High");
        level.put(4, "Very High");
    }

    @PostMapping("/citynavigation")
    public String showPage(@ModelAttribute("city") String city) {
        System.out.println(city);
        return "redirect:/AirQuality/"+city;

    }

}
