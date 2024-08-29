//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {1,2,3};
        int[] c = {1,2,3,4,3,2,1};
        int[] d = {2,3,0,5};
        System.out.println("Les tab a et b  sont identiques ? " + tabEgaux(a,b));
        System.out.println("Les tab a et c sont identiques ? " + tabEgaux(a,c));
        System.out.println("Les tab a et b  sont des préfixes ? " + tabPrefixe(a,b));
        System.out.println("Les tab a et c sont des préfixes ? " + tabPrefixe(a,c));
        System.out.println("Le tab c est un palindrome ? " + tabPalindrome(c));
        System.out.println("La valeur la plus petite du tab d est " + tabPlusPetit(d));

}
    public static boolean tabEgaux(int[] tab1, int[] tab2) {
        if (tab1.length != tab2.length) {
            return false;
        }
        for (int i = 0; i < tab1.length; i++) {
            if (tab1[i] != tab2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean tabPrefixe(int[] tab1 , int[] tab2){
        if (tab1.length < tab2.length){
            return false;
        }
        for (int i = 0; i < tab2.length; i++) {
            if (tab1[i] != tab2[i]) {
                return false;
            }
        }

        return true;
    }
    public static boolean tabPalindrome(int[] tab1) {
        int n = tab1.length;
        for (int i = 0; i < n / 2; i++) {
            if (tab1[i] != tab1[n - 1 - i]) {
                return false;
            }
        }
        return true;
    }
    public static int tabPlusPetit(int[] tab1){
        int plusPetit = tab1[0];
        for (int i=0; i <tab1.length; i++){
            if (tab1[i]< plusPetit){
                plusPetit = tab1[i];
            }
        }
        return plusPetit;
    }
}
