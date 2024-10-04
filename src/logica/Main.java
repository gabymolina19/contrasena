package logica;

import almacenamiento.Contrasena;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String password = "gaby1234";
        int cantidadIntentos = 2;

        Contrasena contrasena = new Contrasena(password,cantidadIntentos);

        Scanner scanner = new Scanner(System.in);
        int intentosIngresados = 0;

        while(contrasena.intentos(intentosIngresados)){
            System.out.println("Ingresar la contraseña");

            String contrasenaIngresada = scanner.nextLine();

            //metodo validacion de la clase contrasena
            if(contrasena.validacion(contrasenaIngresada)){
                System.out.println("La contraseña es correcta");
                break;
            }else{
                intentosIngresados++;
                if(contrasena.intentos(intentosIngresados)){
                    System.out.println("Contraseña incorrecta. Intentos restantes:"+(cantidadIntentos-intentosIngresados));
                }else{
                    System.out.println("Superaste los intentos......chaooooo");
                }

            }

        }
        

    }
}