package aula32.exemplos;

public class Teste {
    public static void main(String[] args){
        Lista l1 = new Lista();
        l1.adiciona("A");
        l1.adiciona("B");
        l1.adiciona("C");
        l1.adiciona("D");
        System.out.println(l1);
        System.out.println("Obtendo o elementos da posição 2:"+l1.obterElemento(2));
        //System.out.println("Obtendo o elemento da posição -1":+l1.obterElemento(-1));
        System.out.println("Pesquisando pelo elemento 'D' na lista"+l1.buscaElemento("D"));
        System.out.println("Pesquisando pelo elemento 'd' na lista"+l1.buscaElemento("d"));
        l1.adiciona("F");
        l1.adiciona("G");
        System.out.println(l1);
        l1.adiciona(4, "E");
        System.out.println(l1);
        l1.adiciona("H");
        l1.adiciona("I");
        l1.adiciona("J");
        System.out.println("Apagando o elemento da posição 2"+l1.remove(2));
        System.out.println(l1);
    }
}
