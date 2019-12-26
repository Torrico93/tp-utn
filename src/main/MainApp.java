package main;

import javax.swing.JOptionPane;

import classes.Cajero;
import classes.Cono;
import classes.Pedido;
import classes.Pote;
import classes.Vaso;

public class MainApp {

	public static void main(String[] args) {
		int tipo = 0;
		boolean fin = false;
		Cajero c1 = new Cajero(5);
		Cajero c2 = new Cajero(10);
		Cajero c3 = new Cajero(15);
		Pedido p = new Pedido();

		while (!fin) {
			switch (Integer.parseInt(JOptionPane.showInputDialog("Por cual caja desea hacer el pedido?"))) {
			case 1:
				if (c1.getPedidosRealizados() < c1.getMaxPedidos()) {
					c1.hacerPedido();
					fin = true;
				} else {
					JOptionPane.showMessageDialog(null, "La caja seleccionada no puede tomar más pedidos por hoy");
				}
				break;
			case 2:
				if (c2.getPedidosRealizados() < c2.getMaxPedidos()) {
					c2.hacerPedido();
					fin = true;
				} else {
					JOptionPane.showMessageDialog(null, "La caja seleccionada no puede tomar más pedidos por hoy");
				}
				break;
			case 3:
				if (c3.getPedidosRealizados() < c3.getMaxPedidos()) {
					c3.hacerPedido();
					fin = true;
				} else {
					JOptionPane.showMessageDialog(null, "La caja seleccionada no puede tomar más pedidos por hoy");
				}
				break;
			default:
				JOptionPane.showMessageDialog(null, "Caja inválida, por favor elija una de las 3 cajas disponibles");
				break;
			}
			fin = false;

			while (!fin) {
				tipo = Integer.parseInt(JOptionPane.showInputDialog("Qué desea pedir?\n1 - Cono\n2 - Vaso\n3 - Pote"));

				switch (tipo) {
				case 1:
					Cono cono = new Cono();
					cono.setGusto1(JOptionPane.showInputDialog("Ingrese el primer gusto"));
					cono.setGusto2(JOptionPane.showInputDialog("Ingrese el segundo gusto"));
					p.setC(cono);
					break;

				case 2:
					Vaso vaso = new Vaso();
					vaso.setGusto1(JOptionPane.showInputDialog("Ingrese el primer gusto"));
					vaso.setGusto2(JOptionPane.showInputDialog("Ingrese el segundo gusto"));
					vaso.setGusto3(JOptionPane.showInputDialog("Ingrese el tercer gusto"));
					vaso.setOpcional(Integer.parseInt(JOptionPane.showInputDialog(
							"Desea agregar un opcional?\n1 - Crema de vainilla\n2 - Chocolate fundido\n3 - No")));
					p.setV(vaso);
					break;

				case 3:
					Pote pote = new Pote();
					pote.setGusto1(JOptionPane.showInputDialog("Ingrese el primer gusto"));
					pote.setGusto2(JOptionPane.showInputDialog("Ingrese el segundo gusto"));
					pote.setGusto3(JOptionPane.showInputDialog("Ingrese el tercer gusto"));
					pote.setGusto4(JOptionPane.showInputDialog("Ingrese el cuarto gusto"));
					pote.setOpcional(Integer.parseInt(JOptionPane.showInputDialog(
							"Desea agregar un opcional?\n1 - Crema de vainilla\n2 - Chocolate fundido\n3 - Almendras\n4 - No")));
					p.setP(pote);
					break;

				default:
					JOptionPane.showMessageDialog(null, "Operación incorrecta");
					break;
				}

				if (Integer.parseInt(JOptionPane.showInputDialog(
						"Desea pedir algo mas? (Recuerde que si pide un producto que ya pidió, éste se sobreescribirá,\n. De otra forma, podríamos agregar instancias de'\nPedidos y más helados a cada Pedido)\n1 - Sí\n2 - No")) != 1) {
					fin = true;
				}
			}

			JOptionPane.showMessageDialog(null, p.getPedidoCompleto());
		}
	}
}
