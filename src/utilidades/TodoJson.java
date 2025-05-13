
package utilidades;

import entidades.Cliente;
import entidades.Empleado;
import entidades.Registro;
import entidades.Vehiculo;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
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
    public static void agregarCliente(File archivo,Cliente cliente){
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
    public static void agregarEmpleado(File archivo,Empleado empleado){
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
    public static void agregarVehiculo(File archivo,Vehiculo vehiculo){
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
    public static void agregarRegistro(File archivo,Registro registro){
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
            JSONObject nuevoRegistro = new JSONObject();
            
            nuevoRegistro.put("id", registro.getIdRegistro());
            nuevoRegistro.put("nivel", registro.getNivel());
            nuevoRegistro.put("zona", registro.getZona());
            nuevoRegistro.put("fechaIngreso", registro.getFechaIngreso());
            nuevoRegistro.put("horaIngreso", registro.getHoraIngreso());
            nuevoRegistro.put("cliente", registro.getCliente().getIdCliente());
            nuevoRegistro.put("empleado", registro.getEmpleado().getIdEmpleado());
            nuevoRegistro.put("vehiculo", registro.getVehiculo().getNroPlaca());
            nuevoRegistro.put("tipoDocumento", registro.getTipoDocumento());
            nuevoRegistro.put("fechaSalida", registro.getFechaSalida());
            nuevoRegistro.put("horaSalida", registro.getHoraSalida());

            datos.getJSONArray("registros").put(nuevoRegistro);

            try (FileWriter fileWriter = new FileWriter(archivo)) {
                fileWriter.write(datos.toString(4));
            }
        } catch (IOException e) {
                System.err.println("Error al manejar el archivo JSON: " + e.getMessage());
        }
    }
    public static List<Cliente> obtenerListaClientes(File archivo) {
        List<Cliente> listaClientes = new ArrayList<>();

        try {
            if (!archivo.exists()) {
                return listaClientes;
            }

            String contenido = new String(Files.readAllBytes(archivo.toPath()));
            JSONObject datos = new JSONObject(contenido);

            JSONArray clientesJSON = datos.getJSONArray("clientes");

            for (int i = 0; i < clientesJSON.length(); i++) {
                JSONObject clienteObj = clientesJSON.getJSONObject(i);

                Cliente cliente = new Cliente(clienteObj.getString("id"),clienteObj.getString("numeroLicencia"));
                cliente.setCorreo(clienteObj.getString("correo"));
                cliente.setDireccion(clienteObj.getString("direccion"));
                cliente.setDistrito(clienteObj.getString("distrito"));
                cliente.setIdentificacion(clienteObj.getString("identificacion"));
                cliente.setNacionalidad(clienteObj.getString("nacionalidad"));
                cliente.setNombresApellidos(clienteObj.getString("nombresApellidos"));
                cliente.setSexo(clienteObj.getString("sexo"));
                cliente.setTelefono(clienteObj.getString("telefono"));
                listaClientes.add(cliente);
            }

        } catch (IOException e) {
            System.err.println("Error al leer archivo JSON: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error al procesar JSON: " + e.getMessage());
        }

        return listaClientes;
    }
    public static List<Empleado> obtenerListaEmpleados(File archivo) {
        List<Empleado> listaEmpleado = new ArrayList<>();

        try {
            if (!archivo.exists()) {
                return listaEmpleado;
            }

            String contenido = new String(Files.readAllBytes(archivo.toPath()));
            JSONObject datos = new JSONObject(contenido);

            JSONArray empleadosJSON = datos.getJSONArray("empleados");

            for (int i = 0; i < empleadosJSON.length(); i++) {
                JSONObject empleadoObj = empleadosJSON.getJSONObject(i);

                Empleado empleado = new Empleado(empleadoObj.getString("id"),empleadoObj.getString("fechaNacimiento"));
                empleado.setCorreo(empleadoObj.getString("correo"));
                empleado.setDireccion(empleadoObj.getString("direccion"));
                empleado.setDistrito(empleadoObj.getString("distrito"));
                empleado.setIdentificacion(empleadoObj.getString("identificacion"));
                empleado.setNacionalidad(empleadoObj.getString("nacionalidad"));
                empleado.setNombresApellidos(empleadoObj.getString("nombresApellidos"));
                empleado.setSexo(empleadoObj.getString("sexo"));
                empleado.setTelefono(empleadoObj.getString("telefono"));
                listaEmpleado.add(empleado);
            }

        } catch (IOException e) {
            System.err.println("Error al leer archivo JSON: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error al procesar JSON: " + e.getMessage());
        }

        return listaEmpleado;
    }
    public static List<Vehiculo> obtenerListaVehiculos(File archivo) {
        List<Vehiculo> listaVehiculo = new ArrayList<>();

        try {
            if (!archivo.exists()) {
                return listaVehiculo;
            }

            String contenido = new String(Files.readAllBytes(archivo.toPath()));
            JSONObject datos = new JSONObject(contenido);

            JSONArray vehiculosJSON = datos.getJSONArray("vehiculos");

            for (int i = 0; i < vehiculosJSON.length(); i++) {
                JSONObject vehiculoObj = vehiculosJSON.getJSONObject(i);
                
                Vehiculo vehiculo = new Vehiculo();
                vehiculo.setNroPlaca(vehiculoObj.getString("numeroPlaca"));
                vehiculo.setMarcaModelo(vehiculoObj.getString("marcaModelo"));
                vehiculo.setColor(vehiculoObj.getString("color"));
                vehiculo.setTipo(vehiculoObj.getString("tipo"));
                vehiculo.setLunasPolarizadas(vehiculoObj.getString("lunasPolarizadas"));
                listaVehiculo.add(vehiculo);
            }

        } catch (IOException e) {
            System.err.println("Error al leer archivo JSON: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error al procesar JSON: " + e.getMessage());
        }

        return listaVehiculo;
    }
    public static List<Registro> obtenerListaRegistros(File archivo) {
        List<Registro> listaRegistro = new ArrayList<>();

        try {
            if (!archivo.exists()) {
                return listaRegistro;
            }

            String contenido = new String(Files.readAllBytes(archivo.toPath()));
            JSONObject datos = new JSONObject(contenido);

            JSONArray registrosJSON = datos.getJSONArray("registros");

            for (int i = 0; i < registrosJSON.length(); i++) {
                JSONObject registroObj = registrosJSON.getJSONObject(i);
                Registro registro = new Registro(registroObj.getString("id"),registroObj.getString("nivel"),registroObj.getString("zona"),registroObj.getString("tipoDocumento"));
                registro.setFechaIngreso(registroObj.getString("fechaIngreso"));
                registro.setHoraIngreso(registroObj.getString("horaIngreso"));
                registro.setEmpleado(buscarEmpleado(archivo, registroObj.getString("empleado")));
                registro.setCliente(buscarCliente(archivo, registroObj.getString("cliente")));
                registro.setVehiculo(buscarVehiculo(archivo, registroObj.getString("vehiculo")));
                registro.setTipoDocumento(registroObj.getString("tipoDocumento"));
                registro.setFechaSalida(registroObj.getString("fechaSalida"));
                registro.setHoraSalida(registroObj.getString("horaSalida"));
                listaRegistro.add(registro);
            }

        } catch (IOException e) {
            System.err.println("Error al leer archivo JSON: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error al procesar JSON: " + e.getMessage());
        }

        return listaRegistro;
    }
    public static Cliente buscarCliente(File archivo,String id) {

        try {
            if (!archivo.exists()) {
                return null;
            }

            String contenido = new String(Files.readAllBytes(archivo.toPath()));
            JSONObject datos = new JSONObject(contenido);

            JSONArray clientesJSON = datos.getJSONArray("clientes");

            for (int i = 0; i < clientesJSON.length(); i++) {
                JSONObject clienteObj = clientesJSON.getJSONObject(i);

                Cliente cliente = new Cliente(clienteObj.getString("id"),clienteObj.getString("numeroLicencia"));
                cliente.setCorreo(clienteObj.getString("correo"));
                cliente.setDireccion(clienteObj.getString("direccion"));
                cliente.setDistrito(clienteObj.getString("distrito"));
                cliente.setIdentificacion(clienteObj.getString("identificacion"));
                cliente.setNacionalidad(clienteObj.getString("nacionalidad"));
                cliente.setNombresApellidos(clienteObj.getString("nombresApellidos"));
                cliente.setSexo(clienteObj.getString("sexo"));
                cliente.setTelefono(clienteObj.getString("telefono"));
                if (cliente.getIdCliente().equals(id)) {
                    return cliente;
                }
            }

        } catch (IOException e) {
            System.err.println("Error al leer archivo JSON: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error al procesar JSON: " + e.getMessage());
        }

        return null;
    }
    public static Empleado buscarEmpleado(File archivo,String id) {

        try {
            if (!archivo.exists()) {
                return null;
            }

            String contenido = new String(Files.readAllBytes(archivo.toPath()));
            JSONObject datos = new JSONObject(contenido);

            JSONArray empleadosJSON = datos.getJSONArray("empleados");

            for (int i = 0; i < empleadosJSON.length(); i++) {
                JSONObject empleadoObj = empleadosJSON.getJSONObject(i);

                Empleado empleado = new Empleado(empleadoObj.getString("id"),empleadoObj.getString("fechaNacimiento"));
                empleado.setCorreo(empleadoObj.getString("correo"));
                empleado.setDireccion(empleadoObj.getString("direccion"));
                empleado.setDistrito(empleadoObj.getString("distrito"));
                empleado.setIdentificacion(empleadoObj.getString("identificacion"));
                empleado.setNacionalidad(empleadoObj.getString("nacionalidad"));
                empleado.setNombresApellidos(empleadoObj.getString("nombresApellidos"));
                empleado.setSexo(empleadoObj.getString("sexo"));
                empleado.setTelefono(empleadoObj.getString("telefono"));
                if (empleado.getIdEmpleado().equals(id)) {
                    return empleado;
                }
            }

        } catch (IOException e) {
            System.err.println("Error al leer archivo JSON: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error al procesar JSON: " + e.getMessage());
        }

        return null;
    }
    public static Vehiculo buscarVehiculo(File archivo,String numeroPlaca) {

        try {
            if (!archivo.exists()) {
                return null;
            }

            String contenido = new String(Files.readAllBytes(archivo.toPath()));
            JSONObject datos = new JSONObject(contenido);

            JSONArray vehiculosJSON = datos.getJSONArray("vehiculos");

            for (int i = 0; i < vehiculosJSON.length(); i++) {
                JSONObject vehiculoObj = vehiculosJSON.getJSONObject(i);
                
                Vehiculo vehiculo = new Vehiculo();
                vehiculo.setNroPlaca(vehiculoObj.getString("numeroPlaca"));
                vehiculo.setMarcaModelo(vehiculoObj.getString("marcaModelo"));
                vehiculo.setColor(vehiculoObj.getString("color"));
                vehiculo.setTipo(vehiculoObj.getString("tipo"));
                vehiculo.setLunasPolarizadas(vehiculoObj.getString("lunasPolarizadas"));
                if (vehiculo.getNroPlaca().equals(numeroPlaca)) {
                    return vehiculo;
                }
            }

        } catch (IOException e) {
            System.err.println("Error al leer archivo JSON: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error al procesar JSON: " + e.getMessage());
        }

        return null;
    }
    public static Registro buscarRegistro(File archivo,String id) {

        try {
            if (!archivo.exists()) {
                return null;
            }

            String contenido = new String(Files.readAllBytes(archivo.toPath()));
            JSONObject datos = new JSONObject(contenido);

            JSONArray registrosJSON = datos.getJSONArray("registros");

            for (int i = 0; i < registrosJSON.length(); i++) {
                JSONObject registroObj = registrosJSON.getJSONObject(i);
                Registro registro = new Registro(registroObj.getString("id"),registroObj.getString("nivel"),registroObj.getString("zona"),registroObj.getString("tipoDocumento"));
                registro.setFechaIngreso(registroObj.getString("fechaIngreso"));
                registro.setHoraIngreso(registroObj.getString("horaIngreso"));
                registro.setEmpleado(buscarEmpleado(archivo, registroObj.getString("empleado")));
                registro.setCliente(buscarCliente(archivo, registroObj.getString("cliente")));
                registro.setVehiculo(buscarVehiculo(archivo, registroObj.getString("vehiculo")));
                registro.setTipoDocumento(registroObj.getString("tipoDocumento"));
                registro.setFechaSalida(registroObj.getString("fechaSalida"));
                registro.setHoraSalida(registroObj.getString("horaSalida"));
                if (registro.getIdRegistro().equals(id)) {
                    return registro;
                }
            }

        } catch (IOException e) {
            System.err.println("Error al leer archivo JSON: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error al procesar JSON: " + e.getMessage());
        }

        return null;
    }
    

    public static File selecArchivo(){
        File archivo;
        JFileChooser fileSelect = new JFileChooser(new File(System.getProperty("user.dir")));
        //user.dir hace que la ventana para escoger archivos inicie en la carpeta donde el programa fue ejecutado
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos JSON (*.json)", "json");
        fileSelect.setFileFilter(filter);
        fileSelect.setMultiSelectionEnabled(false);

        int result = fileSelect.showOpenDialog(null); //abre la ventana para escoger archivos

        if (result == fileSelect.APPROVE_OPTION) {
            archivo = fileSelect.getSelectedFile();
            if (!archivo.getName().toLowerCase().endsWith(".json")) {
                archivo = new File(archivo.getParentFile(), archivo.getName() + ".json");
            }
            return archivo;
        } else {
            System.out.println("Error al cargar");
            return null;
        }
    } 
}
