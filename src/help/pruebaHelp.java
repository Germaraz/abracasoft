/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help;

import java.io.File;
import java.net.URL;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author German
 */
public class pruebaHelp {
    
    private JButton itemAyuda;
    private JFrame principal;
    
    public void ponLaAyuda() {
		try {
			// Carga el fichero de ayuda
			File fichero = new File("help/help_set.hs");
			URL hsURL = fichero.toURI().toURL();

			// Crea el HelpSet y el HelpBroker
			HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
			HelpBroker hb = helpset.createHelpBroker();

			// Pone ayuda a item de menu al pulsarlo y a F1 en ventana
			// principal y secundaria.
			hb.enableHelpOnButton(itemAyuda, "aplicacion", helpset);
			hb.enableHelpKey(principal.getContentPane(), "ventana_principal",
					helpset);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    
}
