/**
* To jest program do rozpoznawania trójkąta.
*/

class Trojkaty {
    /**
     * Główna funkcja programu.
     * @param {float} a - Długość pierwszego boku.
     * @param {float} b - Długość drugiego boku.
     * @param {float} c - Długość trzeciego boku.
     */
    public static boolean czyIstniejeTrojkat(float a, float b, float c){
                  if (a + b <= c) return false;
                  if (a + c <= b) return false;
                  if (b + c <= a) return false;
                  return true;
    public static void jakiTrojkat(float a, float b, float c){
         if (a == b && b == c && a == c) {
             System.out.println("Trójkąt równoboczny"); 
         }
         // TODO: tutaj trzeba bedzie dopisac inne przypadki
    }
    /** Wyświetla ekran pomocy */
    public static void pomoc(){
        System.out.println("Acme INC. (C) 2022");
        System.out.println("Program do rozpoznawania rodzaju trójkąta");
        System.out.println("Uruchom z trzema argumentami liczbowymi - długość boków trójkąta");
    }
    /** Glowna funkcja */
    public static void main(String... args) {
     if (!czyIstniejeTrojkat(a, b, c)) {
                    System.out.println("Z podanych długości boków nie da się zbudować trójkąta");
                    System.exit(3);
                   }
        if (args.length != 3) {
            pomoc();
            System.exit(1);
        }
        float a = Float.valueOf(args[0]);
        float b = Float.valueOf(args[1]);
        float c = Float.valueOf(args[2]);
        
        jakiTrojkat(a, b, c);
    }
}
