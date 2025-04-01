package singleton;

public class singleton {
    private static singleton instance;

    private singleton() {
        // construtor privado para garantir que a classe não pode ser instanciada externamente
    }

    public static singleton getInstance() {
        if (instance == null) {
            instance = new singleton();
        }
        return instance;
    }

    public void logMessage(String message) {
        System.out.println("[LOG]: " + message);
    }
}
