package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class HomeCTL {
    public void addstudent(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("addstudent.fxml"));
        Main.rootStage.setScene(new Scene(root,800,600));
    }
    public void viewstudent(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("student.fxml"));
        Main.rootStage.setScene(new Scene(root,800,600));
    }

}
