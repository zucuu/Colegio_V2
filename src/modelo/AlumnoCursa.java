package modelo;

public class AlumnoCursa {
	public Alumno alumno = new Alumno();
	public Materia[] materias = new Materia[3];
	public Nota[][] notas = new Nota[3][4];
	
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	
	public Materia[] getMaterias() {
		return materias;
	}
	public void setMaterias(Materia[] materias) {
		this.materias = materias;
	}
	public Nota[][] getNotas() {
		return notas;
	}
	public void setNotas(Nota[][] notas) {
		this.notas = notas;
	}
}
