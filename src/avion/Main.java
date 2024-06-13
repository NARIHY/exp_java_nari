package avion;

import java.util.Scanner;

/**
 * Classe principale du programme, où l'utilisateur entre les informations sur l'avion et les conditions météo.
 * Elle effectue ensuite la vérification du décollage en utilisant les autres classes du package `avion`.
 */
public class Main {

    /**
     * Méthode principale du programme.
     * 
     * @param args Les arguments de ligne de commande (non utilisés dans cet exemple).
     */
    public static void main(String[] args) {
        // Création d'un scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Saisie des informations sur l'avion
        System.out.println("Entrez les informations sur l'avion \n");
        System.out.print("Modèle : ");
        String modele = scanner.nextLine();
        System.out.print("Poids (en kg) : ");
        double poids = scanner.nextDouble();
        System.out.print("Capacité de passagers : ");
        int capacitePassagers = scanner.nextInt();
        System.out.print("Carburant disponible (en litres) : ");
        double carburantDisponible = scanner.nextDouble();
        scanner.nextLine(); // consomme la nouvelle ligne restante

        // Création de l'objet Avion avec les informations saisies
        Avion avion = new Avion(modele, poids, capacitePassagers, carburantDisponible);

        // Saisie des données météo
        System.out.println("\nEntrez les données météo \n");
        System.out.print("Vitesse du vent (en km/h) : ");
        double vitesseVent = scanner.nextDouble();
        System.out.print("Visibilité (en km) : ");
        double visibilite = scanner.nextDouble();

        // Création de l'objet DonneesMeteo avec les données saisies
        DonneesMeteo meteo = new DonneesMeteo(vitesseVent, visibilite);

        // Vérification du décollage en utilisant la classe VerificateurDecollage
        VerificateurDecollage.peutDecoller(avion, meteo);

        // Fermeture du scanner
        scanner.close();
    }
}
