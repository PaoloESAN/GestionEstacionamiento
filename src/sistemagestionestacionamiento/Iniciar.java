package sistemagestionestacionamiento;

import com.formdev.flatlaf.FlatDarculaLaf;
import forms.Login;
import javax.swing.UIManager;

public class Iniciar {

    public static void main(String[] args) {
        ventana();
    }
    private static void ventana(){
        try {
            UIManager.setLookAndFeel( new FlatDarculaLaf() );
        }catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        UIManager.put( "Button.arc", 17 );
        UIManager.put( "Component.arc", 17 );
        UIManager.put( "ProgressBar.arc", 17 );
        UIManager.put( "TextComponent.arc", 17 );
        Login login = new Login();
        login.setVisible(true);
    }
}
