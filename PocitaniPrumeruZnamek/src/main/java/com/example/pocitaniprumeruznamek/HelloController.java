package com.example.pocitaniprumeruznamek;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    private ChoiceBox<String> studentName;

    @FXML
    private ChoiceBox<String> subject;
/*
 @FXML
    private ChoiceBox  <String> subject;

*/



    @FXML
    private TextField markOutput;


    String jmeno;
    String predmet;

    @FXML
    protected void onHelloButtonClick() {
        List<Integer> generator = MathUtils.randomGenerator(5);
        double diameter = DiametersUtils.calculateMarkDiameter(generator);

        markOutput.setText(String.valueOf(diameter));
    }


    @FXML
    protected void onStudentName() {
        System.out.println(studentName.getSelectionModel().getSelectedItem());
        jmeno = studentName.getSelectionModel().getSelectedItem();
    }

    @FXML
    protected void onSubject() {
        System.out.println(subject.getSelectionModel().getSelectedItem());
        predmet = subject.getSelectionModel().getSelectedItem();
    }


    @FXML
    protected void diameterMark() {
        List<Integer> generator = MathUtils.randomGenerator(5);
        double diameter = DiametersUtils.calculateMarkDiameter(generator);
        System.out.println(diameter);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        studentName.getItems().add("Joe");
        studentName.getItems().add("Jan");
        studentName.getItems().add("Adam");
        studentName.getItems().add("Tomas");


        subject.getItems().add("Zemepis");
        subject.getItems().add("Cestina");
        subject.getItems().add("Ekologie");
        subject.getItems().add("Matematika");

    }

}