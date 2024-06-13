package avion;

/**
 * Classe contenant la logique pour vérifier si un avion peut décoller en fonction des données météo et des caractéristiques de l'avion.
 * @author RANDRIANARISOA
 */
public class VerificateurDecollage {

    /**
     * Méthode statique pour vérifier si l'avion peut décoller en fonction des conditions météo et des caractéristiques de l'avion.
     * 
     * @param avion L'avion à vérifier.
     * @param meteo Les données météo actuelles.
     * @return true si l'avion peut décoller, false sinon.
     */
    public static boolean peutDecoller(Avion avion, DonneesMeteo meteo) {
        // Vérifier les conditions météo
        if (meteo.getVitesseVent() > 50) { // Exemple de condition : vent trop fort
            System.out.println("Décollage impossible : vent trop fort.");
            return false;
        }
        
        if (meteo.getVisibilite() < 5) { // Exemple de condition : visibilité insuffisante
            System.out.println("Décollage impossible : visibilité insuffisante.");
            return false;
        }

        // Vérifier les conditions de l'avion
        if (avion.getPoids() > 200000) { // Exemple de condition : poids de l'avion trop élevé
            System.out.println("Décollage impossible : poids de l'avion trop élevé.");
            return false;
        }

        if (avion.getCarburantDisponible() < 1000) { // Exemple de condition : carburant insuffisant
            System.out.println("Décollage impossible : carburant insuffisant.");
            return false;
        }

        // Si toutes les conditions sont remplies, l'avion peut décoller
        System.out.println("L'avion " + avion.getModele() + " peut décoller !");
        return true;
    }
}
