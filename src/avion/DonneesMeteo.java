package avion;

/**
 * Classe représentant les données météorologiques nécessaires à la vérification du décollage.
 */
public class DonneesMeteo {
    private double vitesseVent;  // Vitesse du vent en km/h
    private double visibilite;   // Visibilité en km

    /**
     * Constructeur de la classe DonneesMeteo.
     * 
     * @param vitesseVent Vitesse du vent en km/h.
     * @param visibilite  Visibilité en km.
     */
    public DonneesMeteo(double vitesseVent, double visibilite) {
        this.vitesseVent = vitesseVent;
        this.visibilite = visibilite;
    }

    /**
     * Getter pour la vitesse du vent.
     * 
     * @return La vitesse du vent en km/h.
     */
    public double getVitesseVent() {
        return vitesseVent;
    }

    /**
     * Getter pour la visibilité.
     * 
     * @return La visibilité en km.
     */
    public double getVisibilite() {
        return visibilite;
    }
}
