package practico7;

import java.util.HashSet;
import java.util.Objects;
import javax.swing.JOptionPane;

public class Alumno {

    private int legajo;

    private String apellido;

    private String nombre;
    
    private HashSet <Materia> materias=new HashSet();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public Alumno() {
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(HashSet<Materia> materias) {
        this.materias = materias;
    }

   
  
    

    

    public void agregarMateria(Materia m) {
        if(materias.add(m)==true){
            JOptionPane.showMessageDialog(null, "EL ALUMNO SE INSCRIBIO CORRECTAMENTE EN :" +m.getNombre());
        }else {
        JOptionPane.showMessageDialog(null, "EL ALUMNO YA ESTA INSCRIPTO EN  :" +m.getNombre());
    }}

    public int cantidadMaterias() {
        return materias.size();
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.legajo;
        return hash;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.legajo != other.legajo) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.materias, other.materias)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        //return "Alumno{" + "legajo=" + legajo + ", apellido=" + apellido + ", nombre=" + nombre + ", materias=" + materias + '}';
        return " " +apellido+ " " +nombre;
    }
    
  
}
