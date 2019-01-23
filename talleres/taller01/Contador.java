package contador;

public class Contador {
    static private String nom;
    static private int contador;
    private final String id="";
    
    public static void main(String[] args) {
        incrementar();
        incremento();
        System.out.println(aString());
    }
    
    
    public Contador(String id) {
        nom = id;
        contador = 0;
    } 
    
    static public void incrementar(){
        contador++;
    }
    
    static public int incremento(){
        return contador;
    }
    
    static public String aString() {
        String res = nom + " : " + contador;
        return res;
    } 
}
