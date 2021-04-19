package wsStockMarket;

import java.util.ArrayList;
import java.util.List;

public class StockMarket {
	private List<Stock > acciones =new ArrayList<Stock>();
	private List<Trader> traders =new ArrayList<Trader>();

	public StockMarket() {

	}

	public void agregarAccion(Stock accion){
		acciones.add(accion);
	}

	public void agregarTrader(Trader trader){
		traders.add(trader);
	}

	public void register(Trader t, Stock s) {
		s.attach(t);
	}

	public String trade(Trader t, Stock s, String tipo_transaccion, double precio) {
		return s.notificar(t, s, tipo_transaccion, precio);
	}
    
}