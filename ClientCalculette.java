import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Scanner;

public class ClientCalculette {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            CalculatriceRmi calculatrice = (CalculatriceRmi) Naming.lookup("rmi://localhost:1099/CalculatriceRmi");

            while (true) {
                System.out.println(
                        "Choisissez l'opération (1: addition, 2: soustraction, 3: multiplication, 4: division):");
                int operation = scanner.nextInt();

                System.out.println("Entrez le premier nombre:");
                double a = scanner.nextDouble();

                System.out.println("Entrez le deuxième nombre:");
                double b = scanner.nextDouble();

                double resultat = 0;
                switch (operation) {
                    case 1:
                        resultat = calculatrice.addition(a, b);
                        break;
                    case 2:
                        resultat = calculatrice.soustraction(a, b);
                        break;
                    case 3:
                        resultat = calculatrice.multiplication(a, b);
                        break;
                    case 4:
                        resultat = calculatrice.division(a, b);
                        break;
                }

                System.out.println("Le résultat est : " + resultat);

                System.out.println("Voulez-vous arrêter l'exécution ? (o/n)");
                String reponse = scanner.next();
                if (reponse.equalsIgnoreCase("o")) {
                    break;
                }
            }

            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
