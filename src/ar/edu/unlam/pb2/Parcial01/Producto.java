package ar.edu.unlam.pb2.Parcial01;

public class Producto{
	
	private Integer puntoDeReposicion;
	
	public Producto(Integer codigo, String nombre, Double precio, Integer puntoDeReposicion) {
		// TODO: Completar el constructor para el correcto funcionamiento del software
		this.setPuntoDeReposicion(puntoDeReposicion);
		
	}

	
	
	// TODO: Completar con los getters y setters necesarios
	public Integer getPuntoDeReposicion() {
		return puntoDeReposicion;
	}

	public void setPuntoDeReposicion(Integer puntoDeReposicion) {
		this.puntoDeReposicion = puntoDeReposicion;
	}


	
}
