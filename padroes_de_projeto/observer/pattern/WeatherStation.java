package observer.pattern;
import java.util.ArrayList;
import java.util.List;
public class WeatherStation {
    
    private List<Observer> observers = new ArrayList<>();
    
    // Dados meteorológicos
    private float temperature;
    private float humidity;
    private float pressure;
    
    // Registra um novo observador
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    
    // Remove um observador
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    
    // Notifica todos os observadores
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }
    
    // Atualiza os dados e notifica os observadores
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}