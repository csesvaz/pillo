package comercialPillo;

import java.time.LocalDate;
import java.util.List;

public class Pedido {

	private int dia=1;
	private int mes=1;
	private int ano=2022;
	
	private LocalDate fechaPedido= LocalDate.of(ano,mes,dia);
	private List<Producto> productosPedido;
	private int cantidadProductos;

	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public List<Producto> getProductosPedido() {
		return productosPedido;
	}
	public void setProductosPedido(List<Producto> productosPedido) {
		this.productosPedido = productosPedido;
	}
	public int getCantidadProductos() {
		return cantidadProductos;
	}
	public void setCantidadProductos(int cantidadProductos) {
		this.cantidadProductos = cantidadProductos;
	}
	
	
	
	/**
	 * @param dia
	 * @param mes
	 * @param ano
	 * @param productosPedido
	 */
	public Pedido(int dia, int mes, int ano, List<Producto> productosPedido) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.productosPedido = productosPedido;
	}
	public Pedido(int a, int b, int c) {
		super();
		setFechaPedido(fechaPedido);
	}
	public void mostrarPedido() {
		
		System.out.println("La fecha del pedido es "+getFechaPedido());
		
	}
	
	
	
}
