package jarduera3_4;

public class Alimentos {

	private String izena;
	private String egoera;
	private Double kaloriak;
	private Double koipeak;
	private Double proteinak;
	private Double karbohidratoak;
	private String mota;
	
	
	
	public Alimentos() {
		super();
	}


	public Alimentos(String izena, String egoera, Double kaloriak, Double koipeak, Double proteinak,
			Double karbohidratoak, String mota) {
		super();
		this.izena = izena;
		this.egoera = egoera;
		this.kaloriak = kaloriak;
		this.koipeak = koipeak;
		this.proteinak = proteinak;
		this.karbohidratoak = karbohidratoak;
		this.mota = mota;
	}


	@Override
	public String toString() {
		return "Alimentos [izena=" + izena + ", egoera=" + egoera + ", kaloriak=" + kaloriak + ", koipeak=" + koipeak
				+ ", proteinak=" + proteinak + ", karbohidratoak=" + karbohidratoak + ", mota=" + mota + "]";
	}
	
	
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	public String getEgoera() {
		return egoera;
	}
	public void setEgoera(String egoera) {
		this.egoera = egoera;
	}
	public Double getKaloriak() {
		return kaloriak;
	}
	public void setKaloriak(Double kaloriak) {
		this.kaloriak = kaloriak;
	}
	public Double getKoipeak() {
		return koipeak;
	}
	public void setKoipeak(Double koipeak) {
		this.koipeak = koipeak;
	}
	public Double getProteinak() {
		return proteinak;
	}
	public void setProteinak(Double proteinak) {
		this.proteinak = proteinak;
	}
	public Double getKarbohidratoak() {
		return karbohidratoak;
	}
	public void setKarbohidratoak(Double karbohidratoak) {
		this.karbohidratoak = karbohidratoak;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	
	
	
	
	
}
