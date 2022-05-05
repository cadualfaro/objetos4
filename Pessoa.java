
package objetos.pkg4;

class Pessoa {
    String nome;
    Carro c1=null; 
    Carro c2=null;

    void registrarCarro(Carro car){
    if(c1 == null){
        c1 = car;
        System.out.println(""+car.marca);
    }
    else if(c2 == null){
        c2 = car;
        System.out.println(""+car.marca);
    }
    else{
        System.out.println("Essa pessoa já possui dois carros.");
    }
    }
}
