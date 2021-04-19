package wsStockMarket;

public interface Observer {
    public String update(Trader t, Stock s, String tipo_transaccion, double precio);

}
