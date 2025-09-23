class FabricaVehiculo {
    public Vehiculo crearVehiculo(String tipo) {
        if (tipo.equalsIgnoreCase("carro")) {
            return new Carro();
        } else if (tipo.equalsIgnoreCase("moto")) {
            return new Moto();
        }
        return null; 
    }
}
