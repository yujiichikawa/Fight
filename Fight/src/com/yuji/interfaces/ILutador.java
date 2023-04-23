package com.yuji.interfaces;

import com.yuji.model.Lutador;

public interface ILutador {
	public void atacar(Lutador lutador);
	public void receberDano(Lutador lutador);
	public boolean verificarVida(Lutador lutador);
}
