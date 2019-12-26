package classes;

public class Cajero {
	int maxPedidos;
	int pedidosRealizados = 0;
	public Cajero(int maxPedidos) {
		this.maxPedidos = maxPedidos;
	}
	
	public void hacerPedido() {
		pedidosRealizados++;
	}

	public int getMaxPedidos() {
		return maxPedidos;
	}

	public int getPedidosRealizados() {
		return pedidosRealizados;
	}
	
}
