public class Estudiante extends Person implements Interfazpersona{
    
    public long cod_estudiante;
    public String carrera;
    public String correo_insti;
    int semestre;

    public Estudiante(long cod_estudiante, String carrera, String correo_insti, int semetre, String nombre, int id, int edad, int telefono, double altura, int año_nac) {
        super(nombre, id, telefono, altura,año_nac);
        this.cod_estudiante = cod_estudiante;
        this.carrera = carrera;
        this.correo_insti = correo_insti;
        this.semestre = semetre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }    
    
    
     public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    public int getAño_nac() {
        return año_nac;
    }
    public void setAño_nac(int año_nac) {
        this.año_nac = año_nac;
    }
    
    
    public long getCod_estudiante() {
        return cod_estudiante;
    }
    public void setCod_estudiante(long cod_estudiante) {
        this.cod_estudiante = cod_estudiante;
    }
         

    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
    public String getCorreo_insti() {
        return correo_insti;
    }
    public void setCorreo_insti(String correo_insti) {
        this.correo_insti = correo_insti;
    }
    
    
    public int getSemestre() {
        return semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    

    
    public void mostrarDatos(){
  
        System.out.println("");      
        System.out.println("Nombre del estudiante: " + nombre+ "\nId del estudiante: " + id+
                "\nTelefono del estudiante: " + telefono + "\nAño de nacimiento del estudiante: " + año_nac + "\nCódigo del estudiante: " + cod_estudiante +
                "\nCarrera del estudiante: " + carrera+ "\nCorreo institucional del estudiante: " + correo_insti+
                "\nSemestre del estudiante: " + semestre);
        System.out.println("");
        
    }
    
    public void mostrarDatos(int año_naci){
        
        int edad;
        edad = 2023 - año_nac;
        System.out.println("");
        System.out.println("La estudiante "+ nombre + " con código "+ cod_estudiante+ ", de la carrera "+carrera+", tiene " + edad + " años.");
        
    }
    
    @Override
    
    public void mostrarDatoscarnet(){
        
        System.out.println("");
        System.out.println(" ---- Datos carnet ---- ");
        System.out.println("");
        System.out.println("Nombre: " + nombre + "\nId: " + id + "\nCódigo estudiante: " + cod_estudiante + "\nPrograma: " +carrera);
    }
    
}
