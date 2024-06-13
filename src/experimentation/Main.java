package experimentation;

import java.util.Scanner;

/**
 * Classe principale pour tester la base de données de personnes avec un menu interactif.
 */
public class Main {
    public static void main(String[] args) {
        // Création de la base de données des personnes
        BaseDeDonneesPersonnes bddPersonnes = new BaseDeDonneesPersonnes();
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;

        while (continuer) {
            // Affichage du menu
            System.out.println("\nMenu:");
            System.out.println("1. Ajouter une personne");
            System.out.println("2. Afficher toutes les personnes");
            System.out.println("3. Rechercher une personne par nom");
            System.out.println("4. Mettre à jour une personne");
            System.out.println("5. Supprimer une personne");
            System.out.println("6. Quitter");
            System.out.print("Choisissez une option: ");

            int choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la nouvelle ligne restante

            switch (choix) {
                case 1:
                    // Ajout de personnes via Scanner
                    System.out.println("Entrer les informations de la personne:");

                    System.out.print("Nom: ");
                    String nom = scanner.nextLine();

                    System.out.print("Prénom: ");
                    String prenom = scanner.nextLine();

                    System.out.print("Adresse: ");
                    String adresse = scanner.nextLine();

                    System.out.print("Âge: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consommer la nouvelle ligne restante

                    System.out.print("Sexe (M/F): ");
                    String sexe = scanner.nextLine();

                    System.out.print("Numéro de téléphone: ");
                    String numeroTelephone = scanner.nextLine();

                    System.out.print("Adresse email: ");
                    String adresseEmail = scanner.nextLine();

                    System.out.print("Profession: ");
                    String profession = scanner.nextLine();

                    InformationSupplementaire infoSupp = new InformationSupplementaire(numeroTelephone, adresseEmail, profession);

                    bddPersonnes.ajouterPersonne(nom, prenom, adresse, age, sexe, infoSupp);
                    System.out.println("Personne ajoutée avec succès.");
                    break;

                case 2:
                    // Affichage de toutes les personnes
                    System.out.println("\nAffichage de toutes les personnes dans la base de données:");
                    bddPersonnes.afficherToutesLesPersonnes();
                    break;

                case 3:
                    // Recherche d'une personne par nom
                    System.out.print("\nRecherche d'une personne par nom: ");
                    String nomRecherche = scanner.nextLine();
                    Personne recherchee = bddPersonnes.rechercherParNom(nomRecherche);
                    if (recherchee != null) {
                        recherchee.information();
                    } else {
                        System.out.println("Personne non trouvée.");
                    }
                    break;

                case 4:
                    // Mise à jour d'une personne
                    System.out.print("\nMise à jour de la personne (nom): ");
                    String nomAMettreAJour = scanner.nextLine();
                    System.out.print("Nouveau prénom: ");
                    String nouveauPrenom = scanner.nextLine();
                    System.out.print("Nouvelle adresse: ");
                    String nouvelleAdresse = scanner.nextLine();
                    System.out.print("Nouvel âge: ");
                    int nouvelAge = scanner.nextInt();
                    scanner.nextLine(); // Consommer la nouvelle ligne restante
                    System.out.print("Nouveau sexe (M/F): ");
                    String nouveauSexe = scanner.nextLine();

                    System.out.print("Nouveau numéro de téléphone: ");
                    String nouveauNumeroTelephone = scanner.nextLine();
                    System.out.print("Nouvelle adresse email: ");
                    String nouvelleAdresseEmail = scanner.nextLine();
                    System.out.print("Nouvelle profession: ");
                    String nouvelleProfession = scanner.nextLine();

                    InformationSupplementaire nouvellesInfoSupp = new InformationSupplementaire(nouveauNumeroTelephone, nouvelleAdresseEmail, nouvelleProfession);

                    boolean miseAJour = bddPersonnes.mettreAJourPersonne(nomAMettreAJour, nouveauPrenom, nouvelleAdresse, nouvelAge, nouveauSexe, nouvellesInfoSupp);
                    if (miseAJour) {
                        System.out.println("Personne mise à jour avec succès.");
                    } else {
                        System.out.println("Personne non trouvée pour mise à jour.");
                    }
                    break;

                case 5:
                    // Suppression d'une personne
                    System.out.print("\nSuppression de la personne (nom): ");
                    String nomASupprimer = scanner.nextLine();
                    boolean suppression = bddPersonnes.supprimerPersonne(nomASupprimer);
                    if (suppression) {
                        System.out.println("Personne supprimée avec succès.");
                    } else {
                        System.out.println("Personne non trouvée pour suppression.");
                    }
                    break;

                case 6:
                    // Quitter
                    continuer = false;
                    System.out.println("Au revoir!");
                    break;

                default:
                    System.out.println("Option invalide, veuillez réessayer.");
                    break;
            }
        }

        scanner.close();
    }
}
