
import java.util.*;
/**
 * Un petit test avec helloWorld
 * @author RANDRIANARISOA
 */
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Création d'un scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir son nom
        System.out.println("Veuillez saisir votre nom :");
        String name = scanner.nextLine();

        // Affiche un message de bienvenue
        System.out.println("Bonjour, " + name + " ! Bienvenue dans votre première application Java");
        
        // Fermeture du scanner
        scanner.close();
	}

}
