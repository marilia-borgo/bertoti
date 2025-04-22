class WeatherDisplayCoupled {
    private String name;
    
    public WeatherDisplayCoupled(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void display(float temp, float humidity, float pressure) {
        System.out.println(name + " - Nova atualização: " +
                         "Temperatura: " + temp + "°C, " +
                         "Umidade: " + humidity + "%, " +
                         "Pressão: " + pressure + " hPa");
    }
}
