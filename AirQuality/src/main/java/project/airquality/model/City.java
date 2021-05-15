package project.airquality.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "data",
        "city_name",
        "lon",
        "timezone",
        "lat",
        "country_code",
        "state_code"
})
public class City {

    @JsonProperty("data")
    private java.util.List<Weather> data = null;

    @JsonProperty("data")
    public List<Weather> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<Weather> data) {
        this.data = data;
    }



    @Override
    public String toString() {
        return "City{" +
                "data=" + data +
                '}';
    }
}