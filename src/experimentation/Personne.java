package experimentation;

/**
 * Classe représentant une personne avec ses caractéristiques principales.
 * @author RANDRIANARISOA
 */
public class Personne {
    // Attributs
    private String nom;
    private String prenom;
    private String adresse;
    private int age;
    private String sexe;
    private InformationSupplementaire infoSupp;
    
    /**
     * Constructeur pour initialiser une personne avec ses attributs.
     *
     * @param nom      Nom de la personne.
     * @param prenom   Prénom de la personne.
     * @param adresse  Localisation de la personne.
     * @param age      Âge de la personne.
     * @param sexe     Sexe de la personne (M/F).
     * @param infoSupp Informations supplémentaires de la personne.
     */
    public Personne(String nom, String prenom, String adresse, int age, String sexe, InformationSupplementaire infoSupp) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.age = age;
        this.sexe = sexe;
        this.infoSupp = infoSupp;
    }

 // Constructeur par défaut
    public Personne() {
        this.nom = "Inconnu";
        this.prenom = "Inconnu";
        this.adresse = "Inconnu";
        this.age = 0;
        this.sexe = "Inconnu";
        this.infoSupp = new InformationSupplementaire("Inconnu", "Inconnu", "Inconnu");
    }

    // Getters

    /**
     * Récupère le nom de la personne.
     *
     * @return Le nom de la personne.
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Récupère le prénom de la personne.
     *
     * @return Le prénom de la personne.
     */
    public String getPrenom() {
        return this.prenom;
    }

    /**
     * Récupère l'adresse de la personne.
     *
     * @return L'adresse de la personne.
     */
    public String getAdresse() {
        return this.adresse;
    }

    /**
     * Récupère l'âge de la personne.
     *
     * @return L'âge de la personne.
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Récupère le sexe de la personne.
     *
     * @return Le sexe de la personne.
     */
    public String getSexe() {
        return this.sexe;
    }

    // Setters

    /**
     * Modifie le nom de la personne.
     *
     * @param nom Le nouveau nom de la personne.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Modifie le prénom de la personne.
     *
     * @param prenom Le nouveau prénom de la personne.
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Modifie l'adresse de la personne.
     *
     * @param adresse La nouvelle adresse de la personne.
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * Modifie l'âge de la personne.
     *
     * @param age Le nouvel âge de la personne.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Modifie le sexe de la personne.
     *
     * @param sexe Le nouveau sexe de la personne.
     */
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
    /**
     * information suplémentaire
     * @return
     */
    public InformationSupplementaire getInfoSupp() {
        return infoSupp;
    }

    public void setInfoSupp(InformationSupplementaire infoSupp) {
        this.infoSupp = infoSupp;
    }

    /**
     * Affiche les informations de la personne.
     */
    public void information() {
        if ("Unknown".equals(this.nom)) {
            System.out.println("Aucun résultat trouvé");
        } else {
            if (isMasculin()) {
                // Monsieur
                System.out.println("INDIVIDU DE SEXE MASCULIN:\n");
            } else {
                // Madame
                System.out.println("INDIVIDU DE SEXE FÉMININ:\n");
            }
            System.out.println("Nom: " + this.getNom());
            System.out.println("Prénom: " + this.getPrenom());
            System.out.println("Adresse: " + this.getAdresse());
            System.out.println("Âge: " + this.getAge() + " ans");
            System.out.println("Informations supplémentaires: " + infoSupp.toString());
        }
    }

    /**
     * Permet de vérifier si c'est un homme ou une femme.
     *
     * @return true si masculin, false sinon.
     */
    public boolean isMasculin() {
        return "M".equals(this.getSexe());
    }
}
