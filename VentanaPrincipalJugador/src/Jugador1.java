
public class Jugador1 {
	/*
	 *  creamos las variables que vamos a utilizar y las hacemos "private"
	 *  para utilizarlas solo en nuestra clase
	 */
	private String Nombre;
	private String Apellido1;
	private String Apellido2;
	private int Edad;
	private String Alias;

	/*
	 *  en la pestaña Source creamos los setters y getters correspondientes a las variables
	 *  para luego utilizarlos en nuestra ventana principal
	 */
	public Jugador1() {
	}



	public String getNombre() {
		return Nombre;
	}



	public void setNombre(String nombre) {
		Nombre = nombre;
	}



	public String getApellido1() {
		return Apellido1;
	}



	public void setApellido1(String apellido1) {
		Apellido1 = apellido1;
	}



	public String getApellido2() {
		return Apellido2;
	}



	public void setApellido2(String apellido2) {
		Apellido2 = apellido2;
	}



	public int getEdad() {
		return Edad;
	}



	public void setEdad(int edad) {
		if(edad>=1 && edad<100)
			this.Edad=edad;
		else {
			this.Edad=0;
		}
		
	}



	public String getAlias() {
		return Alias;
	}



	public void setAlias(String alias) {
		Alias=alias;
	}


	}

