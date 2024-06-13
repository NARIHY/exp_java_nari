package ui;

import dao.PersonneDAO;
import experimentation.BaseDeDonneesPersonnes;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage; // Assurez-vous que cette importation est présente

/**
 * Classe pour gérer l'interface utilisateur (JavaFX).
 */
public class Menu extends Application {

    private BaseDeDonneesPersonnes bddPersonnes;
    private PersonneDAO personneDAO;

    public Menu() {
        // Initialisation de la base de données et du DAO
        this.bddPersonnes = new BaseDeDonneesPersonnes();
        this.personneDAO = new PersonneDAO();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Gestion des Personnes");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

        Label labelNom = new Label("Nom:");
        TextField textFieldNom = new TextField();
        Label labelPrenom = new Label("Prénom:");
        TextField textFieldPrenom = new TextField();
        Label labelAdresse = new Label("Adresse:");
        TextField textFieldAdresse = new TextField();
        Label labelAge = new Label("Âge:");
        TextField textFieldAge = new TextField();
        Label labelSexe = new Label("Sexe:");
        ComboBox<String> comboBoxSexe = new ComboBox<>();
        comboBoxSexe.getItems().addAll("Masculin", "Féminin");

        Button buttonAjouter = new Button("Ajouter");
        Button buttonAfficher = new Button("Afficher");
        Button buttonMettreAJour = new Button("Mettre à jour");
        Button buttonSupprimer = new Button("Supprimer");

        grid.add(labelNom, 0, 0);
        grid.add(textFieldNom, 1, 0);
        grid.add(labelPrenom, 0, 1);
        grid.add(textFieldPrenom, 1, 1);
        grid.add(labelAdresse, 0, 2);
        grid.add(textFieldAdresse, 1, 2);
        grid.add(labelAge, 0, 3);
        grid.add(textFieldAge, 1, 3);
        grid.add(labelSexe, 0, 4);
        grid.add(comboBoxSexe, 1, 4);

        grid.add(buttonAjouter, 0, 5);
        grid.add(buttonAfficher, 1, 5);
        grid.add(buttonMettreAJour, 0, 6);
        grid.add(buttonSupprimer, 1, 6);

        buttonAjouter.setOnAction(event -> {
            String nom = textFieldNom.getText();
            String prenom = textFieldPrenom.getText();
            String adresse = textFieldAdresse.getText();
            int age = Integer.parseInt(textFieldAge.getText());
            String sexe = comboBoxSexe.getValue();

            bddPersonnes.ajouterPersonne(nom, prenom, adresse, age, sexe);
            clearFields(textFieldNom, textFieldPrenom, textFieldAdresse, textFieldAge, comboBoxSexe);
            showAlert(Alert.AlertType.INFORMATION, "Ajout Réussi", "Personne ajoutée avec succès.");
        });

        buttonAfficher.setOnAction(event -> {
            afficherToutesLesPersonnes();
        });

        buttonMettreAJour.setOnAction(event -> {
            String nom = textFieldNom.getText();
            String prenom = textFieldPrenom.getText();
            String adresse = textFieldAdresse.getText();
            int age = Integer.parseInt(textFieldAge.getText());
            String sexe = comboBoxSexe.getValue();

            boolean miseAJour = bddPersonnes.mettreAJourPersonne(nom, prenom, adresse, age, sexe);
            if (miseAJour) {
                clearFields(textFieldNom, textFieldPrenom, textFieldAdresse, textFieldAge, comboBoxSexe);
                showAlert(Alert.AlertType.INFORMATION, "Mise à Jour Réussie", "Personne mise à jour avec succès.");
            } else {
                showAlert(Alert.AlertType.ERROR, "Erreur de Mise à Jour", "Impossible de trouver la personne.");
            }
        });

        buttonSupprimer.setOnAction(event -> {
            String nom = textFieldNom.getText();

            boolean suppression = bddPersonnes.supprimerPersonne(nom);
            if (suppression) {
                clearFields(textFieldNom, textFieldPrenom, textFieldAdresse, textFieldAge, comboBoxSexe);
                showAlert(Alert.AlertType.INFORMATION, "Suppression Réussie", "Personne supprimée avec succès.");
            } else {
                showAlert(Alert.AlertType.ERROR, "Erreur de Suppression", "Impossible de trouver la personne.");
            }
        });

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void afficherToutesLesPersonnes() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Liste des Personnes");
        alert.setHeaderText("Liste des Personnes dans la Base de Données");

        StringBuilder sb = new StringBuilder();
        for (Personne personne : bddPersonnes.getPersonnes()) {
            sb.append(personne.toString()).append("\n");
        }

        alert.setContentText(sb.toString());
        alert.showAndWait();
    }

    private void clearFields(TextField nom, TextField prenom, TextField adresse, TextField age, ComboBox<String> sexe) {
        nom.clear();
        prenom.clear();
        adresse.clear();
        age.clear();
        sexe.getSelectionModel().clearSelection();
    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args); // Méthode statique pour démarrer l'application JavaFX
    }
}
