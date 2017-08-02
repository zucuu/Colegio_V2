package controlador;
import modelo.AlumnoCursa;
import util.DataBase;

public class Logica implements Operaciones{
	DataBase db = null;
	AlumnoCursa[] todos;
	AlumnoCursa encontrado = null;
	
	public Logica(){
		db = new DataBase();
		db.crearBaseDatos();
		todos = db.getNomina();
	}

	@Override
	public AlumnoCursa buscarPor(String nombre) {
		for (int i = 0; i < todos.length; i++) {
			if (nombre.equalsIgnoreCase(todos[i].getAlumno().getNombre())){
				encontrado = todos[i];
			}
		}
		return encontrado;
	}

	@Override
	public AlumnoCursa buscarPor(int matricula) {
		for (AlumnoCursa alumnoencurso : todos) {
			if (matricula == alumnoencurso.getAlumno().getMatricula()){
				encontrado = alumnoencurso;
			}
		}
		return encontrado;
	}

}
