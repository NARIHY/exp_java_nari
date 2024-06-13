package voiture;

/**
 * Classe représentant les caractéristiques de confort d'une voiture.
 */
public class Confort {
    private int identifiantConfort;
    private int identifiantVoiture; // Clé étrangère vers Voiture
    private String interieur;
    private String equipements;

    /**
     * Constructeur pour initialiser les caractéristiques de confort d'une voiture.
     *
     * @param identifiantConfort Identifiant unique des caractéristiques de confort.
     * @param identifiantVoiture Identifiant de la voiture associée aux caractéristiques de confort.
     * @param interieur         Description de l'intérieur de la voiture (par exemple, cuir, tissu, etc.).
     * @param equipements       Liste des équipements de confort de la voiture (par exemple, climatisation, sièges chauffants).
     */
    public Confort(int identifiantConfort, int identifiantVoiture, String interieur, String equipements) {
        this.identifiantConfort = identifiantConfort;
        this.identifiantVoiture = identifiantVoiture;
        this.interieur = interieur;
        this.equipements = equipements;
    }

    /**
     * Récupère l'identifiant des caractéristiques de confort.
     *
     * @return L'identifiant des caractéristiques de confort.
     */
    public int getIdentifiantConfort() {
        return identifiantConfort;
    }

    /**
     * Modifie l'identifiant des caractéristiques de confort.
     *
     * @param identifiantConfort Le nouvel identifiant des caractéristiques de confort.
     */
    public void setIdentifiantConfort(int identifiantConfort) {
        this.identifiantConfort = identifiantConfort;
    }

    /**
     * Récupère l'identifiant de la voiture associée aux caractéristiques de confort.
     *
     * @return L'identifiant de la voiture associée.
     */
    public int getIdentifiantVoiture() {
        return identifiantVoiture;
    }

    /**
     * Modifie l'identifiant de la voiture associée aux caractéristiques de confort.
     *
     * @param identifiantVoiture Le nouvel identifiant de la voiture associée.
     */
    public void setIdentifiantVoiture(int identifiantVoiture) {
        this.identifiantVoiture = identifiantVoiture;
    }

    /**
     * Récupère la description de l'intérieur de la voiture.
     *
     * @return La description de l'intérieur de la voiture.
     */
    public String getInterieur() {
        return interieur;
    }

    /**
     * Modifie la description de l'intérieur de la voiture.
     *
     * @param interieur La nouvelle description de l'intérieur de la voiture.
     */
    public void setInterieur(String interieur) {
        this.interieur = interieur;
    }

    /**
     * Récupère la liste des équipements de confort de la voiture.
     *
     * @return La liste des équipements de confort.
     */
    public String getEquipements() {
        return equipements;
    }

    /**
     * Modifie la liste des équipements de confort de la voiture.
     *
     * @param equipements La nouvelle liste des équipements de confort.
     */
    public void setEquipements(String equipements) {
        this.equipements = equipements;
    }

    /**
     * Retourne une représentation textuelle des caractéristiques de confort.
     *
     * @return Une chaîne de caractères représentant les caractéristiques de confort.
     */
    @Override
    public String toString() {
        return "Confort{" +
                "identifiantConfort=" + identifiantConfort +
                ", identifiantVoiture=" + identifiantVoiture +
                ", interieur='" + interieur + '\'' +
                ", equipements='" + equipements + '\'' +
                '}';
    }
}
