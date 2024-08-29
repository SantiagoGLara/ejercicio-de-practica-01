public class Principal {
    public static void main(String[] args) throws Exception {
        /*
         Crea un programa que imprima por consola todos los números comprendidos
         entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
         */
        for(int i=10;i<=55;i++){
            if (i!=16) {
                if (((i%3)!=0)&&(i%2==0)||i==55) {
                    System.out.println(i);
                }
            } 
        }
    }
}
