public class Person{
    
    String nombre;
    int id;
    int telefono;
    double altura;
    int año_nac;

    public Person(String nombre, int id, int telefono, double altura,int año_nac) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
        this.altura = altura;
        this.año_nac = año_nac;
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
    
}
