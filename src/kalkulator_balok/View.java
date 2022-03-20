/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator_balok;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Nada
 */
public class View extends JFrame implements ActionListener{

    JLabel ljudul = new JLabel("Kalkulator Balok");
        
    JLabel panjang = new JLabel("Panjang");
    final JTextField fpanjang = new JTextField(20);
        
    JLabel lebar = new JLabel("Lebar");
    final JTextField flebar = new JTextField(20);
        
    JLabel tinggi = new JLabel("Tinggi");
    final JTextField ftinggi = new JTextField(20);
        
    JLabel lhasil = new JLabel("Hasil : ");
    JLabel lluasPersegiPanjang = new JLabel();
    JLabel lkelilingPersegiPanjang = new JLabel();
    JLabel lvolumeBalok = new JLabel();
    JLabel lluaspermukaanBalok = new JLabel();
        
    JButton bhitung = new JButton("Hitung");
    JButton breset = new JButton("Reset");
        
        public View(){
            setTitle("Kalkulator Balok");
            setSize(500, 500);
            
            setLayout(null);
            add(ljudul);
            add(panjang);
            add(fpanjang);
            add(lebar);
            add(flebar);
            add(tinggi);
            add(ftinggi);
            add(lhasil);
            add(lluasPersegiPanjang);
            add(lkelilingPersegiPanjang);
            add(lvolumeBalok);
            add(lluaspermukaanBalok);
            add(bhitung);
            add(breset);
            
            bhitung.addActionListener(this);
            breset.addActionListener(this);
            ljudul.setBounds(200,10,200,20);
            panjang.setBounds(50,60,120,20);
            fpanjang.setBounds(180,60,200,20);
            lebar.setBounds(50,100,120,20);
            flebar.setBounds(180,100,200,20);
            tinggi.setBounds(50,140,120,20);
            ftinggi.setBounds(180,140,200,20);
            lhasil.setBounds(230,180,200,20);
            lluasPersegiPanjang.setBounds(50,240,200,20);
            lkelilingPersegiPanjang.setBounds(50,260,200,20);
            lvolumeBalok.setBounds(50,280,200,20);
            lluaspermukaanBalok.setBounds(50,300,200,20);
            bhitung.setBounds(150,420,100,20);
            breset.setBounds(270,420,100,20);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
              
        }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == bhitung){
            if(fpanjang.getText().equals("") && flebar.getText().equals("") && ftinggi.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Data Masih Kosong Silahkan Input Terlebih Dahulu!");
            }else if(fpanjang.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Data Panjang Masih Kosong!");
            }else if(flebar.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Data Lebar Masih Kosong!");
            }else if(ftinggi.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Data Tinggi Masih Kosong!");
            } else {
                try{
                    int hasilPanjang= Integer.parseInt(fpanjang.getText());
                    int hasilLebar= Integer.parseInt(flebar.getText());
                    int hasilTinggi= Integer.parseInt(ftinggi.getText());
                    balok balok = new balok(hasilTinggi, hasilPanjang, hasilLebar);
                    lluasPersegiPanjang.setText     ("Luas Persegi Panjang          : " + balok.luas());
                    lkelilingPersegiPanjang.setText ("Keliling Persegi Panjang      : " + balok.keliling());
                    lvolumeBalok.setText            ("Volume Balok                        : " + balok.volume());
                    lluaspermukaanBalok.setText     ("Luas Permukaan Balok        : " + balok.luaspermukaan());
                } catch(NumberFormatException exception){
                    JOptionPane.showMessageDialog(null, "Error: " +exception.getMessage());
                }
            }
        } else if (actionEvent.getSource() == breset){
            fpanjang.setText("");
            flebar.setText("");
            ftinggi.setText("");
            lluasPersegiPanjang.setText("");
            lkelilingPersegiPanjang.setText("");
            lvolumeBalok.setText("");
            lluaspermukaanBalok.setText("");
        } 
    }
}
