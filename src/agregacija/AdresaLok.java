package agregacija;

class AdresaLok {
	private int stanBr;
	private String lokacija;

	public AdresaLok(int stanBr, String lokacija) {

		this.stanBr = stanBr;
		this.lokacija = lokacija;
	}

	public int getStanBr() {
		return stanBr;
	}

	public String getLokacija() {
		return lokacija;
	}
}

class Kupuvac {
	private int kupuvacID;
	private AdresaLok adresaLinija;

	public Kupuvac(int kupuvacID, AdresaLok adresaLinija) {
		this.kupuvacID = kupuvacID;
		this.adresaLinija = adresaLinija;
	}

	public int getKupuvacID() {
		return kupuvacID;
	}

	public AdresaLok getAdresaLinija() {
		return adresaLinija;
	}
}

class Dostava {
	public static void main(String[] args) {
		String lokacija = new String("Naselba1, Zgrada2");
		AdresaLok adresa = new AdresaLok(15, lokacija);
		Kupuvac tom = new Kupuvac(1212, adresa);
		System.out.println("Kupuvac ID:" + tom.getKupuvacID());
		System.out.println("Stan br:" + tom.getAdresaLinija().getStanBr());
		System.out.println("Lokacija:" + tom.getAdresaLinija().getLokacija());
		System.out.println();
		AdresaLok adresa1 = new AdresaLok(32, lokacija);
		Kupuvac marko = new Kupuvac(1673, adresa1);
		System.out.println("Kupuvac ID:" + marko.getKupuvacID());
		System.out.println("Stan br:" + marko.getAdresaLinija().getStanBr());
		System.out.println("Lokacija:" + marko.getAdresaLinija().getLokacija());
	}

}