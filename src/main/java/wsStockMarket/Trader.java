package wsStockMarket;

public class Trader implements Observer {
	String nombre= "";

	public Trader(String nombre, StockMarket mercado_acciones) {
		this.nombre=nombre;
		mercado_acciones.agregarTrader(this);
	}


	@Override
	public String update(Trader t, Stock s, String tipo_transaccion, double precio) {
		String aviso="";
		aviso=nombre+":The latest trade is Trader:"+t.nombre+" "+tipo_transaccion+" $"+precio+" Stock: "+s.tipo;
		//t1:The latest trade is Trader:t1 buy $1.0 Stock: MSFT

		return aviso;
	}
}