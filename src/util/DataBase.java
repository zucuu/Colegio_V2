package util;

import modelo.Alumno;
import modelo.AlumnoCursa;
import modelo.Materia;
import modelo.Nota;

public class DataBase {
	
	private Alumno[] alumnos = new Alumno[2];
	private Materia[] materias = new Materia[5];
	private AlumnoCursa[] nomina = new AlumnoCursa[2];

	
	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public Materia[] getMaterias() {
		return materias;
	}

	public AlumnoCursa[] getNomina() {
		return nomina;
	}

	public void setAlumnos() {		
		Alumno tamara = new Alumno();
		tamara.setApellido("Aquino");
		tamara.setNombre("Tamara");
		tamara.setMatricula(123);
		alumnos [0] = tamara;
		
		Alumno marina = new Alumno();
		marina.setApellido("Villaggi");
		marina.setNombre("Marina");
		marina.setMatricula(456);
		alumnos [1] = marina;

	}

	public void setMaterias() {		
		Materia matematica = new Materia();
		matematica.setNombre("Matemática");
		materias [0] = matematica;
		
		Materia fisica = new Materia();
		fisica.setNombre("Física");
		materias [1] = fisica;
		
		Materia quimica = new Materia();
		quimica.setNombre("Química");
		materias [2] = quimica;
		
		Materia biologia = new Materia();
		biologia.setNombre("Biologia");
		materias [3] = biologia;
		
		Materia historia = new Materia();
		historia.setNombre("Historia");
		materias [4] = historia;
	}

	public void setNomina() {		
		AlumnoCursa a = new AlumnoCursa();
		AlumnoCursa b = new AlumnoCursa();
		
		
		Materia[] materiasA = {this.materias[0],this.materias[1]};
		Nota[][] notasUno = new Nota [2][1];
		
		Nota mate = new Nota();
		mate.setCalificacion(7);
		mate.setFecha("15/7/2017");
		
		Nota fisi = new Nota();
		fisi.setCalificacion(8);
		fisi.setFecha("15/6/2017");
		
		notasUno[0][0] = mate;
		notasUno[1][0] = fisi;
		
		a.setAlumno(alumnos[0]);
		a.setMaterias( materiasA );
		a.setNotas(notasUno);
		
		nomina[0] = a;
		
		
		Materia[] materiasB = {this.materias[2],this.materias[3]};
		Nota[][] notasBUno = new Nota [2][1];
		
		Nota quimi = new Nota();
		quimi.setCalificacion(6);
		quimi.setFecha("10/7/2017");
		
		Nota bio = new Nota();
		bio.setCalificacion(9);
		bio.setFecha("10/6/2017");
		
		notasBUno[0][0] = quimi;
		notasBUno[1][0] = bio;
		
		b.setAlumno(alumnos[1]);
		b.setMaterias( materiasB );
		b.setNotas(notasBUno);
				
		nomina[1] = b;
	}
	
	public void crearBaseDatos(){
		setAlumnos();
		setMaterias();
		setNomina();
	}
}
