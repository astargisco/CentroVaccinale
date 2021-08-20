/*
  LABORATORIO INTERDISCIPLINARE B - Como AA20-21

  BANCORA Davide       | 743662 | Como
  CASALNOVO Giacomo    | 740003 | Como
  DONATO Benedetta     | 742957 | Como
  DUBINI Emanuele      | 740954 | Como

 */

package org.example.centrivaccinali.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import org.example.common.CentroVaccinale;

import java.rmi.RemoteException;
import java.sql.SQLException;

/**
 * Classe che crea i rettangoli per la visualizzazione dei centri vaccinali cercati
 */
public class ItemController {
    @FXML
    public Label nameLabel;
    @FXML
    public ImageView img;

    /**
     * Gestisce il comportamento al click del mouse
     *
     * @param mouseEvent mouseEvent
     *
     * @throws SQLException SQLException
     * @throws RemoteException RemoteException
     */
    @FXML
    private void click(MouseEvent mouseEvent) throws SQLException, RemoteException {
        cercaCVListener.onClickListener(centroVaccinale);
    }

    private CentroVaccinale centroVaccinale;
    private CercaCVListener cercaCVListener;

    /**
     * Inserisce i dati per la creazione degli elementi che rappresentano i centri vaccinali
     *
     * @param centroVaccinale
     * @param cercaCVListener
     */
    public void setData(CentroVaccinale centroVaccinale, CercaCVListener cercaCVListener) {
        this.centroVaccinale = centroVaccinale;
        this.cercaCVListener = cercaCVListener;
        nameLabel.setText(centroVaccinale.getNome());
        //Image image = new Image("org/example/images/primula.png");
        //img.setImage(image);
    }
}
