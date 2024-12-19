import java.util.Scanner;

public class IniciarSessioAlumneTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuari1 = sc.next();
        String contrasenya1 = sc.next();

        if (IniciarSessioAlumne == true) {
            System.out.println("Tens accés!");
            System.out.println("Menú:\n 1. Editar perfil.\n 2. Contactar amb alumnes.\n 3. Anar cap enrere");

        } else {
            System.out.println("Error. Escull el que vols fer.\n 1. Tornar-ho a intentar. \n 2. Sortir de l'aplicatiu.");
        }
    }
}