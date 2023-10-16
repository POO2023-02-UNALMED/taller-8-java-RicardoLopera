package futbol;

public abstract class Futbolista implements comparable<Object>{
	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	public Futbolista() {
		nombre = "Maradona";
		edad = 30;
		posicion = "delantero";
	}
	@Override
	public String toString() {
		cadena = "El futbolista "+nombre+" tiene "+ edad + ", y juega de "+ posicion;
		return cadena;
	}
	public boolean equals(Futbolista f) {
		if (this == f) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public abstract boolean jugarConLasManos();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getPosicion() {
		return posicion;
	}
	public int compareTo(Futbolista k) {
		return 0;
	}
}
