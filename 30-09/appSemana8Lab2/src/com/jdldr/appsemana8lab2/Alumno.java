package com.jdldr.appsemana8lab2;

public class Alumno {
	//Atributos
	public int codigo;
	public String nombre;
	public int nota1,nota2;
	
	//Operaciones
	public double promedio() {
		return(nota1 + nota2)/2.0;
	}
	public String estado(){
		if(promedio() >= 10.5)
			return "Aprobado";
		else
			return "Desaprobado";
	}
	

}
