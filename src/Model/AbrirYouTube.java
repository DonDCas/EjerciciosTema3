package Model;
import java.awt.Desktop;
import java.net.URI;

public class AbrirYouTube {
    public static void main() {
        try {
            // URL del video de YouTube
            String url = "https://www.youtube.com/watch?v=q9WexXlnH8A";

            // Verifica si el sistema soporta la apertura de URLs
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(new URI(url));  // Abre la URL en el navegador predeterminado
            } else {
                System.out.println("El sistema no soporta la apertura de URLs.");
            }
        } catch (Exception e) {
            e.printStackTrace();  // Manejo de excepciones
        }
    }
}
