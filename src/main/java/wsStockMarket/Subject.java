package wsStockMarket;

public interface Subject {


        public void attach(Trader observador);


        public String notificar(Trader t, Stock s, String tipo_transaccion, double precio);


}
