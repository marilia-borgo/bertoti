class AntiPatternDemo {
    public static void main(String[] args) {
        WeatherStationCoupled station = new WeatherStationCoupled();
        
        WeatherDisplayCoupled phoneApp = new WeatherDisplayCoupled("Aplicativo de Celular");
        WeatherDisplayCoupled webSite = new WeatherDisplayCoupled("Website");
        WeatherDisplayCoupled tvDisplay = new WeatherDisplayCoupled("TV da Sala");
        
        station.setDisplays(phoneApp, webSite, tvDisplay);
        
        System.out.println("--- Primeira medição ---");
        station.setMeasurements(25.2f, 65.0f, 1013.1f);
        
        station.removeDisplay("TV da Sala");
        
        System.out.println("\n--- Segunda medição (sem TV) ---");
        station.setMeasurements(26.7f, 70.0f, 1010.3f);
    }
}           