package sample;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.List;

public class Controller extends AddressList{

    public TextField name;
    public TextField PreName;
    public TextField street;
    public TextField houseNumber;
    public TextField plz;
    public TextField place;
    public Button saveButton;
    ObservableList<Address> addresses = FXCollections.observableArrayList(adi);
    @FXML ListView<Address> list = new ListView<>(addresses);

    public void saveData(){
        a1 = new Address(name.getText(), PreName.getText(),street.getText(), houseNumber.getText(), plz.getText(), place.getText() );
        adi.add(a1);
        System.out.println("Daten gespeichert");
    }
}
