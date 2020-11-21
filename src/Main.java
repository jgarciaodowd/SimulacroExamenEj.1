public class Main {
    public static void main (String [] args) throws InterruptedException {

        Hilos h1 = new Hilos("Hilo 1");
        h1 = Hilos.crear("Hilo 1");
        h1 = Hilos.esperar("Hilo 1");
        Hilos h2 = new Hilos("Hilo 2");
        h2 = Hilos.crear("Hilo 2");
        h2 = Hilos.esperar("Hilo 2");
        Hilos h3 = new Hilos("Hilo 3");
        h3 = Hilos.crear("Hilo 3");
        h3 = Hilos.esperar("Hilo 3");
        
    }
}
