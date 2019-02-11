package boletin22;

import java.util.ArrayList;

public class Buzon {

    ArrayList<Correo> buzonEntrada = new ArrayList();

    public int numeroCorreos() {
        return buzonEntrada.size();
    }

    public void engade(Correo c) {
        buzonEntrada.add(c);
    }

    public boolean porLer() {
        for (Correo ele : buzonEntrada) {
            if (!ele.isLeido()) {
                return true;
            }
        }
        return false;
    }
    
    public String amosarPrimeiroNoLeido(){
        for (Correo ele : buzonEntrada){
            if (porLer()) ele.setLeido(true); return ele.getContenido();
        }return "Buzon de entrada vacio";
    }
    
    public String amosa(int k){
       return buzonEntrada.get(k-1).getContenido();
    }
    
    public void elimina(int k){
        buzonEntrada.remove(k-1);
    }
}
