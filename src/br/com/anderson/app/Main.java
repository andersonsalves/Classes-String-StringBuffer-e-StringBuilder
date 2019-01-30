package br.com.anderson.app;

/**
 *
 * @author Anderson Silva
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        // String, StringBuilder e StringBuffer
        
        String s = "Bem Vindo";
        s = s.concat(" - Geniuses");

        System.out.println(s);

        StringBuilder sb = new StringBuilder("Bem Vindo"); 
        sb.append(" - Geniuses");
        
        System.out.println("Com StringBuilder: " + sb.toString());
        
        StringBuffer sbf = new StringBuffer("Bem Vindo");
        sbf.append(" - Geniuses");
        
        System.out.println("Com StringBuffer: " + sbf.toString());
    }
}
