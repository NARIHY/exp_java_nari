package dao;

import experimentation.BaseDeDonneesPersonnes;

import java.io.*;

/**
 * Classe pour gérer la persistance des données de personnes.
 */
public class PersonneDAO {

    private static final String FILENAME = "bdd_personnes.ser"; // Nom du fichier de sauvegarde

    /**
     * Sauvegarde la base de données de personnes dans un fichier.
     *
     * @param bddPersonnes La base de données de personnes à sauvegarder.
     */
    public void sauvegarderBaseDeDonnees(BaseDeDonneesPersonnes bddPersonnes) {
        try (FileOutputStream fos = new FileOutputStream(FILENAME);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(bddPersonnes);
            System.out.println("Sauvegarde réussie dans " + FILENAME);
        } catch (IOException e) {
            System.err.println("Erreur lors de la sauvegarde : " + e.getMessage());
        }
    }

    /**
     * Charge la base de données de personnes à partir d'un fichier.
     *
     * @return La base de données de personnes chargée.
     */
    public BaseDeDonneesPersonnes chargerBaseDeDonnees() {
        BaseDeDonneesPersonnes bddPersonnes = null;
        try (FileInputStream fis = new FileInputStream(FILENAME);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            bddPersonnes = (BaseDeDonneesPersonnes) ois.readObject();
            System.out.println("Chargement réussi depuis " + FILENAME);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erreur lors du chargement : " + e.getMessage());
        }
        return bddPersonnes != null ? bddPersonnes : new BaseDeDonneesPersonnes();
    }
}
