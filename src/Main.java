//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /* EJERCICIO PARA CALCULAR PRETAMO MAS INTERES, LA IDEA ES APRENDER TIPOS DE DATOS Y VARIABLE*/

        short capitalSolicitado = 12500;
        float interes = 1.75f;
        byte periodoEnMeses = 24;

        float resultado = (capitalSolicitado * interes) * periodoEnMeses;

        System.out.println(resultado);

        /*EJERCICIO PARA CALCULAR LA PARTE ENTERA DE UN DATO FLOAT*/

        /*float numero = 2.50f;
        int entero = (int)numero;

        System.out.println("El entero vale " + entero);*/

        /*EJERCICIO PARA OBTENER LA PARTE DECIMAL DE UN DATO FLOAT*/

        float numero = 2.50f;
        int entero = (int)numero;
        float decimal = (numero - entero);
        System.out.println("El decimal vale " + decimal);







    }
}