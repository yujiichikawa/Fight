package com.yuji.model;

import java.util.Random;

public class Luta {
	private Lutador lutador01;
	private Lutador lutador02;
	private Lutador vencedor;

	public Luta(Lutador lutador01, Lutador lutador02) {
		this.lutador01 = lutador01;
		this.lutador02 = lutador02;
	}
	
	public void comecar() {
		Random random = new Random();
		int num = random.nextInt(1);
		while(true) {
			if(num == 0) {
				System.out.println("Antes:"+lutador02.toStringBasic());
				lutador01.atacar(lutador02);
				System.out.println("Depois:"+lutador02.toStringBasic());
				num = 1;
				if(lutador02.getVida() == 0) {setVencedor(lutador01); break;} 
				continue;
			}else {
				System.out.println("Antes:"+lutador01.toStringBasic());
				lutador02.atacar(lutador01);
				System.out.println("Depois:"+lutador01.toStringBasic());
				num = 0;
				if(lutador01.getVida() == 0) {setVencedor(lutador02); break;}
				continue;
			}
		}
		System.out.println("Luta Finalizada:\nVendedor:\n"+getVencedor().toString());
	}

	public Lutador getLutador01() {
		return lutador01;
	}


	public Lutador getLutador02() {
		return lutador02;
	}


	public Lutador getVencedor() {
		return vencedor;
	}

	public void setVencedor(Lutador vencedor) {
		this.vencedor = vencedor;
	}
}
