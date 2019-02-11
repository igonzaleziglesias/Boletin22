package boletin22;

public class Correo {
    private String contenido="";
    private boolean leido=false;

    public Correo() {
    }
    
    public Correo(String contenido, boolean leido){
        this.contenido=contenido;
        this.leido=leido;
    }

    public String getContenido() {
        return contenido;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    @Override
    public String toString() {
        return "\ncontenido=" + contenido + "\nleido=" + leido;
    }
    
    
}
