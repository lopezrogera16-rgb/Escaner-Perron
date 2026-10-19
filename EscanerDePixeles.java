// Puedes Cambiar el Codigo Si no te parecio
// Solo que si lo vas a subir tambien hazlo en Codigo Abierto :3
// **************************************************************
// Los Imports que van a ser util a este Script :D
import java.io.File;                 
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;        
import javax.swing.JOptionPane;      

public class EscanerDePixeles {
    public static void Dimensiones() {
        // Aqui Esta para que metan su imagen ;)
        String RutaImagen = JOptionPane.showInputDialog(null, "mete la ruta de tu increible imagen PNG (ej. C:/Users/TU_USUARIO/OneDrive/Desktop/Imagen.png ):", "Y MI IMAGEN?", JOptionPane.QUESTION_MESSAGE); 
        
        // Si decidieron cancelar, los saco en silencio de buena onda :)
        if (RutaImagen == null || RutaImagen.trim().isEmpty()) {
            return; 
        }
        
        try {
            // Vamos a Buscar la imagen del Usuario según su ruta
            File archivoImagen = new File(RutaImagen);
            BufferedImage imagen = ImageIO.read(archivoImagen); 
        
            int anchoPixeles = imagen.getWidth(); 
            int altoPixeles = imagen.getHeight(); 
            // Le doy un super increible fantastico comentario de que su imagen se detecto
            // (Y le doy su Ancho y Alto :3)
            JOptionPane.showMessageDialog(null, 
                "DETECTE TU IMAGEN :D: " + RutaImagen + "\n" +
                "📏 Ancho: " + anchoPixeles + " píxeles\n" +
                "📐 Alto: " + altoPixeles + " píxeles", 
                "IMAGEN DETECTADA :)", JOptionPane.INFORMATION_MESSAGE); 
            
        } catch (Exception e) {
            // Y si No la detecto...
            JOptionPane.showMessageDialog(null, "¡ERROR! No se pudo encontrar la imagen en la ruta: " + RutaImagen + ":c", "NO ENCONTRE TU IMAGEN :(", JOptionPane.ERROR_MESSAGE); 
        }
    }
}
