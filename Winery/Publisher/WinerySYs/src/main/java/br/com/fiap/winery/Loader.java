package br.com.fiap.winery;

import jakarta.xml.ws.Endpoint;

public class Loader {
    public static void main(String[] args) {
        WineStockServiceImplementation wineStock = new WineStockServiceImplementation();
        WineWarningServiceImplementation wineWarning = new WineWarningServiceImplementation();
        Endpoint.publish("http://localhost:8085/WineStockService?wsdl", wineStock);
        System.out.println("Serviço publicado!");
        Endpoint.publish("http://localhost:8085/WineWarningService?wsdl", wineWarning);
        System.out.println("Serviço publicado!");
    }
}
