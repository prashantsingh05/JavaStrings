public class Strings {
    public static void main(String[] args) {
        
                             // String Immutable  

        // 1). String Literal

        String name1 = "Prashant";
        String name2 = "Prashant";


        // 2). Using new keyword

        String name3 = new String ("Kanha");
        String name4 = new String ("Kanha");

        System.out.println(name1==name2);
        System.out.println(name3!=name4);
    }
}
