package ejercicio3Observer;

public class Persona {

    private String name;

    public Persona(String name){
        this.name=name;
    }

    public void info(){
        System.out.println("INFO> nombre: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
