import java.sql.SQLOutput;

public class cuentaBancaria {
  private   String dpi;
   private double saldoActual;
    private double interesAnual;
    static long numeroCuenta=10001;

public cuentaBancaria(){

}
public void cuentaBancaria(String dpi, double saldoActual, double interesAnual){
    this.dpi=dpi;
    this.saldoActual=saldoActual;
    this.interesAnual=interesAnual;
}
public static long getNumeroCuenta(){
return numeroCuenta++;
}
    public String getDpi() {
        return dpi;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public double getInteres() {
        return interesAnual;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public void setSaldoActual(double saldo) {
        this.saldoActual = saldoActual;
    }

    public void setInteresAnual(double interes) {
        this.interesAnual = interesAnual;
    }
    //actualizarSaldo(): actualizará el saldo de la cuenta aplicándole el
    // interés diario (interés anual dividido entre 365 aplicado al saldo actual).
public double actualizarSaldo() {
    double saldoNuevo=0;
    saldoNuevo = (saldoActual + (saldoActual * ((interesAnual / 100) / 365)));
    return saldoNuevo;
}
//ingresar(double): permitirá realizar un crédito de una cantidad en la cuenta.
    public double ingresarEfectivo(double cantidadIngresada){
    double nuevoEfectivo;
        nuevoEfectivo=(actualizarSaldo()+cantidadIngresada);

    return nuevoEfectivo;
    }
    //retirar(double): permitirá realizar un débito de una cantidad de la cuenta
    // (si y solo si tiene el saldo suficiente por lo que debe incluirlo).
public double retirarEfectivo(double cantidadRetiro){
double nuevoEfectivo=0;
    if (this.saldoActual>= cantidadRetiro){
        nuevoEfectivo=actualizarSaldo()-cantidadRetiro;
    }else {
        System.out.println("No cuenta con saldo suficiente. Efectivo: "+this.saldoActual);
    }
    return nuevoEfectivo;
}
    //Método que nos permita mostrar todos los datos de la cuenta.
    void mostrarDatos(double ingresar, double retiro){
        System.out.println("Numero de Cuenta: "+getNumeroCuenta());
        System.out.println("DPI: "+this.dpi);
        System.out.println("Interes Anual"+this.interesAnual);
        System.out.println("Saldo Actual: "+saldoActual);
        System.out.println("Saldo despues de su ingreso: "+ingresarEfectivo(ingresar));
        System.out.println("Saldo despues de su retiro: "+retirarEfectivo(retiro));
    }
}
