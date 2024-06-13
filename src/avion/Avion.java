package avion;

/**
 * Classe représentant un avion avec ses caractéristiques de base.
 */
public class Avion {
    private String modele;               // Modèle de l'avion
    private double poids;                // Poids de l'avion en kg
    private int capacitePassagers;       // Capacité maximale de passagers
    private double carburantDisponible;  // Quantité de carburant disponible en litres

    /**
     * Constructeur de la classe Avion.
     * 
     * @param modele               Modèle de l'avion.
     * @param poids                Poids de l'avion en kg.
     * @param capacitePassagers    Capacité maximale de passagers.
     * @param carburantDisponible Quantité de carburant disponible en litres.
     */
    public Avion(String modele, double poids, int capacitePassagers, double carburantDisponible) {
        this.modele = modele;
        this.poids = poids;
        this.capacitePassagers = capacitePassagers;
        this.carburantDisponible = carburantDisponible;
    }

    /**
     * Getter pour le modèle de l'avion.
     * 
     * @return Le modèle de l'avion.
     */
    public String getModele() {
        return modele;
    }

    /**
     * Getter pour le poids de l'avion.
     * 
     * @return Le poids de l'avion en kg.
     */
    public double getPoids() {
        return poids;
    }

    /**
     * Getter pour la capacité maximale de passagers de l'avion.
     * 
     * @return La capacité maximale de passagers.
     */
    public int getCapacitePassagers() {
        return capacitePassagers;
    }

    /**
     * Getter pour la quantité de carburant disponible dans l'avion.
     * 
     * @return La quantité de carburant disponible en litres.
     */
    public double getCarburantDisponible() {
        return carburantDisponible;
    }
}
