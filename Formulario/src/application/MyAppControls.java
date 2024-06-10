//Mendoza Danilo
package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MyAppControls extends Application {

    @Override
    public void start(Stage mainStage) {
        // Creación de los controles
        Button actionButton = new Button("Button");
        CheckBox optionCheckBox = new CheckBox("CheckBox");
        Hyperlink usefulHyperlink = new Hyperlink("Hyperlink");
        ToggleButton stateToggleButton = new ToggleButton("ToggleButton");
        RadioButton selectRadioButton = new RadioButton("RadioButton");
        Label displayLabel = new Label("Label");
        TextField inputTextField = new TextField("");
        inputTextField.setPrefWidth(100);
        PasswordField secretPasswordField = new PasswordField();
        secretPasswordField.setPrefWidth(100);
        TextArea messageTextArea = new TextArea("Se merece un 10 esta tarea ;)");
        messageTextArea.setPrefWidth(200);
        messageTextArea.setPrefHeight(100);
        ProgressIndicator loadIndicator = new ProgressIndicator(0.50);
        ProgressBar loadProgressBar = new ProgressBar(0.50);
        Slider valueSlider = new Slider();
        valueSlider.setValue(50);

        // Creación del GridPane para añadir los controles
        GridPane layoutGrid = new GridPane();
        layoutGrid.setHgap(10);
        layoutGrid.setVgap(10);
        layoutGrid.setPadding(new Insets(10, 10, 10, 10));

        layoutGrid.add(new Label("Button          "), 0, 0);
        layoutGrid.add(actionButton, 1, 0);

        layoutGrid.add(new Label("CheckBox        "), 0, 1);
        layoutGrid.add(optionCheckBox, 1, 1);

        layoutGrid.add(new Label("Hyperlink       "), 0, 2);
        layoutGrid.add(usefulHyperlink, 1, 2);

        layoutGrid.add(new Label("ToggleButton    "), 0, 3);
        layoutGrid.add(stateToggleButton, 1, 3);

        layoutGrid.add(new Label("RadioButton     "), 0, 4);
        layoutGrid.add(selectRadioButton, 1, 4);

        layoutGrid.add(new Label("Label           "), 0, 5);
        layoutGrid.add(displayLabel, 1, 5);

        layoutGrid.add(new Label("TextField       "), 0, 6);
        layoutGrid.add(inputTextField, 1, 6);

        layoutGrid.add(new Label("PasswordField   "), 0, 7);
        layoutGrid.add(secretPasswordField, 1, 7);

        layoutGrid.add(new Label("TextArea        "), 0, 8);
        layoutGrid.add(messageTextArea, 1, 8);

        layoutGrid.add(new Label("ProgressIndicator"), 0, 9);
        layoutGrid.add(loadIndicator, 1, 9);

        layoutGrid.add(new Label("ProgressBar     "), 0, 10);
        layoutGrid.add(loadProgressBar, 1, 10);

        layoutGrid.add(new Label("Slider          "), 0, 11);
        layoutGrid.add(valueSlider, 1, 11);

        // Crear la escena
        Scene mainScene = new Scene(layoutGrid, 350, 550);
        mainStage.setTitle("JavaFX Example");
        mainStage.setScene(mainScene);
        mainStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
