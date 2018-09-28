/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warteg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author ASUS
 */
public class FXMLDocumentController implements Initializable {

    private String angka = "";
    private String angka1 = "";
    private String angka2 = "";
    private String angka3 = "";
    private String angka4 = "";
    private String angka5 = "";
    private String angka6 = "";

    private TextField tampil;
    @FXML
    private Button buttonrawon;
    @FXML
    private Button buttonsoto;
    @FXML
    private Button buttonpecel;
    @FXML
    private TextField tampil1;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void soto(ActionEvent event) {
        angka += "Kunyit, Ketumbar, Bawang merah, Daun Bawang, Ayam";
        tampil1.setText(angka);

    }

    @FXML
    private void pecel(ActionEvent event) {
        angka += " Bumbu Kacang, Kemangi, Kacang Panjang, Tauge";
        tampil1.setText(angka);
    }

    @FXML
    private void rawon(ActionEvent event) {
        angka += "Daging Sapi, Bawang Merah, Bawang putih, Serai, Keluek";
        tampil1.setText(angka);
    }

    @FXML
    private void tampil(ActionEvent event) {
    }

}
