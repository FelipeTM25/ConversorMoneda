package models;


import com.google.gson.Gson;

import java.util.Scanner;

public class Principal {
    private String APIKEY = "";
    private String url = "https://v6.exchangerate-api.com/v6/";
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private final String USD = "USD";
    private final String ARS = "ARS";
    private final String BRL = "BRL";
    private final String COP = "COP";

    Scanner scanner = new Scanner(System.in);
    public void mostrarMenu(){
        byte opcion;
        String json;
        double cantidad;
        double conversion;
        do{
            System.out.println("Sea bienvenido al conversor de moneda" +
                    "\n1)Dolar =>>Peso argentino" +
                    "\n2)Peso argentino =>>Dolar" +
                    "\n3)Dolar =>>Real brasileño" +
                    "\n4)Real brasileño =>>Dolar" +
                    "\n5)Dolar =>>Peso Colombiano" +
                    "\n6)Peso Colombiano =>>Dolar" +
                    "\n7)salir");
            opcion = scanner.nextByte();
            if (opcion >= 1 && opcion <= 6){
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese la cantidad de dolares que desea convertir a pesos argentinos");
                        cantidad = scanner.nextDouble();
                        json = consumoAPI.obtenerDatos(url + APIKEY + "/pair/" + USD + "/" + ARS + "/" + cantidad);
                        CurrencyER currencyER = new Gson().fromJson(json, CurrencyER.class);
                        conversion = cantidad * currencyER.conversion_rate();
                        System.out.println("La conversion de " + cantidad + " dolares a pesos argentinos es: " + conversion);
                        System.out.println("El resultado de la conversion para ARS es: " + currencyER.conversion_result());
                        break;

                    case 2:
                        System.out.println("Ingrese la cantidad de pesos argentinos que desea convertir a dolares");
                        cantidad = scanner.nextDouble();
                        json = consumoAPI.obtenerDatos(url + APIKEY + "/pair/" + ARS + "/" + USD + "/" + cantidad);
                        currencyER = new Gson().fromJson(json, CurrencyER.class);
                        conversion = cantidad * currencyER.conversion_rate();
                        System.out.println("La conversion de " + cantidad + " pesos argentinos a dolares es: " + conversion);
                        System.out.println("El resultado de la conversion para USD es: " + currencyER.conversion_result());
                        break;

                    case 3:
                        System.out.println("Ingrese la cantidad de dolares que desea convertir a reales brasileños");
                        cantidad = scanner.nextDouble();
                        json = consumoAPI.obtenerDatos(url + APIKEY + "/pair/" + USD + "/" + BRL + "/" + cantidad);
                        currencyER = new Gson().fromJson(json, CurrencyER.class);
                        conversion = cantidad * currencyER.conversion_rate();
                        System.out.println("La conversion de " + cantidad + " dolares a reales brasileños es: " + conversion);
                        System.out.println("El resultado de la conversion para BRL es: " + currencyER.conversion_result());
                        break;

                    case 4:
                        System.out.println("Ingrese la cantidad de reales brasileños que desea convertir a dolares");
                        cantidad = scanner.nextDouble();
                        json = consumoAPI.obtenerDatos(url + APIKEY + "/pair/" + BRL + "/" + USD + "/" + cantidad); ;
                        currencyER = new Gson().fromJson(json, CurrencyER.class);
                        conversion = cantidad * currencyER.conversion_rate();
                        System.out.println("La conversion de " + cantidad + " reales brasileños a dolares es: " + conversion);
                        System.out.println("El resultado de la conversion para USD es: " + currencyER.conversion_result());
                        break;

                    case 5:
                        System.out.println("Ingrese la cantidad de dolares que desea convertir a pesos colombianos");
                        cantidad = scanner.nextDouble();
                        json = consumoAPI.obtenerDatos(url + APIKEY + "/pair/" + USD + "/" + COP + "/" + cantidad);
                        currencyER = new Gson().fromJson(json, CurrencyER.class);
                        conversion = cantidad * currencyER.conversion_rate();
                        System.out.println("La conversion de " + cantidad + " dolares a pesos colombianos es: " + conversion);
                        System.out.println("El resultado de la conversion para COP es: " + currencyER.conversion_result());
                        break;

                    case 6:
                        System.out.println("Ingrese la cantidad de pesos colombianos que desea convertir a dolares");
                        cantidad = scanner.nextDouble();
                        json = consumoAPI.obtenerDatos(url + APIKEY + "/pair/" + COP + "/" + USD + "/" + cantidad);
                        currencyER = new Gson().fromJson(json, CurrencyER.class);
                        conversion = cantidad * currencyER.conversion_rate();
                        System.out.println("La conversion de " + cantidad + " pesos colombianos a dolares es: " + conversion);
                        System.out.println("El resultado de la conversion para USD es: " + currencyER.conversion_result());
                        break;
                }

            } else if (opcion != 7) {
                System.out.println("Opcion invalida, ingrese un numero valido");
            }
        }while (opcion != 7);
    }
}
