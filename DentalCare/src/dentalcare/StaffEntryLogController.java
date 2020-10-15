package dentalcare;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;

public class StaffEntryLogController implements Initializable {

    @FXML
    private TableColumn<?, ?> StaffEntryDateCol;
    @FXML
    private TableColumn<?, ?> StaffLoginCol;
    @FXML
    private TableColumn<?, ?> StaffLogoutCol;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void DoctorEntryLogBtnAction(ActionEvent event) {
    }

    @FXML
    private void AssistantEntryLogBtnAction(ActionEvent event) {
    }
    
}
