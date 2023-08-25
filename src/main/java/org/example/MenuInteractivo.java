package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuInteractivo {
	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	private Scanner scanner = new Scanner(System.in);

	public void mostrarMenu() {
		boolean salir = false;

		while (!salir) {
			System.out.println("Menú:");
			System.out.println("1. Crear Auto");
			System.out.println("2. Crear Motocicleta");
			System.out.println("3. Ver Vehículos");
			System.out.println("4. Salir");
			System.out.print("Selecciona una opción: ");

			int opcion = scanner.nextInt();
			scanner.nextLine();

			switch (opcion) {
				case 1:
					crearAuto();
					break;
				case 2:
					crearMotocicleta();
					break;
				case 3:
					mostrarListaVehiculos();
					break;
				case 4:
					salir = true;
					System.out.println("Saliendo del programa.");
					break;
				default:
					System.out.println("Opción inválida. Por favor selecciona una opción válida.");
					break;
			}
		}
	}

	public void crearAuto() {
		System.out.print("Introduce la marca del auto: ");
		String marca = scanner.nextLine();
		System.out.print("Introduce el modelo del auto: ");
		String modelo = scanner.nextLine();


		Vehiculo auto = new Auto(marca, modelo);
		vehiculos.add(auto);
		System.out.println("Auto creado exitosamente.");
	}

	public void crearMotocicleta() {
		System.out.print("Introduce la marca de la motocicleta: ");
		String marca = scanner.nextLine();
		System.out.print("Introduce el modelo de la motocicleta: ");
		String modelo = scanner.nextLine();


		Vehiculo moto = new Motocicleta(marca, modelo);
		vehiculos.add(moto);
		System.out.println("Motocicleta creada exitosamente.");
	}

	public void mostrarListaVehiculos() {
		System.out.println("Lista de Vehículos:");
		for (Vehiculo vehiculo : vehiculos) {
			System.out.println(vehiculo.toString());
		}
	}


	public static void main(String[] args) {
		MenuInteractivo menu = new MenuInteractivo();
		menu.mostrarMenu();
	}

}
