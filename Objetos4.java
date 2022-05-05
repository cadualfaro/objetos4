/*
Implemente que cada Pessoa possa ter até 2 carros.
Implemente o método “registrarCarro (Carro car)” dentro da classe Pessoa
*/
package objetos.pkg4;

public class Objetos4 {

    public static void main(String[] args) {
        
        Carro c1 = new Carro();
        c1.marca = "Fiat";
        c1.modelo = "Uno";
        
        Carro c2 = new Carro();
        c2.marca = "Volksvagen";
        c2.modelo = "Jetta";
        
        Carro c3 = new Carro();
        c3.marca = "Chevrolet";
        c3.modelo = "Camaro";
        
        Carro c4 = new Carro();
        c4.marca = "Audi";
        c4.modelo = "A4";
        
        Carro c5 = new Carro();
        c4.marca = "rapaiz";
        c4.modelo = "n da";
        
        Pessoa p1 = new Pessoa();
        p1.nome = "Carlos";
        p1.registrarCarro(c2);
        p1.registrarCarro(c4);
        p1.registrarCarro(c5);
        
        Pessoa p2 = new Pessoa();
        p2.nome = "Eduardo";
        p2.registrarCarro(c1);
        p2.registrarCarro(c3);
    }
    
}
