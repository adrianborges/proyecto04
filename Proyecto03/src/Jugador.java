/*
 * La definicion de la clase mediante la palabra reservada Jugador
 * public class nombreClase
 */
public class Jugador {
	
	//propiedades private
	private String nombre;// almacenara el nombre
	private String apellido1;// los apellidos
	private String apellido2;
	private int edad;// edad 
	private int puntos;// puntos obtenidos
	private int id;// una identificacion
	
	/*
	 * Vamos a crear metodos que utilizaremos en la ventana principal con set y get
	 * podemos crearlos automaticamente mediante la pestaña Source y
	 * generate setters and getters
	 */
	// 
	public Jugador() {
		System.out.println("Perfil Player");
	}

	public String getNombre(){ // este seria el metodo get
		return nombre;
	}

	public void setNombre(String nombre) { // este seria el metodo set
		this.nombre = nombre;
	}

	public String getApellido1() { // creamos un metodo para nombre con get
		return apellido1;
	}

	public void setApellido1(String apellido1) { //creamos un metodo con set
		this.apellido1 = apellido1;
	}

	public String getApellido2() {// creamos un metodo para nombre con get
		return apellido2;
	}

	public void setApellido2(String apellido2) {//creamos un metodo con set
		this.apellido2 = apellido2;
	}

	public int getEdad() {// creamos un metodo para nombre con get
		return edad;
	}

	public void setEdad(int edad) {//creamos un metodo con set
		this.edad = edad;
	}

	public int getPuntos() {// creamos un metodo para nombre con get
		return puntos;
	}

	public void setPuntos(int puntos) {//creamos un metodo con set
		this.puntos = puntos;
	}

	public int getId() {// creamos un metodo para nombre con get
		return id;
	}

	public void setId(int id) {//creamos un metodo con set
		this.id = id;
	}

	
	}
