import java.rmi.*;
import java.rmi.server.*;

public class CalculatriceServeur extends UnicastRemoteObject implements CalculatriceInterface {
    public CalculatriceServeur() throws RemoteException {
        super(); // Appelle le constructeur de la classe mère UnicastRemoteObject
    }

    // Implémentation des méthodes de l'interface CalculatriceInterface
    // Effectue l'addition
    public int addition(int a, int b) {
        return a + b;
    }

    // Effectue la soustraction
    public int soustraction(int a, int b) {
        return a - b;
    }

    // Effectue la multiplication
    public int multiplication(int a, int b) {
        return a * b;
    }

    // Effectue la division et Lance une exception si division par zéro
    public int division(int a, int b)  {
        if (b == 0) {
            throw new RemoteException("Division par zéro !");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            // Crée une instance du serveur de calculatrice
            CalculatriceServeur serveur = new CalculatriceServeur();
            // Enregistrement du serveur dans le registry RMI sous le nom "Calculatrice"
            Naming.rebind("Calculatrice", serveur);
            // Message de confirmation du démarrage du serveur
            System.out.println("Serveur prêt");
            // Affiche une erreur en cas de problème
        } catch (Exception e) {
            System.err.println("Erreur : " + e);
        }
    }
}
