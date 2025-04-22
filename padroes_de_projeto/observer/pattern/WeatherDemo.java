package observer.pattern;
class WeatherDemo {
    public static void main(String[] args) {
        // Criando o subject (estação)
        WeatherStation station = new WeatherStation();
        
        // Criando observadores
        WeatherDisplay phoneApp = new WeatherDisplay("Aplicativo de Celular");
        WeatherDisplay webSite = new WeatherDisplay("Website");
        WeatherDisplay tvDisplay = new WeatherDisplay("TV da Sala");
        
        // Registrando observadores
        station.registerObserver(phoneApp);
        station.registerObserver(webSite);
        station.registerObserver(tvDisplay);
        
        // Simulando mudança nos dados
        System.out.println("--- Primeira medição ---");
        station.setMeasurements(25.2f, 65.0f, 1013.1f);
        
        // Removendo um display
        station.removeObserver(tvDisplay);
        
        System.out.println("\n--- Segunda medição (sem TV) ---");
        station.setMeasurements(26.7f, 70.0f, 1010.3f);
    }
}