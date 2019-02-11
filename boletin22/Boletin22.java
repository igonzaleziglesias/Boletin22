package boletin22;

public class Boletin22 {

    public static void main(String[] args) {
        Buzon obx = new Buzon();
        Correo correo1 = new Correo("Hola q tal?", true);
        Correo correo2 = new Correo("Como estas?", false);
        Correo correo3 = new Correo("Adios?", true);
        Correo correo4 = new Correo("Hasta luego", false);

        obx.engade(correo1);
        System.out.println("numero de correos: " + obx.numeroCorreos());
        obx.engade(correo2);
        System.out.println("numero de correos: " + obx.numeroCorreos());
        obx.engade(correo3);
        System.out.println("numero de correos: " + obx.numeroCorreos());
        obx.engade(correo4);
        System.out.println("numero de correos: " + obx.numeroCorreos());
        System.out.println("Por Ler: " + obx.porLer());
        System.out.println(obx.amosarPrimeiroNoLeido());
        System.out.println(obx.amosa(3));
        obx.elimina(3);
        System.out.println(obx.amosa(3));
    }

}
