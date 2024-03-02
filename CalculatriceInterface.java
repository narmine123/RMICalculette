import java.rmi.Remote;

public interface CalculatriceInterface extends Remote {
    // Définition des méthodes à exposer via RMI
    public int addition(int a, int b);

    public int soustraction(int a, int b);

    public int multiplication(int a, int b);

    public int division(int a, int b);
}
