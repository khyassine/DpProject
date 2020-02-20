package com.sqli.dp.template;

public abstract class Jeu {

	abstract void louerTerrain();
	abstract void commencerAJouer();
	abstract void prendreUneDouche();
	
	public final void jouer() {
		louerTerrain();
		commencerAJouer();
		prendreUneDouche();
	}
	
}
