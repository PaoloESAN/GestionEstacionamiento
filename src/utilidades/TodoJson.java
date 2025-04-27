
package utilidades;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;

public class TodoJson {
        public static boolean verificarUsuario(String nombre, String contraseña) {
            boolean respuesta = false;
            try (InputStream inputStream = TodoJson.class.getResourceAsStream("/recursos/usuarios.json")){

                Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8.name());
                String contenido = scanner.useDelimiter("\\A").next();
                scanner.close();
                
                JSONObject obj = new JSONObject(contenido);
                JSONArray usuarios = obj.getJSONArray("usuarios");

                for (int i = 0; i < usuarios.length(); i++) {
                    JSONObject usuario = usuarios.getJSONObject(i);
                    String nombreUsuario = usuario.getString("nombre");
                    String contraseñaUsuario = usuario.getString("contraseña");

                    if (nombreUsuario.toLowerCase().equals(nombre) && contraseñaUsuario.equals(contraseña)) {
                        respuesta = true;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return respuesta;
        }
}
