package com.yuji.app;

import java.util.Scanner;

import com.yuji.enums.EnumArm;
import com.yuji.enums.EnumArma;
import com.yuji.enums.EnumNivel;
import com.yuji.model.Lutador;
import com.yuji.services.Service_Luta;

public class App {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String name = scr.nextLine();
		System.out.println("Peso:");
		float peso = scr.nextFloat();
		System.out.println("Idade:");
		int idade = scr.nextInt();
		System.out.println("Armadura:");
		String armadura = scr.next().toUpperCase();
		System.out.println("arma:");
		String arma = scr.next().toUpperCase();
		System.out.println("nivel:");
		String nivel = scr.next().toUpperCase();
		
		Service_Luta.exec(new Lutador(name, peso, idade, EnumArm.valueOf(armadura), 
				EnumArma.valueOf(arma), EnumNivel.valueOf(nivel)), 
				new Lutador("Mario Marcos",70.0f,25,EnumArm.OURO,EnumArma.ESPADA_FERRO,EnumNivel.OURO));
	}

}
