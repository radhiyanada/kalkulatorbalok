package kalkulator_balok;

public class balok extends persegipanjang implements MenghitungRuang{
    float tinggi;
    float volumeBalok;
    float luaspermukaanBalok;

    public balok(float tinggi, float lebar, float panjang) {
        super(lebar, panjang);
        this.tinggi = tinggi;
    }

    public float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public float volume() {
        volumeBalok = super.luas()*tinggi;
        return volumeBalok;
    }

    @Override
    public float luaspermukaan() {
        luaspermukaanBalok = 2*((super.luas()) + (super.getLebar()*tinggi) + (super.getPanjang()*tinggi));
        return luaspermukaanBalok;
    }

    String luasPermukaan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
