package wsStockMarket;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {
	String tipo="";
	double precio_ini;
	private List<Trader> traders =new ArrayList<Trader>();

	public Stock(String tipo, double precio_inicial, StockMarket mercado_acciones) {
		this.tipo=tipo;
		this.precio_ini=precio_inicial;
		mercado_acciones.agregarAccion(this);
	}


	@Override
	public void attach(Trader observador) {
		this.traders.add(observador);
	}


	@Override
	public String notificar(Trader t, Stock s, String tipo_transaccion, double precio) {
		String comenLog="";
		for (Trader observador: traders){
			comenLog=comenLog +  observador.update(t, s, tipo_transaccion, precio)+"\n";
		}
		comenLog=comenLog.substring(0,comenLog.length()-1);
		System.out.println("Tipo de Transaccion ::: " + tipo_transaccion);
		System.out.println(comenLog);
		return comenLog;
	}
}