package experimentation;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant une base de données de personnes.
 * @author RANDRIANARISOA
 */
public class BaseDeDonneesPersonnes {
    private List<Personne> personnes;

    /**
     * Constructeur pour initialiser la base de données de personnes.
     */
    public BaseDeDonneesPersonnes() {
        this.personnes = new ArrayList<>();
    }

    /**
     * Ajoute une nouvelle personne à la base de données.
     *
     * @param nom      Nom de la personne.
     * @param prenom   Prénom de la personne.
     * @param adresse  Adresse de la personne.
     * @param age      Âge de la personne.
     * @param sexe     Sexe de la personne (M/F).
     * @param infoSupp Informations supplémentaires de la personne.
     */
    public void ajouterPersonne(String nom, String prenom, String adresse, int age, String sexe, InformationSupplementaire infoSupp) {
        Personne nouvellePersonne = new Personne(nom, prenom, adresse, age, sexe, infoSupp);
        this.personnes.add(nouvellePersonne);
    }

    /**
     * Affiche toutes les personnes présentes dans la base de données.
     */
    public void afficherToutesLesPersonnes() {
        for (Personne personne : personnes) {
            personne.information();
            System.out.println("-----------");
        }
    }

    /**
     * Recherche une personne par son nom.
     *
     * @param nom Nom de la personne à rechercher.
     * @return La personne trouvée ou null si aucune correspondance.
     */
    public Personne rechercherParNom(String nom) {
        for (Personne personne : personnes) {
            if (personne.getNom().equalsIgnoreCase(nom)) {
                return personne;
            }
        }
        return null;
    }

    /**
     * Met à jour les informations d'une personne existante.
     *
     * @param nom         Nom de la personne à mettre à jour.
     * @param prenom      Nouveau prénom de la personne.
     * @param adresse     Nouvelle adresse de la personne.
     * @param age         Nouvel âge de la personne.
     * @param sexe        Nouveau sexe de la personne (M/F).
     * @param infoSupp    Nouvelles informations supplémentaires de la personne.
     * @return true si la mise à jour a réussi, false sinon.
     */
    public boolean mettreAJourPersonne(String nom, String prenom, String adresse, int age, String sexe, InformationSupplementaire infoSupp) {
        Personne personne = rechercherParNom(nom);
        if (personne != null) {
            personne.setPrenom(prenom);
            personne.setAdresse(adresse);
            personne.setAge(age);
            personne.setSexe(sexe);
            personne.setInfoSupp(infoSupp);
            return true;
        }
        return false;
    }

    /**
     * Supprime une personne de la base de données.
     *
     * @param nom Nom de la personne à supprimer.
     * @return true si la personne a été supprimée avec succès, false sinon.
     */
    public boolean supprimerPersonne(String nom) {
        Personne personne = rechercherParNom(nom);
        if (personne != null) {
            personnes.remove(personne);
            return true;
        }
        return false;
    }
}
