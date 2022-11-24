package comercialPillo;

import java.util.List;

public class Negocio {

	private String nombre;
	private String direcccion;
	private List<String> cooperativas;
	private Pedido pedido1;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDirecccion() {
		return direcccion;
	}
	public void setDirecccion(String direcccion) {
		this.direcccion = direcccion;
	}
	public List<String> getCooperativas() {
		return cooperativas;
	}
	public void setCooperativas(List<String> cooperativas) {
		this.cooperativas = cooperativas;
	}
	public Pedido getPedido1() {
		return pedido1;
	}
	public void setPedido1(Pedido pedido1) {
		this.pedido1 = pedido1;
	}
	/**
	 * @param nombre
	 * @param direcccion
	 * @param cooperativas
	 * @param pedido1
	 */
	public Negocio(String nombre, String direcccion, List<String> cooperativas, Pedido pedido1) {
		super();
		this.nombre = nombre;
		this.direcccion = direcccion;
		this.cooperativas = cooperativas;
		this.pedido1 = pedido1;
	}
	/**
	 * 
	 */
	public Negocio() {
	}
	
	
	
}
