public class ChecaNumero {

    public ChecaNumero() {
    }
    public String checaNumero(int i) {
        // O operador % retorna o resto de uma divisão, se o resultado for 0 o numerador é multiplo do denominador
        String retorno = "";
        if(i % 3 != 0 & i % 5 != 0) {
            retorno += i;
        }
        else {
            if(i % 3 == 0) {
                retorno += "Foo";
            }
            if(i % 5 == 0) {
                retorno += "Baa";
            }
        }
        return retorno;
    }
}
