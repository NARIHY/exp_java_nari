package experimentation;

/**
 * Classe représentant des informations supplémentaires pour une personne.
 * @author RANDRIANARISOA
 */
public class InformationSupplementaire {
    private String numeroTelephone;
    private String adresseEmail;
    private String profession;

    /**
     * Constructeur pour initialiser les informations supplémentaires.
     *
     * @param numeroTelephone Numéro de téléphone de la personne.
     * @param adresseEmail    Adresse email de la personne.
     * @param profession      Profession de la personne.
     */
    public InformationSupplementaire(String numeroTelephone, String adresseEmail, String profession) {
        this.numeroTelephone = numeroTelephone;
        this.adresseEmail = adresseEmail;
        this.profession = profession;
    }

    // Getters
    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public String getAdresseEmail() {
        return adresseEmail;
    }

    public String getProfession() {
        return profession;
    }

    // Setters
    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public void setAdresseEmail(String adresseEmail) {
        this.adresseEmail = adresseEmail;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Téléphone: " + numeroTelephone + ", Email: " + adresseEmail + ", Profession: " + profession;
    }
}
