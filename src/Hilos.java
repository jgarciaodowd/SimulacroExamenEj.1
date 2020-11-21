public class Hilos implements Runnable{
    Thread hilo;

    Hilos(String nombre){
        hilo = new Thread(this, nombre);
    }

    public static Hilos crear(String nombre){
        Hilos hilos = new Hilos(nombre);
        hilos.hilo.start();
        return hilos;
    }
    public static Hilos esperar(String nombre) throws InterruptedException {
        Hilos hilos = new Hilos(nombre);
        hilos.hilo.join();
        return hilos;
    }

    @Override
    public void run() {
        System.out.println("Iniciando hilo " + hilo.getName());
        for(int i = 0; i <= 8 ; i++){
            System.out.println("Iteración: " + i + " hilo " + hilo.getName());
            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Termina thread " + hilo.getName());
    }
}
