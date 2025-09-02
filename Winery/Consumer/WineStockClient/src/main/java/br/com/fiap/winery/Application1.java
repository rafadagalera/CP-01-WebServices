package br.com.fiap.winery;
import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.URL;

public class Application1 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:8085/WineStockService?wsdl");
        QName qname = new QName("http://winery.fiap.com.br/", "WineStockServiceImplementationService");
        Service service = Service.create(url, qname);
        WineStockService wineStockService = service.getPort(WineStockService.class);
        System.out.println(wineStockService.getMenu());
        // System.out.println(wineStockService.placeOrder("Cabernet Sauvignon", 1));
    }
}
