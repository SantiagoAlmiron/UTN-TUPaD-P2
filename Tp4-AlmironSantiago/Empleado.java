/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author santiago
 */
public class Empleado {
    // int id: Identificador único del empleado.
    int id;
    // String nombre: Nombre completo.
    String nombreCompleto;
    // String puesto: Cargo que desempeña.
    String puesto;
    // double salario: Salario actual.
    double salario;
    // static int totalEmpleados: Contador global de empleados creados.
    static int totalEmpleados = 0;

    Empleado(int id, String nombreCompleto, String puesto, double salario) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.puesto = puesto;
        this.salario = 100.0;
        totalEmpleados++;
    }

    Empleado(String nombreCompleto, String puesto) {
        this.id = totalEmpleados + 1;
        this.nombreCompleto = nombreCompleto;
        this.puesto = puesto;
        this.salario = 100.0;
        totalEmpleados++;
    }

    public boolean actualizarSalario(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 1) {
            return false;
        }

        this.salario = this.salario * (1+porcentaje);
        return true;
    }

    public boolean actualizarSalario(int amount) {
        this.salario = amount;
        return true;
    }

    public int getId() {
        return id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

    public int totalEmpleados() {
        return totalEmpleados;
    }

    @Override
    public String toString() {
        return "Empleado [id=" + id + ", nombreCompleto=" + nombreCompleto +
               ", puesto=" + puesto + ", salario=" + salario + "]";
    }
}
