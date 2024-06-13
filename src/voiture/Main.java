package voiture;

public class Main {

    public static void main(String[] args) {
        // Création d'une voiture fictive pour tester
        Voiture voiture = new Voiture(1, "Toyota Camry", "Essence", 2.5, 178, 230, 210, 6.5, 1500, 500, 4850, 1825, 1445, 2700,
                "Automatique", 8, "Sedan", "Indépendante", 120);

        // Affichage des détails de la voiture
        afficherDetailsVoiture(voiture);
    }

    /**
     * Méthode pour afficher les détails d'une voiture.
     *
     * @param voiture La voiture dont les détails seront affichés.
     */
    public static void afficherDetailsVoiture(Voiture voiture) {
        System.out.println("Détails de la voiture :");
        System.out.println("Modèle : " + voiture.getModele());
        System.out.println("Type de moteur : " + voiture.getTypeMoteur());
        System.out.println("Puissance : " + voiture.getPuissance() + " chevaux");
        System.out.println("Vitesse maximale : " + voiture.getVitesseMax() + " km/h");
        System.out.println("Consommation de carburant : " + voiture.getConsommationCarburant() + " L/100km");
        // Afficher d'autres attributs de la voiture selon les besoins
        System.out.println();
    }
}
