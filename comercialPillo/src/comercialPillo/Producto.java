package comercialPillo;

import java.time.LocalDate;
import java.util.List;

public class Producto extends Pedido {

	private String nombreProducto;
	private String referencia;
	private float precio;
	private boolean activo;
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public float getPrecioProducto() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	/**
	 * @param precio
	 * @param fechaPedido
	 * @param productosPedido
	 * @param cantidadProductos
	 * @param nombreProducto
	 * @param referencia
	 * @param precio2
	 * @param activo
	 */
	public Producto(double precio, LocalDate fechaPedido, List<Producto> productosPedido, int cantidadProductos,
			String nombreProducto, String referencia, float precio2, boolean activo) {
		super(precio, fechaPedido, productosPedido, cantidadProductos);
		this.nombreProducto = nombreProducto;
		this.referencia = referencia;
		precio = precio2;
		this.activo = activo;
	}
	/**
	 * @param precio
	 * @param fechaPedido
	 * @param productosPedido
	 * @param cantidadProductos
	 */
	public Producto(double precio, LocalDate fechaPedido, List<Producto> productosPedido, int cantidadProductos) {
		super(precio, fechaPedido, productosPedido, cantidadProductos);
	}
	
	
}
