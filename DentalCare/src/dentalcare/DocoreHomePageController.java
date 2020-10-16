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
import javafx.stage.Stage;

public class DocoreHomePageController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void StaffLogBtnAction(ActionEvent event) throws IOException {
        Parent StaffLog=FXMLLoader.load(getClass().getResource("StaffEntryLog.fxml"));
        Scene StafLogScene=new Scene(StaffLog);
        Stage StaffloStage=new Stage();
        StaffloStage.setScene(StafLogScene);
        StaffloStage.show();
        StaffloStage.close();
    }

    @FXML
    private void PaymentBtnAction(ActionEvent event) {
    }

    @FXML
    private void AccountsBtnAction(ActionEvent event) {
    }

    @FXML
    private void AssistantNotificationBtnAction(ActionEvent event) {
    }

    @FXML
    private void AppoinmentBtnAction(ActionEvent event) {
    }

    @FXML
    private void PatientsBtnAction(ActionEvent event) {
    }

    @FXML
    private void MedicineBtnAction(ActionEvent event) {
    }

    @FXML
    private void EquipmentBtnAction(ActionEvent event) {
    }

    @FXML
    private void DoctorLogOutBtnAction(ActionEvent event) throws IOException {
        Parent logout=FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene homeScene=new Scene(logout);
        Stage logoutS=new Stage();
        logoutS.setScene(homeScene);
        logoutS.show();
        
        //Scene ThisScene=new Scene();
    }
    
    
}
