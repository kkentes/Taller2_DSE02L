package modelo.entidad;
// Generated 10-22-2022 05:14:41 PM by Hibernate Tools 4.3.1



/**
 * Medicos generated by hbm2java
 */
public class Medicos  implements java.io.Serializable {


     private int idMedicos;
     private String nombre;
     private String apellido;
     private int telefono;
     private int sala;
     private String especialidad;

    public Medicos() {
    }

    public Medicos(int idMedicos, String nombre,String apellido,int telefono, int sala, String especialidad) {
       this.idMedicos = idMedicos;
       this.nombre = nombre;
       this.apellido = apellido;
       this.telefono = telefono;
       this.sala = sala;
       this.especialidad = especialidad;
    }
   
    public int getIdMedicos() {
        return this.idMedicos;
    }   
    public void setIdMedicos(int idMedicos) {
        this.idMedicos = idMedicos;
    }
    
    public String getNombre() {
        return this.nombre;
    }   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public int getTelefono() {
        return this.telefono;
    }   
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public int getSala() {
        return this.sala;
    }
    public void setSala(int sala) {
        this.sala = sala;
    }
    
    public String getEspecialidad() {
        return this.especialidad;
    }   
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }




}


