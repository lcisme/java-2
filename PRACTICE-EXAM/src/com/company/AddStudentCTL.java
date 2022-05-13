package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

public class AddStudentCTL {
    public TextField enrolID;
    public TextField firstName;
    public TextField lastName;
    public TextField age;

    public void back(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Main.rootStage.setScene(new Scene(root,800,600));
    }

    public void viewstudent(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("student.fxml"));
        Main.rootStage.setScene(new Scene(root,800,600));
    }

    public void submit(ActionEvent event) throws Exception {
        try {
            if (enrolID.getText().isEmpty() || firstName.getText().isEmpty() || lastName.getText().isEmpty() || age.getText().isEmpty()){
                throw new Exception();
            }
            String enrolID = this.enrolID.getText();
            String fullName = this.firstName.getText()+ " " + this.lastName.getText();
            String age = this.age.getText();
            Student s = new Student(enrolID,fullName,age);
            Main.stList.add(s);
            Parent root = FXMLLoader.load(getClass().getResource("student.fxml"));
            Main.rootStage.setScene(new Scene(root,800,600));
        }catch (Exception e){

        }
    }
}
