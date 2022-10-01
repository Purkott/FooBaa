public class Main {
    public static void main(String[] args) {
        // Inicia objeto da classe ChecaNumero
        ChecaNumero cn = new ChecaNumero();

        // For loop para fornecer os números de  1 a 100 a função de checaNumero
        for(int i = 1; i<101; i++){
            System.out.println(cn.checaNumero(i));
        }
    }
}
