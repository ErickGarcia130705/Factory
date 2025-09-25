public class Main {
    public static void main(String[] args) {
        FabricaVehiculo fabrica = new FabricaVehiculo();

        fabrica.conducir("carro");
        fabrica.conducir("moto");
        fabrica.conducir("avion");
    }
}
