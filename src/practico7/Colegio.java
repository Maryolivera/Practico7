/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico7;

/**
 *
 * @author Mary
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Materia ingles=new Materia(01,"ingles",23);
        Materia matematicas=new Materia(02,"matematicas",23);
        Materia laboratorio=new Materia(03,"laboratorio",23);
       
        Alumno alumno1=new Alumno(1001,"Lopez","Martin");
        Alumno alumno2=new Alumno(1002,"Martinez","Brenda");
        
        alumno1.agregarMateria(ingles);
        alumno1.agregarMateria(matematicas);
        alumno1.agregarMateria(laboratorio);
       
        alumno2.agregarMateria(ingles);
        alumno2.agregarMateria(matematicas);
        alumno2.agregarMateria(laboratorio);
        alumno2.agregarMateria(laboratorio);
        
        System.out.println("las materias en las que se inscribio Lopez son "+alumno1.cantidadMaterias());        
        System.out.println("las materias en las que se inscribio Martinez son "+alumno2.cantidadMaterias());
    }

   
    
}
