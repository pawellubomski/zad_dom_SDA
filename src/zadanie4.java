public class zadanie4 {
    public static void myMethodA(int[] liczby){
        System.out.println("Rozwiązanie zadania A: ");
        for (int i = liczby.length-1;i>=0;i--){
            System.out.print(liczby[i]+" ");
        }
        System.out.println();
    }
    public static void myMethodB(int[] liczby){
        System.out.println("Rozwiązanie zadania B: ");
        for (int i = 0; i<liczby.length;i++) {
            if (liczby[i] < 0) {
                System.out.print(liczby[i]+" ");
            }
        }
        System.out.println();
    }
    public static void myMethodC(String[] slowa){
        System.out.println("Rozwiązanie zadania C: ");
        String longest_word = "";
        for (int i=0; i< slowa.length;i++){
            if (slowa[i].length()>longest_word.length()){
                longest_word=slowa[i];
            }
        }
        System.out.println(longest_word);
    }
    public static void myMethodD(int[] liczby){
        System.out.println("Rozwiązanie zadania D: ");
        int x = 0;
        for (int i =0; i<liczby.length; i++){
            x=x+liczby[i];
        }
        System.out.println(x);
    }
    public static Integer[] myMethodE(int[] liczby){
        System.out.println();
        Integer[] lista_integer = new Integer[liczby.length];
        for (int i=0; i<liczby.length; i++){
            lista_integer[i]=Integer.valueOf(liczby[i]);
        }
        return lista_integer;
    }
    public static double myMethodF(int[] liczby){
        int x = 0;
        for (int i =0; i<liczby.length; i++) {
            x = (x + liczby[i]);
        }
        double srednia = x/ liczby.length*1.0d;
        return srednia;
    }
    public static int myMethodG(int[] liczby, int[] liczby2){
        for (int i=0; i< liczby.length; i++){
            for (int j=0; j<liczby2.length; j++){
                if (liczby[i] == liczby2[j]){
                        return liczby2[j];
                }
            }
        }
        return 0;
    }
    public static void myMethodH(int[] tab1, int[] tab2){
        System.out.println("Rozwiązanie zadania H: ");
        for (int i=0; i< tab1.length; i++){
            int temp_tab1=tab1[i];
            tab1[i] = tab2[i];
            tab2[i] = temp_tab1;
        }
        System.out.println(tab1);
        System.out.println(tab2);
    }
    public static boolean myMethodI(char[] znaki){
        System.out.println("Rozwiązanie zadania I: ");
        int x = znaki.length-1;
        for (int i=0; i<znaki.length; i++){
            if (znaki[i] != znaki[x]){
                System.out.println("Tablica nie jest palindromem ");
                return false;
            }
            x=x-1;
        }
        System.out.println("Tablica jest palindromem ");
        return true;
    }
    public static int myMethodJ(int n){
        int x=1;
        for (int k=1; k<=n; k++){
            x=x*k;
        }
        return x;
    }
    public static int[] myMethodK(int[] tab2, int n){
        for (int i=0; i<tab2.length;i++){
            tab2[i]=tab2[i]*n;
        }
        return tab2;
    }
    public static void main(String[] args) {
        int[] arr = {-5,-4,-3,-2,-1,0,1,2,3,4,5};
        int[] arr2 = {-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10,50,5484,54885};
        int[] tab1 = {-10,-9,-8,-7,-6,-5};
        int[] tab2 = {5,6,7,8,9,10};
        int n = 3;
        char[] znaki = {'S', 'O', 'S'};
        String[] arr1 = {"Krzychu", "Madzia", "Ewelina", "Klara", "Paweł", "Adaś", "Bardzo długie słowo"};
        myMethodA(arr);
        myMethodB(arr);
        myMethodC(arr1);
        myMethodD(arr);
        myMethodE(arr);
        myMethodF(arr2);
        System.out.println("Rozwiązanie zadania F: \n" + myMethodF(arr2));
        System.out.println("Rozwiązanie zadania G: \n" + myMethodG(arr,arr2));
        myMethodH(tab1, tab2); //nie printuje wyniku poprawnie
        myMethodI(znaki);
        System.out.println("Rozwiązanie zadania J: \n" + myMethodJ(8));
        System.out.println("Rozwiązanie zadania K: \n" + myMethodK(tab2,n)); //nie printuje wyniku poprawnie
        }
    }

