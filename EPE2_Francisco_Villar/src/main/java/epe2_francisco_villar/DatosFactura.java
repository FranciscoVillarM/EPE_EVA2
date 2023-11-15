package epe2_francisco_villar;

//Esta es mi clase padre que contendra los datos necesarios 
public class DatosFactura {
    private String nombreCliente;
    private String apellidosCliente;
    private int edadCliente;
    private String rutCliente;
    private String nombreEmpresa;
    private String rutEmpresa;
    private String giroEmpresa;
    private int totalVentas;
    private double montoVentas;

    public DatosFactura(String nombreCliente, String apellidosCliente, int edadCliente, String rutCliente,
            String nombreEmpresa, String rutEmpresa, String giroEmpresa, int totalVentas, double montoVentas) {
        this.nombreCliente = nombreCliente;
        this.apellidosCliente = apellidosCliente;
        this.edadCliente = edadCliente;
        this.rutCliente = rutCliente;
        this.nombreEmpresa = nombreEmpresa;
        this.rutEmpresa = rutEmpresa;
        this.giroEmpresa = giroEmpresa;
        this.totalVentas = totalVentas;
        this.montoVentas = montoVentas;
    }

    public void calcularIVA() {
        double iva = montoVentas * 0.19;
        System.out.println("Monto en IVA a pagar al SII: " + iva);
    }

    public void calcularUtilidades() {
        double utilidades = montoVentas - (montoVentas * 0.19);
        System.out.println("Monto de utilidades del mes de la empresa: " + utilidades);
    }
}