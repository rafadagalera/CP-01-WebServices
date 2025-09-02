package br.com.fiap.winery;

import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.URL;

public class ApplicationClient2 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:8085/WineStockService?wsdl");
        QName qname = new QName("http://winery.fiap.com.br/", "WineStockServiceImplementationService");
        Service service = Service.create(url, qname);
        WineStockService wineStockService = service.getPort(WineStockService.class);
        String order = wineStockService.placeOrder("Cabernet Sauvignon", 1);
        System.out.println(order);

        URL url2 = new URL("http://localhost:8085/WineWarningService?wsdl");
        QName qname2 = new QName("http://winery.fiap.com.br/", "WineWarningServiceImplementationService");
        Service service2 = Service.create(url2, qname2);
        WineWarningService wineWarningService = service2.getPort(WineWarningService.class);
        String warn = wineWarningService.sendWarn();
        System.out.println(warn);

    }
}
