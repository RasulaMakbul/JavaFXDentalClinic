package dentalcare;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;

public class AssistantLogController implements Initializable {

    @FXML
    private TableColumn<?, ?> NotificationDateCol;
    @FXML
    private TableColumn<?, ?> NotificationTimeCol;
    @FXML
    private TableColumn<?, ?> notificationCol;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
