package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {
    @Override
    public String getMenu(){
        return "Vinhos por Tipo de Uva:\n"
                + "- Cabernet Sauvignon: Chateau Lafite, Opus One, Don Melchor\n"
                + "- Merlot: Pétrus, Marques de Casa Concha\n"
                + "- Malbec: Catena Zapata, Trapiche Oak Cask\n"
                + "- Pinot Noir: Bourgogne Rouge, Cloudline\n"
                + "- Chardonnay: Chablis Premier Cru, Kendall-Jackson\n"
                + "- Sauvignon Blanc: Cloudy Bay, Casa Silva";
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado!";
    }


}
