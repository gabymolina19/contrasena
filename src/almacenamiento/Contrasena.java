package almacenamiento;

public class Contrasena {

    public String password;
    public int contrasenaIntentos;

    public Contrasena(String password, int contrasenaIntentos) {
        this.password = password;
        this.contrasenaIntentos = contrasenaIntentos;
    }

    //valida si la contraseña ingresada es correcta
    public boolean validacion (String contrasenaIngresada){
        return contrasenaIngresada.equals(password);
    }

    //valida la cantidad de intentos
    public boolean intentos (int intentosIngresados){
        return intentosIngresados < contrasenaIntentos;
    }
}
