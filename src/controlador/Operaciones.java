package controlador;
import modelo.AlumnoCursa;

public interface Operaciones {
	public AlumnoCursa buscarPor (String nombre);
	public AlumnoCursa buscarPor (int matricula);
}
