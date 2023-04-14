
package misrc;


public class SustituirEspaciosBlanco {

    public static void main(String[] args) {
        String cadena = "En    un  puerto  italiano    al pie de la montaña";
        String er = "[ ]+";
        String resultadoCadena = cadena.replaceAll(er, " ");
        System.out.println("Resultado: "+ resultadoCadena);
    }
    
}