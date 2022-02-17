package clases;

public class Impresion {
	private String nombre;

	private Integer dia;

	public Impresion(String nombre, Integer dia) {
		super();
		this.nombre = nombre;
		this.dia = dia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia ;
	}

	@Override
	public String toString() {
		return "Me llamo " + nombre + " y es día " + dia;
	}

}
