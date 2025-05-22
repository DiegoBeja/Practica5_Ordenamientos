public class Fila{
    private String date;
    private String summary;
    private String precipType;
    private double temperature;
    private double apparentTemperature;
    private double humidity;
    private double windSpeed;
    private double windBearig;
    private double visibility;
    private double loudCover;
    private double pressure;
    private String dailySummary;


    public Fila(String date, String summary, String precipType, double temperature, double apparentTemperature, double humidity, double windSpeed, double windBearig, double visibility, double loudCover, double pressure, String dailySummary) {
        this.date = date;
        this.summary = summary;
        this.precipType = precipType;
        this.temperature = temperature;
        this.apparentTemperature = apparentTemperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.windBearig = windBearig;
        this.visibility = visibility;
        this.loudCover = loudCover;
        this.pressure = pressure;
        this.dailySummary = dailySummary;
    }

    public String getDate() {
        return date;
    }

    public String getSummary() {
        return summary;
    }

    public String getPrecipType() {
        return precipType;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getApparentTemperature() {
        return apparentTemperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public double getWindBearing() {
        return windBearig;
    }

    public double getVisibility() {
        return visibility;
    }

    public double getLoudCover() {
        return loudCover;
    }

    public double getPressure() {
        return pressure;
    }

    public String getDailySummary() {
        return dailySummary;
    }
}
