//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        openNotes();
        concorrenciaProcessos();
    }

    public static void openNotes(){
        try {
            ProcessBuilder pb = new ProcessBuilder("open", "-a", "TextEdit");
            Process process = pb.start();
            System.out.println("Editor de texto iniciado");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void concorrenciaProcessos(){
        try{

            long iniciaNotes = System.nanoTime();
            ProcessBuilder pb1 = new ProcessBuilder("open", "-a", "TextEdit");
            Process notes = pb1.start();
            System.out.println("Editor de texto iniciado, aguardando fechamento...");
            notes.waitFor();
            long fimNotes = System.nanoTime();

            System.out.printf("Notes foi encerrado em %.2f ms%n", (fimNotes - iniciaNotes) / 1_000_000.0);

            long inicioCmd = System.nanoTime();
            ProcessBuilder pb3 = new ProcessBuilder("open", "-a", "Terminal");
            Process cmd = pb3.start();
            System.out.println("Terminal iniciado, aguardando fechamento...");
            cmd.waitFor();
            long fimCmd = System.nanoTime();

            System.out.printf("Cmd foi encerrado em %.2f ms%n", (fimCmd - inicioCmd) / 1_000_000.0);

//            long inicioCalculator = System.nanoTime();
//            ProcessBuilder pb2 = new ProcessBuilder("open", "-a", "Calculator");
//            Process process2 = pb2.start();
//            long fimCalculator = System.nanoTime();
//
//            System.out.printf("Calculadora iniciado em %.2f ms%n", (fimCalculator - inicioCalculator) / 1_000_000.0);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}