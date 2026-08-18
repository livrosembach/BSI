package aula07;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ex01 {
}

class Disco{
    private ArrayList<Pasta> pastas;
}

class Pasta{
    private ArrayList<Arquivos> arquivos;
}

abstract class Arquivos{
}

abstract class Documento extends Arquivos{

}

class Compactado extends Arquivos{
    private ArrayList<Arquivos> arquivos;
}

class Texto extends Documento{}

class Imagem extends Documento{}

class Som extends Documento{}

class Video extends Documento{}

class Planilha extends Documento{}

class Apresentacao extends Documento{}


