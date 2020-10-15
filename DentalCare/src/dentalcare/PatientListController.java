package dentalcare;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;

public class PatientListController implements Initializable {

    @FXML
    private TableColumn<?, ?> PatientListIDCol;
    @FXML
    private TableColumn<?, ?> PatientListNameCol;
    @FXML
    private TableColumn<?, ?> PatientListAppoinmentCol;
    @FXML
    private TableColumn<?, ?> PatientListProblemCol;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void PatientListUpdateBtnAction(ActionEvent event) {
    }

    @FXML
    private void PatientListPrescriptionBtnAction(ActionEvent event) {
    }
    
}
