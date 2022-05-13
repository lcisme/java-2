package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentCTL  implements Initializable {
    public TableView<Student> tbStudent;
    public TableColumn<Student, String> cID;
    public TableColumn<Student, String> cFN;
    public TableColumn<Student, String> cAge;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cID.setCellValueFactory(new PropertyValueFactory<>("enrolID"));
        cFN.setCellValueFactory(new PropertyValueFactory<>("fullName"));
        cAge.setCellValueFactory(new PropertyValueFactory<>("age"));
        tbStudent.setItems(Main.stList);
    }

    public void addstudent(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("addstudent.fxml"));
        Main.rootStage.setScene(new Scene(root,800,600));
    }
    public void back(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Main.rootStage.setScene(new Scene(root,800,600));
    }
}
