public class Main {

    public static void main (String []args){
        
        Estudiante e = new Estudiante(0,"","",0,"",0,0,0,0,0);
        
        
        e.setNombre("Natali Méndez");
        e.setId(1027150253);
        e.setTelefono(1111111);
        e.setAltura(1.62);
        e.setAño_nac(2004);        
        e.setCod_estudiante(2220221051L);
        e.setCarrera("Tec. Desarrollo de Software");
        e.setCorreo_insti("natalim.uniagus@.com");
        e.setSemestre(4);

        e.mostrarDatos();
        e.mostrarDatos(2004);
        e.mostrarDatoscarnet();
           
    }
   
}