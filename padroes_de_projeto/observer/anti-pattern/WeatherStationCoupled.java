// Anti-pattern simplificado - com acoplamento forte
class WeatherStationCoupled {
    // Referências diretas para cada display - acoplamento forte
    private WeatherDisplayCoupled phoneApp;
    private WeatherDisplayCoupled webSite;
    private WeatherDisplayCoupled tvDisplay;
    
    // Dados meteorológicos
    private float temperature;
    private float humidity;
    private float pressure;
    
    // Método para adicionar displays específicos
    public void setDisplays(WeatherDisplayCoupled phoneApp, 
                           WeatherDisplayCoupled webSite, 
                           WeatherDisplayCoupled tvDisplay) {
        this.phoneApp = phoneApp;
        this.webSite = webSite;
        this.tvDisplay = tvDisplay;
    }
    
    // Método para remover um display específico
    public void removeDisplay(String displayName) {
        if (phoneApp != null && phoneApp.getName().equals(displayName)) {
            phoneApp = null;
        } else if (webSite != null && webSite.getName().equals(displayName)) {
            webSite = null;
        } else if (tvDisplay != null && tvDisplay.getName().equals(displayName)) {
            tvDisplay = null;
        }
    }
    
    // Método que atualiza os dados e notifica cada display manualmente
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        
        // Notificação manual para cada display
        if (phoneApp != null) {
            phoneApp.display(temperature, humidity, pressure);
        }
        if (webSite != null) {
            webSite.display(temperature, humidity, pressure);
        }
        if (tvDisplay != null) {
            tvDisplay.display(temperature, humidity, pressure);
        }
    }
}
