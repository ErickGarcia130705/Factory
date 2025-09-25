class FabricaVehiculo {
    public void conducir(String tipo) {
        if (tipo.equalsIgnoreCase("carro")) {
            System.out.println("Conduciendo un carro");
        } else if (tipo.equalsIgnoreCase("moto")) {
            System.out.println("Conduciendo una moto");
        } else {
            System.out.println("Vehículo no reconocido");
        }
    }
}
