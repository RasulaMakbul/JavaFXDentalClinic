
package dentalcare;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;

public class PaymentViewController implements Initializable {

    @FXML
    private TableColumn<?, ?> DateCol;
    @FXML
    private TableColumn<?, ?> PatientNameCol;
    @FXML
    private TableColumn<?, ?> PatientIDCol;
    @FXML
    private TableColumn<?, ?> PaymentCol;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
