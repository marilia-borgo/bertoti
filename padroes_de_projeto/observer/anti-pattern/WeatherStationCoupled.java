// Classe que representa a estação meteorológica (sujeito)
public class WeatherStationCoupled {
    // A estação conhece diretamente os displays
    private WeatherDisplayCoupled phoneDisplay;
    private WeatherDisplayCoupled webDisplay;
    private WeatherDisplayCoupled tvDisplay;

    // Define os displays que vão receber atualizações
    public void setDisplays(WeatherDisplayCoupled phone, WeatherDisplayCoupled web, WeatherDisplayCoupled tv) {
        this.phoneDisplay = phone;
        this.webDisplay = web;
        this.tvDisplay = tv;
    }

    // Atualiza os dados e notifica cada display manualmente
    public void updateWeatherData(float temperature, float humidity, float pressure) {
        if (phoneDisplay != null) {
            phoneDisplay.showData(temperature, humidity, pressure);
        }

        if (webDisplay != null) {
            webDisplay.showData(temperature, humidity, pressure);
        }

        if (tvDisplay != null) {
            tvDisplay.showData(temperature, humidity, pressure);
        }
    }

    // Remove um display manualmente com base no nome
    public void removeDisplay(String displayName) {
        if (phoneDisplay != null && phoneDisplay.getDisplayName().equals(displayName)) {
            phoneDisplay = null;
        } else if (webDisplay != null && webDisplay.getDisplayName().equals(displayName)) {
            webDisplay = null;
        } else if (tvDisplay != null && tvDisplay.getDisplayName().equals(displayName)) {
            tvDisplay = null;
        }
    }
}
