package voiture;

/**
 * Classe représentant une voiture avec ses caractéristiques principales.
 * @author RANDRIANARISOA
 */
public class Voiture {
    private int identifiantVoiture;
    private String modele;
    private String typeMoteur;
    private double cylindree;
    private double puissance;
    private double couple;
    private double vitesseMax;
    private double consommationCarburant;
    private double poidsVide;
    private double chargeUtile;
    private double longueur;
    private double largeur;
    private double hauteur;
    private double empattement;
    private String typeTransmission;
    private int nombreVitesses;
    private String typeChassis;
    private String systemeSuspension;
    private double emissionsCO2;

    /**
     * Constructeur pour initialiser une voiture avec ses attributs.
     *
     * @param identifiantVoiture    Identifiant unique de la voiture.
     * @param modele                Modèle de la voiture.
     * @param typeMoteur            Type de moteur de la voiture.
     * @param cylindree             Cylindrée du moteur de la voiture.
     * @param puissance             Puissance du moteur de la voiture.
     * @param couple                Couple du moteur de la voiture.
     * @param vitesseMax            Vitesse maximale de la voiture.
     * @param consommationCarburant Consommation de carburant de la voiture.
     * @param poidsVide             Poids à vide de la voiture.
     * @param chargeUtile           Charge utile de la voiture.
     * @param longueur              Longueur de la voiture.
     * @param largeur               Largeur de la voiture.
     * @param hauteur               Hauteur de la voiture.
     * @param empattement           Empattement de la voiture.
     * @param typeTransmission      Type de transmission de la voiture.
     * @param nombreVitesses        Nombre de vitesses de la voiture.
     * @param typeChassis           Type de châssis de la voiture.
     * @param systemeSuspension     Système de suspension de la voiture.
     * @param emissionsCO2          Émissions de CO2 de la voiture.
     */
    public Voiture(int identifiantVoiture, String modele, String typeMoteur, double cylindree, double puissance, double couple,
                   double vitesseMax, double consommationCarburant, double poidsVide, double chargeUtile, double longueur, double largeur,
                   double hauteur, double empattement, String typeTransmission, int nombreVitesses, String typeChassis, String systemeSuspension,
                   double emissionsCO2) {
        this.identifiantVoiture = identifiantVoiture;
        this.modele = modele;
        this.typeMoteur = typeMoteur;
        this.cylindree = cylindree;
        this.puissance = puissance;
        this.couple = couple;
        this.vitesseMax = vitesseMax;
        this.consommationCarburant = consommationCarburant;
        this.poidsVide = poidsVide;
        this.chargeUtile = chargeUtile;
        this.longueur = longueur;
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.empattement = empattement;
        this.typeTransmission = typeTransmission;
        this.nombreVitesses = nombreVitesses;
        this.typeChassis = typeChassis;
        this.systemeSuspension = systemeSuspension;
        this.emissionsCO2 = emissionsCO2;
    }

    /**
     * Récupère l'identifiant de la voiture.
     *
     * @return L'identifiant de la voiture.
     */
    public int getIdentifiantVoiture() {
        return identifiantVoiture;
    }

    /**
     * Modifie l'identifiant de la voiture.
     *
     * @param identifiantVoiture Le nouvel identifiant de la voiture.
     */
    public void setIdentifiantVoiture(int identifiantVoiture) {
        this.identifiantVoiture = identifiantVoiture;
    }

    /**
     * Récupère le modèle de la voiture.
     *
     * @return Le modèle de la voiture.
     */
    public String getModele() {
        return modele;
    }

    /**
     * Modifie le modèle de la voiture.
     *
     * @param modele Le nouveau modèle de la voiture.
     */
    public void setModele(String modele) {
        this.modele = modele;
    }

    /**
     * Récupère le type de moteur de la voiture.
     *
     * @return Le type de moteur de la voiture.
     */
    public String getTypeMoteur() {
        return typeMoteur;
    }

    /**
     * Modifie le type de moteur de la voiture.
     *
     * @param typeMoteur Le nouveau type de moteur de la voiture.
     */
    public void setTypeMoteur(String typeMoteur) {
        this.typeMoteur = typeMoteur;
    }

    /**
     * Récupère la cylindrée du moteur de la voiture.
     *
     * @return La cylindrée du moteur de la voiture.
     */
    public double getCylindree() {
        return cylindree;
    }

    /**
     * Modifie la cylindrée du moteur de la voiture.
     *
     * @param cylindree La nouvelle cylindrée du moteur de la voiture.
     */
    public void setCylindree(double cylindree) {
        this.cylindree = cylindree;
    }

    /**
     * Récupère la puissance du moteur de la voiture.
     *
     * @return La puissance du moteur de la voiture.
     */
    public double getPuissance() {
        return puissance;
    }

    /**
     * Modifie la puissance du moteur de la voiture.
     *
     * @param puissance La nouvelle puissance du moteur de la voiture.
     */
    public void setPuissance(double puissance) {
        this.puissance = puissance;
    }

    /**
     * Récupère le couple du moteur de la voiture.
     *
     * @return Le couple du moteur de la voiture.
     */
    public double getCouple() {
        return couple;
    }

    /**
     * Modifie le couple du moteur de la voiture.
     *
     * @param couple Le nouveau couple du moteur de la voiture.
     */
    public void setCouple(double couple) {
        this.couple = couple;
    }

    /**
     * Récupère la vitesse maximale de la voiture.
     *
     * @return La vitesse maximale de la voiture.
     */
    public double getVitesseMax() {
        return vitesseMax;
    }

    /**
     * Modifie la vitesse maximale de la voiture.
     *
     * @param vitesseMax La nouvelle vitesse maximale de la voiture.
     */
    public void setVitesseMax(double vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    /**
     * Récupère la consommation de carburant de la voiture.
     *
     * @return La consommation de carburant de la voiture.
     */
    public double getConsommationCarburant() {
        return consommationCarburant;
    }

    /**
     * Modifie la consommation de carburant de la voiture.
     *
     * @param consommationCarburant La nouvelle consommation de carburant de la voiture.
     */
    public void setConsommationCarburant(double consommationCarburant) {
        this.consommationCarburant = consommationCarburant;
    }

    /**
     * Récupère le poids à vide de la voiture.
     *
     * @return Le poids à vide de la voiture.
     */
    public double getPoidsVide() {
        return poidsVide;
    }

    /**
     * Modifie le poids à vide de la voiture.
     *
     * @param poidsVide Le nouveau poids à vide de la voiture.
     */
    public void setPoidsVide(double poidsVide) {
        this.poidsVide = poidsVide;
    }

    /**
     * Récupère la charge utile de la voiture.
     *
     * @return La charge utile de la voiture.
     */
    public double getChargeUtile() {
        return chargeUtile;
    }

    /**
     * Modifie la charge utile de la voiture.
     *
     * @param chargeUtile La nouvelle charge utile de la voiture.
     */
    public void setChargeUtile(double chargeUtile) {
        this.chargeUtile = chargeUtile;
    }

    /**
     * Récupère la longueur de la voiture.
     *
     * @return La longueur de la voiture.
     */
    public double getLongueur() {
        return longueur;
    }

    /**
     * Modifie la longueur de la voiture.
     *
     * @param longueur La nouvelle longueur de la voiture.
     */
    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }
}
