public class Main {
    public static void main(String[] args) {
        FabricaVehiculo fabrica = new FabricaVehiculo();

//Cuando el usuario pide un vehiculo 

        Vehiculo v1 = fabrica.crearVehiculo("carro");
        v1.conducir();

        Vehiculo v2 = fabrica.crearVehiculo("moto");
        v2.conducir();
    }
}
