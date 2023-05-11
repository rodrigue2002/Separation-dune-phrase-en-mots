import java.util.*;
public class TokenizableString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une phrase: ");
        String phrase = sc.nextLine();
        String [] mots = phrase.split(" ");    // split() permet de séparer les mots de la phrase en array
        System.out.println("Voici les mots de la phrase: ");
        for(int i=0; i<mots.length; i++){
            System.out.println("'" + mots[i] + "'");
        }
    }

    public static void chaineDeCaracteres(String[] a){
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}