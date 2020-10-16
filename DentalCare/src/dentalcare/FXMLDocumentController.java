package dentalcare;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class FXMLDocumentController implements Initializable {
    

    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private ChoiceBox<?> dropdownField;
    @FXML
    private Label showLabel;

    @FXML
    private void loginBtnAction(ActionEvent event) throws IOException {
        String Username=usernameField.getText();
        String Password=passwordField.getText();
        if(Username.equals("admin") && Password.equals("12345")){
            Parent pane=FXMLLoader.load(getClass().getResource("DocoreHomePage.fxml"));
            Scene doctorScene =new Scene(pane);
            Stage DoctorStage=new Stage();
            DoctorStage.setScene(doctorScene);
            DoctorStage.show();
            
            DentalCare.stage.close();
            
            
            
        } else {
            
             //showLabel.setText("Invalid username or password");
            
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

}