
package dentalcare;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;

public class AppoinmentsController implements Initializable {

    @FXML
    private TableColumn<?, ?> AppoinmentDateCol;
    @FXML
    private TableColumn<?, ?> AppoinmentTimeCol;
    @FXML
    private TableColumn<?, ?> AppoinmentPtNameCol;
    @FXML
    private TableColumn<?, ?> AppoinmentPtIDCol;
    @FXML
    private TableColumn<?, ?> AppoinmentPtProblemCol;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ReturnBtnAction(ActionEvent event) {
    }
    
}
