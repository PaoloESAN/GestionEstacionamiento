
package utilidades;

import entidades.Cliente;
import entidades.Empleado;
import entidades.Vehiculo;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
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
    public void agregarCliente(File archivo,Cliente cliente){
        try {

            JSONObject datos;

            if (archivo.exists()) {
                String contenido = new String(Files.readAllBytes(archivo.toPath()));
                datos = new JSONObject(contenido);
            } else {
                datos = new JSONObject();
                datos.put("clientes", new JSONArray());
                datos.put("empleados", new JSONArray());
                datos.put("vehiculos", new JSONArray());
                datos.put("registros", new JSONArray());
            }

            JSONObject nuevoCliente = new JSONObject();
            nuevoCliente.put("id", cliente.getIdCliente());
            nuevoCliente.put("numeroLicencia", cliente.getIdCliente());
            nuevoCliente.put("nacionalidad", cliente.getNacionalidad());
            nuevoCliente.put("identificacion", cliente.getIdentificacion());
            nuevoCliente.put("nombresApellidos", cliente.getNombresApellidos());
            nuevoCliente.put("sexo", cliente.getSexo());
            nuevoCliente.put("telefono", cliente.getTelefono());
            nuevoCliente.put("correo", cliente.getCorreo());
            nuevoCliente.put("direccion", cliente.getDireccion());
            nuevoCliente.put("distrito", cliente.getDistrito());

            datos.getJSONArray("clientes").put(nuevoCliente);

            try (FileWriter fileWriter = new FileWriter(archivo)) {
                fileWriter.write(datos.toString(4));
            }
        } catch (IOException e) {
                System.err.println("Error al manejar el archivo JSON: " + e.getMessage());
        }
    }
    public void agregarCliente(File archivo,Empleado empleado){
        try {

            JSONObject datos;

            if (archivo.exists()) {
                String contenido = new String(Files.readAllBytes(archivo.toPath()));
                datos = new JSONObject(contenido);
            } else {
                datos = new JSONObject();
                datos.put("clientes", new JSONArray());
                datos.put("empleados", new JSONArray());
                datos.put("vehiculos", new JSONArray());
                datos.put("registros", new JSONArray());
            }

            JSONObject nuevoEmpleado = new JSONObject();
            nuevoEmpleado.put("id", empleado.getIdEmpleado());
            nuevoEmpleado.put("fechaNacimiento", empleado.getFechaNac());
            nuevoEmpleado.put("nacionalidad", empleado.getNacionalidad());
            nuevoEmpleado.put("identificacion", empleado.getIdentificacion());
            nuevoEmpleado.put("nombresApellidos", empleado.getNombresApellidos());
            nuevoEmpleado.put("sexo", empleado.getSexo());
            nuevoEmpleado.put("telefono", empleado.getTelefono());
            nuevoEmpleado.put("correo", empleado.getCorreo());
            nuevoEmpleado.put("direccion", empleado.getDireccion());
            nuevoEmpleado.put("distrito", empleado.getDistrito());

            datos.getJSONArray("empleados").put(nuevoEmpleado);

            try (FileWriter fileWriter = new FileWriter(archivo)) {
                fileWriter.write(datos.toString(4));
            }
        } catch (IOException e) {
                System.err.println("Error al manejar el archivo JSON: " + e.getMessage());
        }
    }
    public void agregarVehiculo(File archivo,Vehiculo vehiculo){
        try {

            JSONObject datos;

            if (archivo.exists()) {
                String contenido = new String(Files.readAllBytes(archivo.toPath()));
                datos = new JSONObject(contenido);
            } else {
                datos = new JSONObject();
                datos.put("clientes", new JSONArray());
                datos.put("empleados", new JSONArray());
                datos.put("vehiculos", new JSONArray());
                datos.put("registros", new JSONArray());
            }/*
                String tipo;
                String MarcaModelo;
                String color;
                String nroPlaca;
                String lunasPolarizadas;*/
            JSONObject nuevoVehiculo = new JSONObject();
            nuevoVehiculo.put("numeroPlaca", vehiculo.getNroPlaca());
            nuevoVehiculo.put("marcaModelo", vehiculo.getMarcaModelo());
            nuevoVehiculo.put("color", vehiculo.getColor());
            nuevoVehiculo.put("tipo", vehiculo.getTipo());
            nuevoVehiculo.put("lunasPolarizadas", vehiculo.getLunasPolarizadas());

            datos.getJSONArray("vehiculos").put(nuevoVehiculo);

            try (FileWriter fileWriter = new FileWriter(archivo)) {
                fileWriter.write(datos.toString(4));
            }
        } catch (IOException e) {
                System.err.println("Error al manejar el archivo JSON: " + e.getMessage());
        }
    }
}
