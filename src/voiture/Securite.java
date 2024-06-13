package voiture;

/**
 * Classe représentant les caractéristiques de sécurité d'une voiture.
 * @author RANDRIANARISOA
 */
public class Securite {
    private int identifiantSecurite;
    private int identifiantVoiture; // Clé étrangère vers Voiture
    private String equipements;
    private String resultatsTests;

    /**
     * Constructeur pour initialiser les caractéristiques de sécurité.
     *
     * @param identifiantSecurite Identifiant unique de la sécurité.
     * @param identifiantVoiture  Identifiant de la voiture associée.
     * @param equipements         Équipements de sécurité de la voiture.
     * @param resultatsTests      Résultats des tests de sécurité de la voiture.
     */
    public Securite(int identifiantSecurite, int identifiantVoiture, String equipements, String resultatsTests) {
        this.identifiantSecurite = identifiantSecurite;
        this.identifiantVoiture = identifiantVoiture;
        this.equipements = equipements;
        this.resultatsTests = resultatsTests;
    }

    // Getters et setters avec commentaires Javadoc pour chaque méthode

    /**
     * Récupère l'identifiant de sécurité.
     *
     * @return L'identifiant de sécurité.
     */
    public int getIdentifiantSecurite() {
        return identifiantSecurite;
    }

    /**
     * Modifie l'identifiant de sécurité.
     *
     * @param identifiantSecurite Le nouvel identifiant de sécurité.
     */
    public void setIdentifiantSecurite(int identifiantSecurite) {
        this.identifiantSecurite = identifiantSecurite;
    }

    /**
     * Récupère l'identifiant de la voiture associée.
     *
     * @return L'identifiant de la voiture.
     */
    public int getIdentifiantVoiture() {
        return identifiantVoiture;
    }

    /**
     * Modifie l'identifiant de la voiture associée.
     *
     * @param identifiantVoiture Le nouvel identifiant de la voiture.
     */
    public void setIdentifiantVoiture(int identifiantVoiture) {
        this.identifiantVoiture = identifiantVoiture;
    }

    /**
     * Récupère les équipements de sécurité de la voiture.
     *
     * @return Les équipements de sécurité.
     */
    public String getEquipements() {
        return equipements;
    }

    /**
     * Modifie les équipements de sécurité de la voiture.
     *
     * @param equipements Les nouveaux équipements de sécurité.
     */
    public void setEquipements(String equipements) {
        this.equipements = equipements;
    }

    /**
     * Récupère les résultats des tests de sécurité de la voiture.
     *
     * @return Les résultats des tests de sécurité.
     */
    public String getResultatsTests() {
        return resultatsTests;
    }

    /**
     * Modifie les résultats des tests de sécurité de la voiture.
     *
     * @param resultatsTests Les nouveaux résultats des tests de sécurité.
     */
    public void setResultatsTests(String resultatsTests) {
        this.resultatsTests = resultatsTests;
    }
}
