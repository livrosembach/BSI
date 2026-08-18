package aula06;

public class ex02 {
    public static void main(String args []){
        Skate s1 = new Skate();
        Surf su1 = new Surf();
        Patinete p1 = new Patinete();
        EsporteRadical e1 = new EsporteRadical();

        s1.manobras();
        su1.manobras();
        p1.manobras();
        e1.manobras();
    }
}

class EsporteRadical{

    public void manobras(){
        System.out.println("Adrenalida a mil...");
    }
}

class Skate extends EsporteRadical{

    public void manobras(){
        System.out.println("Manobras de skate");
    }
}

class Surf extends EsporteRadical{

    public void manobras(){
        System.out.println("Manobras do surf");
    }
}

class Patinete extends EsporteRadical{

    public void manobras(){
        System.out.println("Manobras do patinete");
    }
}

