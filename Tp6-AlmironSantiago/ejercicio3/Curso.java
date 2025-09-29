package javapracticas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author santiago
 */

class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor p) {
        if (this.profesor == p) return;

        // Si ya tenía profesor, lo quitamos de su lista
        if (this.profesor != null) {
            Profesor anterior = this.profesor;
            this.profesor = null;
            anterior.eliminarCurso(this);
        }

        this.profesor = p;

        // Si el nuevo no es null, lo agregamos a su lista
        if (p != null) {
            p.agregarCurso(this);
        }
    }

    public void mostrarInfo() {
        System.out.print("Curso: " + codigo + " - " + nombre);
        if (profesor != null) {
            System.out.println(" | Profesor: " + profesor.getNombre());
        } else {
            System.out.println(" | Profesor: [Sin asignar]");
        }
    }
}


