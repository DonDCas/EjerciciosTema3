package Utils;

import Model.GatoSimple;

import java.util.Scanner;

public class Menus {
    public static int MenuRaza(){
        int respuesta;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("""
                    ¿Que raza es tu gato?
                    1- Egipcio
                    2- Siames
                    3- Europeo
                    4- Callejero y viajero
                    """);
            respuesta = Integer.parseInt(sc.nextLine());

            switch (respuesta){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Esa raza no esta disponible :(");
                    break;

            }
        } while (respuesta < 0 || respuesta > 4);
        return respuesta;
    }
    public static void MenuGatos(GatoSimple gato1) {
        char peleamos = 'N';
        int respuesta;
        Scanner sc = new Scanner(System.in);
        GatoSimple gato2 = new GatoSimple("Doraemon","Azul","Cosmico","Macho",12,
                false,140.00);
        GatoSimple gato3 = new GatoSimple("Turbovieja","Gris","Fantasma","Hembra",1000,
                false,1.00);
        GatoSimple gato4 = new GatoSimple("Gato Con Botas", "Naranja", "Europeo", "Macho",
                22, false, 0.180);

        System.out.print("""
                ¿Con que gato se encuentra tu gato?
                
                1º Gato
                2º Gato
                3º Gato
                
                Escribe el numero que creas oportuno: """);
        respuesta = Integer.parseInt(sc.nextLine());

        switch (respuesta){
            case 1:
                System.out.print("""
                        La pokedex ha arrojado datos sobre el gato encontrado
                        Pulsa enter para continuar ...
                        """);
                sc.nextLine();
                System.out.println(gato2.toString());
                System.out.println();
                System.out.print("Estamos en problemas ¿Quieres lanzar a tu gato a pelear? (S/N)");
                peleamos = sc.nextLine().toUpperCase().charAt(0);
                if (peleamos == 'N') System.out.print("Huiste con exito");
                else if (peleamos == 'S'){
                    System.out.print(gato1.comprobarSexoGato()
                            ? "Como "+ gato1.getNombreGato() + " es hembra no pelea con otros gatos"
                            : (gato2.peleaCon(gato1))
                            ? gato1.getNombreGato() + " le ha pegado una putiza a " +gato2.getNombreGato()
                            : gato2.getNombreGato() + " le ha pegado una putiza a " +gato1.getNombreGato());
                }
                break;
            case 2:
                System.out.print("""
                        La pokedex ha arrojado datos sobre el gato encontrado
                        Pulsa enter para continuar ...
                        """);
                sc.nextLine();
                System.out.println(gato3.toString());
                System.out.println();
                System.out.print("Estamos en problemas ¿Quieres lanzar a tu gato a pelear? (S/N)");
                peleamos = sc.nextLine().toUpperCase().charAt(0);
                if (peleamos == 'N') System.out.print("Huiste con exito");
                else if (peleamos == 'S'){
                    System.out.print(gato1.comprobarSexoGato()
                            ? "Como "+ gato1.getNombreGato() + " es hembra no pelea con otros gatos"
                            : (gato3.peleaCon(gato1))
                            ? gato1.getNombreGato() + " le ha pegado una putiza a " +gato3.getNombreGato()
                            : gato3.getNombreGato() + " le ha pegado una putiza a " +gato1.getNombreGato());
                }
                break;
            case 3:
                System.out.print("""
                        La pokedex ha arrojado datos sobre el gato encontrado
                        Pulsa enter para continuar ...
                        """);
                sc.nextLine();
                System.out.println(gato4.toString());
                System.out.println();
                System.out.print("Estamos en problemas ¿Quieres lanzar a tu gato a pelear? (S/N)");
                peleamos = sc.nextLine().toUpperCase().charAt(0);
                if (peleamos == 'N') System.out.print("Huiste con exito");
                else if (peleamos == 'S'){
                    System.out.print(gato1.comprobarSexoGato()
                            ? "Como "+ gato1.getNombreGato() + " es hembra no pelea con otros gatos"
                            : (gato4.peleaCon(gato1))
                            ? gato1.getNombreGato() + " le ha pegado una putiza a " +gato4.getNombreGato()
                            : gato4.getNombreGato() + " le ha pegado una putiza a " +gato1.getNombreGato());
                }
                break;
            default:
                System.out.println("No elegiste ningun gato :(");
        }
        return;
    }
    public static void MenuComida (GatoSimple gato1){
        Scanner sc = new Scanner(System.in);
        String respuesta;
        System.out.printf("Parece que %s tiene hambre, ¿que le das de comer?(el truco esta en el 'pescado')"
                ,gato1.getNombreGato());
        respuesta = sc.nextLine();
        System.out.print(gato1.tieneHambre(respuesta)
                ? "El gato "+ gato1.getNombreGato() +" ahora esta satisfecho \n"
                : "Te dije que el truco era el pescado ahora "+ gato1.getNombreGato() +" tiene más hambre D: \n");
        sc.nextLine();

    }
}
