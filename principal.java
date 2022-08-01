public class principal {
    public static void main(String[] args) {
        //instanciar la clase cuentaBancaria
        cuentaBancaria nuevaCuenta = new cuentaBancaria();
        //Ejemplo 1
        String dpi="2539 99287 0101";
double saldo=6000;
float interes=5;
       nuevaCuenta.cuentaBancaria(dpi,saldo,interes);
       double ingresos=500;
        System.out.println("Ingresos: "+ingresos);
       nuevaCuenta.ingresarEfectivo(ingresos);
       double retiros=5000;
        System.out.println("Retiros: "+retiros);
        nuevaCuenta.retirarEfectivo(retiros);
        nuevaCuenta.mostrarDatos(ingresos,retiros);
        System.out.println("-------------------------------------------");
        //Ejemplo 2
        String dpi2="2539 99287 0101";
        double saldo2=35000;
        float interes2=5;
        nuevaCuenta.cuentaBancaria(dpi2,saldo2,interes2);
        double ingresos2=500;
        System.out.println("Ingresos: "+ingresos2);
        nuevaCuenta.ingresarEfectivo(ingresos2);
        double retiros2=5000;
        System.out.println("Retiros: "+retiros2);
        nuevaCuenta.retirarEfectivo(retiros2);
        nuevaCuenta.mostrarDatos(ingresos2,retiros2);
//Ejemplo 3
        System.out.println("-------------------------------------------");
        String dpi3="2539 35984 0919";
        double saldo3=2000;
        float interes3= 4.8F;
        nuevaCuenta.cuentaBancaria(dpi3,saldo3,interes3);
        double ingresos3=5000;
        System.out.println("Ingreso: "+ingresos3);
        nuevaCuenta.ingresarEfectivo(ingresos3);
        double retiros3=175;
        System.out.println("Retiros: "+retiros3);
        nuevaCuenta.retirarEfectivo(retiros3);
        nuevaCuenta.mostrarDatos(ingresos3,retiros3);


    }
}
