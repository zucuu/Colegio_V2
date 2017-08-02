import controlador.Logica;
import modelo.AlumnoCursa;
import vista.Pantalla;

public class AppColegio {
	public static void main(String[] args) {
		
		Pantalla vista = new Pantalla();
		Logica controlador = new Logica();
		
		String nombreAlumno = vista.ingresarValor( "Buscar información del alumno" );
		AlumnoCursa encontrado = controlador.buscarPor( nombreAlumno );
		String mensaje = "";
		
		if( encontrado != null ){
			for (int i = 0; i < encontrado.getMaterias().length; i++) {
				mensaje = mensaje + encontrado.getMaterias()[i].getNombre() + "\n";
				for (int j = 0; j < encontrado.getNotas()[i].length; j++) {
					mensaje = mensaje + encontrado.getNotas()[i][j].getFecha() + " : " 
							+ encontrado.getNotas()[i][j].getCalificacion() + "\n";
				}						
			}
			vista.mostrarMensaje( "Alumno: " + encontrado.getAlumno().getApellido()+ " " 
			+ encontrado.getAlumno().getNombre() 
			+ "\nMatricula: " + encontrado.getAlumno().getMatricula() + "\n" + mensaje);
			
		} else {
			vista.mostrarMensaje( "No existe este paciente en la BD" );
		}
		
		int matriculaAlumno = Integer.parseInt(vista.ingresarValor( "Buscar información de la matrícula" ));
		encontrado = controlador.buscarPor( matriculaAlumno );
		mensaje = "";
		
		if( encontrado != null ){
			for (int i = 0; i < encontrado.getMaterias().length; i++) {
				mensaje = mensaje + encontrado.getMaterias()[i].getNombre() + "\n";
				for (int j = 0; j < encontrado.getNotas()[i].length; j++) {
					mensaje = mensaje + encontrado.getNotas()[i][j].getFecha() + " : " 
							+ encontrado.getNotas()[i][j].getCalificacion() + "\n";
				}						
			}
			vista.mostrarMensaje( "Alumno: " + encontrado.getAlumno().getApellido()+ " " 
			+ encontrado.getAlumno().getNombre() 
			+ "\nMatricula: " + encontrado.getAlumno().getMatricula() + "\n" + mensaje);
			
		} else {
			vista.mostrarMensaje( "No existe este paciente en la BD" );
		}
	}
}
