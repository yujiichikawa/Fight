package com.yuji.model;

import com.yuji.interfaces.ILutador;

import com.yuji.model.Lutador;

public class Lutador extends Pessoa implements ILutador {
	private EnumArm armadura;
	private EnumNivel nivel;
	private EnumArma arma;
	private int vida;
	private int defesa;
	private int ataque;
	
	public Lutador(String name,float peso,int idade,EnumArm armadura,EnumArma arma,EnumNivel nivel) {
		super(name, idade, peso);
		this.armadura = armadura;
		this.arma = arma;
		this.nivel = nivel;
		definirVida(nivel);;
		definirDefesa(armadura);
		definirAtaque(arma);
		
	}

	public void definirDefesa(EnumArm armadura) {
		switch(armadura) {
		case BRONZE:setDefesa(5);setVida(getVida()+getDefesa());break;
		case PRATA:setDefesa(10);setVida(getVida()+getDefesa());break;
		case OURO:setDefesa(15);setVida(getVida()+getDefesa());break;
		case DIAMANTE:setDefesa(20);setVida(getVida()+getDefesa());break;
		default:
			throw new Error("Armadura não encontrada");
		}
	}
	
	public void definirVida(EnumNivel nivel) {
		switch(nivel) {
		case BRONZE:setVida(5);break;
		case PRATA:setVida(10);break;
		case OURO:setVida(15);break;
		case DIAMANTE:setVida(20);break;
		default:
			throw new Error("Nível não encontrado");
		}
	}
	
	public void definirAtaque(EnumArma arma) {
		switch(arma) {
		case SOCO:setAtaque(5);break;
		case ESPADA_MADEIRA:setAtaque(10);break;
		case ESPADA_FERRO:setAtaque(15);break;
		case ESPADA_DIAMANTE:setAtaque(20);break;
		default:
			throw new Error("Arma não encontrada");
		}
	}

	@Override
	public void atacar(Lutador lutador) {
		if(verificarVida(lutador)) {			
			lutador.receberDano(this);
		}else {
			lutador.receberDano(this);
			System.out.println("Lutador:"+lutador.getName()+"\n-> Derrotado");
		}
	}

	@Override
	public void receberDano(Lutador lutador) {
		if(lutador.getAtaque()>=getVida()) {
			setVida(0);
		}else {
			setVida(getVida()-lutador.getAtaque());
		}
		
	}
	
	@Override
	public boolean verificarVida(Lutador lutador) {
		if(getAtaque()>=lutador.getVida()) {
			return false;
		}else {
			return true;
		}
	}
	
	public EnumArm getArmadura() {
		return armadura;
	}

	public void setArmadura(EnumArm armadura) {
		this.armadura = armadura;
	}

	public EnumNivel getNivel() {
		return nivel;
	}

	public void setNivel(EnumNivel nivel) {
		this.nivel = nivel;
	}

	public EnumArma getArma() {
		return arma;
	}

	public void setArma(EnumArma arma) {
		this.arma = arma;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	@Override
	public String toString() {
		return "Lutador [armadura=" + armadura + ", nivel=" + nivel + ", arma=" + arma + ", vida=" + vida + ", defesa="
				+ defesa + ", ataque=" + ataque + "]";
	}
	
	public String toStringBasic() {
		return "Lutador:"+getName()+"\nvida=" + vida;
	}
}
