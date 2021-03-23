package sample;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller extends AddressList{

    public TextField name;
    public TextField PreName;
    public TextField street;
    public TextField houseNumber;
    public TextField plz;
    public TextField place;
    public Button saveButton;
    public Button deleteButton;
    public TextField filterText;
    ObservableList<Address> addresses = FXCollections.observableArrayList(adi);
    @FXML ListView<Address> list = new ListView<>(addresses);
    FilteredList<Address> filteredAddresses = new FilteredList<>(addresses, s -> true);


    public void saveData(){
        a1 = new Address(name.getText(), PreName.getText(),street.getText(), houseNumber.getText(), plz.getText(), place.getText() );
        adi.add(a1);
        addresses.add(a1);
        list.setItems(addresses);
        name.clear();
        PreName.clear();
        street.clear();
        houseNumber.clear();
        plz.clear();
        place.clear();
    }

    public void deleteData(){
        list.setItems(addresses);
        int delete = list.getSelectionModel().getSelectedIndex();
        list.getItems().remove(delete);
    }

    public void searchData(){
        filterText.textProperty().addListener(observable -> {
            String filter = filterText.getText();
            if(filter == null || filter.length() == 0){
                Platform.runLater(() -> filteredAddresses.setPredicate(s -> true));
            }else{
                Platform.runLater(() -> filteredAddresses.setPredicate(s ->s.toString().contains(filter)));
            }
        });
        list.setItems(filteredAddresses);
    }
}
