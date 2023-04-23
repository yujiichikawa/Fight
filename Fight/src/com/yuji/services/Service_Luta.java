package com.yuji.services;

import com.yuji.model.Luta;
import com.yuji.model.Lutador;

public class Service_Luta {
	public static void exec(Lutador lutador01,Lutador lutador02) {
		new Luta(lutador01, lutador02).comecar();
	}
}
