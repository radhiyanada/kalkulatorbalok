package kalkulator_balok;

import javax.swing.JOptionPane;

public class persegipanjang implements MenghitungBidang {
    public float lebar, panjang;
    float luas_persegipanjang;
    float keliling_Persegipanjang;

    public persegipanjang(float lebar, float panjang) {
        this.lebar = lebar;
        this.panjang = panjang;
    }

    public float getLebar() {
        return lebar;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public float getPanjang() {
        return panjang;
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }
            

    @Override
    public float luas() {
        luas_persegipanjang = panjang*lebar;
        return  luas_persegipanjang;
    }

    @Override
    public float keliling() {
        keliling_Persegipanjang = 2*(panjang + lebar);
        return keliling_Persegipanjang;
    }
}
