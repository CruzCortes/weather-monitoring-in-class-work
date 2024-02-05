package edu.iu.habahram.weathermonitoring.model;

import org.springframework.stereotype.Component;

@Component
public class StatisticsDisplay implements Observer, DisplayElement {

    // TODO
    private String id;
    private String name;

    public StatisticsDisplay() {
        this.id = "statistics";
        this.name = "Statistics Screen";
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        // Update display if needed
    }

    public String display() {
        // Hardcoded weather data for now
        return "<html><body>" +
                "<h1>Weather Statistics</h1>" +
                "<p>Average Temperature: 0</p>" +
                "<p>Minimum Temperature: 0</p>" +
                "<p>Maximum Temperature: 78</p>" +
                "</body></html>";
    }

    public String id() {
        return id;
    }

    public String name() {
        return name;
    }


}
