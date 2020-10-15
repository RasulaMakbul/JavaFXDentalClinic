package dentalcare;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;

public class MedicinesController implements Initializable {

    @FXML
    private TableColumn<?, ?> EquipmentNameCol;
    @FXML
    private TableColumn<?, ?> EquipmentQuantityCol;
    @FXML
    private TableColumn<?, ?> EquipmentDateCol;
    @FXML
    private TableColumn<?, ?> EquipmentUseCounterCol;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void EquipmentEditBtnAction(ActionEvent event) {
    }

    @FXML
    private void EquipmentDeleteBtnAction(ActionEvent event) {
    }
    
}
