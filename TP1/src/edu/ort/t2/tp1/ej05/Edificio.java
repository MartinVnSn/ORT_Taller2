package edu.ort.t2.tp1.ej05;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Edificio {
	//private String nom;
	private List<Vivienda> viviendas;
	
	public Edificio(){
		//this.nom = nom;
		viviendas = new ArrayList<Vivienda>();
		
	}
	
	public void addVivienda(String nom, String calle, int alt, int piso, char dpto) {
		viviendas.add(new Vivienda (nom, calle, alt, piso, dpto));
	}
	
	public void addPersona(String nomViv, Persona pers) {
		int i = 0;
		boolean agregado = false;
		do {
			if(viviendas.get(i).getNombre().equals(nomViv)) {
				viviendas.get(i).agregarPersona(pers);
				agregado = true;
			}
			i++;
		} while (i < viviendas.size() && agregado == false);
		if(agregado == false) {
			System.out.println("No se encontró la vivienda indicada");
		}
	}
	
	public void addMueble(String nomViv, Mueble mueb) {
		int i = 0;
		boolean agregado = false;
		do {
			if(viviendas.get(i).getNombre().equals(nomViv)) {
				viviendas.get(i).agregarMueble(mueb);
				agregado = true;
			}
			i++;
		} while (i < viviendas.size() && agregado == false);
		if(agregado == false) {
			System.out.println("No se encontró la vivienda indicada");
		}
	}
	
	public void realizarMudanza(int pisoOr, char dptoOr, int pisoDest, char dptoDest){
		List<Vivienda> listaMudanza = new ArrayList<Vivienda>();
		//A continuación se introducen las viviendas origen y destino al arrayList listaMudanza, para simplificar la tarea.
		for(int i = 0; i < viviendas.size(); i++) {
			Vivienda viv = viviendas.get(i);
			if(viv.getDireccion().getPiso() == pisoOr) {
				if(viv.getDireccion().getDpto() == dptoOr) {
					listaMudanza.add(0, viv);
				}
			}
			if(viv.getDireccion().getPiso() == pisoDest) {
				if(viv.getDireccion().getDpto() == dptoDest) {
					listaMudanza.add(1, viv);
				}
			}
		}
		if(!listaMudanza.get(0).equals(null)) {
			
			/*Con el siguiente método se va agregando un mueble a la lista de la vivienda destino y borrando de la vivienda origen
			 Como a medida que se borra un elemento de un arrayList éste se reacomoda para que no queden posiciones vacías,
			 el índice 0 del arrayList muebles de la vivienda origen siempre tiene algo (hasta que en algún momento el arrayList
			 esté vacío, y en ese momento se saldrá del ciclo). 		
			*/
			while(!listaMudanza.get(0).isMueblesEmpty()) {
				listaMudanza.get(1).agregarMueble(listaMudanza.get(0).getMueble(0));
				listaMudanza.get(0).removeMueble(0);
			}
			//Idem ciclo anterior.
			while(!listaMudanza.get(0).isPersonasEmpty()) { 
				listaMudanza.get(1).agregarPersona(listaMudanza.get(0).getPersona(0));
				listaMudanza.get(0).removePersona(0);
			}
			
			System.out.println("SE HA REALIZADO LA MUDANZA DE " + listaMudanza.get(0).getNombre() + " A " + listaMudanza.get(1).getNombre() );
		} else {
			System.out.println("La operación no pudo realizarse");
		}
		
		
	}
	
	public void imprimirTodo() {
		for (Vivienda viv : viviendas) {
			viv.imprimirTodo();
		}
	}
	/*Los siguientes métodos son algunas pruebas hechas para aprender. No se usan en Test,
	  pero podrían usarse para averiguar si cierta vivienda existe dentro del arrayList viviendas usando como parámetro su atributo nombre.
	 */
	public void printVivienda(String nom) {
		
		Vivienda viv;
		
		viv = encontrarVivienda(nom);
		
		viv.imprimirTodo();
		
	}
	
	public Vivienda encontrarVivienda(String nom) {
		Scanner input = new Scanner(System.in);
		Vivienda viv = null;
		int i = 0;
		while(!validarVivienda(nom)) {
			System.out.println("Ingrese un nombre de vivienda válido");
			nom = input.nextLine();
		}
		do {
			if(viviendas.get(i).getNombre().equals(nom)) {
				viv = viviendas.get(i);
			}
			i++;
		} while (i < viviendas.size());
		input.close();
		return viv;
	}
	
	public boolean validarVivienda(String nom) {
		boolean esta = false;
		int i = 0;
		do {
			if(viviendas.get(i).getNombre().equals(nom)) {
				esta = true;
			}
			i++;
		} while (i < viviendas.size() && esta == false);
		return esta;
	}

}
