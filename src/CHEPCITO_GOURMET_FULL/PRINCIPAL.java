/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CHEPCITO_GOURMET_FULL;

/**
 *
 * @author razor
 */
public class PRINCIPAL {
 
    public static void main(String[] args) {
        PANTALLA_CARGA screen = new PANTALLA_CARGA();
        INICIO_REGISTRO sign = new INICIO_REGISTRO();
        screen.setVisible(true);
        try {
            for (int row = 0; row <=100; row++) {
                Thread.sleep(100);
                screen.loadingnumber.setText(Integer.toString(row)+"%");
                screen.loadingprogress.setValue(row);
                if (row == 100) {
                    
                    screen.setVisible(false);
                    sign.setVisible(true);
                }
            }
        } catch (Exception e) {
        }
    }
}
