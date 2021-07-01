/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.Model;

/**
 *
 * @author User
 */
public class Controller {
   Model modelmovie;
   Object[][] modelmovies = new Object[150][4];
   
    private Object[][] movie;
    public Controller(Model modelmovie){
       this.modelmovie = modelmovie;
    }
    
    public Object[][] index(){
       movie = modelmovie.getMovie();
       return movie;
   } 
    
    public void simpan(String judul, double alur, double penokohan, double akting){
        boolean found = false;
        for (int i = 0; movie[i][0] != null; i++) {
            if (movie[i][0].toString().equals(judul)){
                found = true;
                break;
            }
        }
        if (found){
            JOptionPane.showMessageDialog(null, "Movie telah tersedia di Database");
        } else {
            if (alur > 5.0 || penokohan > 5.0 || akting > 5.0){
               JOptionPane.showMessageDialog(null, "Maksimal yang diinput adalah 5"); 
            } else if(alur < 0 || penokohan < 0 || akting < 0){
                JOptionPane.showMessageDialog(null, "Minimal yang diinput adalah 0");
            } else {
                modelmovie.insert(judul, alur, penokohan, akting);
                JOptionPane.showMessageDialog(null, "Data Movie Berhasil Ditambahkan");
            }
        }
    }
    
    public void update(String judul, double alur, double penokohan, double akting){
        boolean found = false;
        int num = -1;
        for (int i = 0; movie[i][0] != null; i++) {
            if(movie[i][0].toString().equals(judul)){
                num = i;
                found = true;
                break;
            }
        }
        
        if (found){
            if(alur > 5.0 || penokohan > 5.0 || akting > 5.0){
               JOptionPane.showMessageDialog(null,"Maksimal yang diinput adalah 5"); 
            } else if(alur < 0 || penokohan < 0 || akting < 0){
                JOptionPane.showMessageDialog(null,"Minimal yang diinput adalah 0");
            } else{
                modelmovie.update(movie[num][0].toString(), alur, penokohan, akting);
                JOptionPane.showMessageDialog(null,"Data Movie Berhasil Diupdate");
            }
        } else {
           JOptionPane.showMessageDialog(null,"Movie Tidak Tersedia"); 
        }
    }
    
    public void delete(String judul){
        boolean found = false;
        int num = -1;
        for (int i = 0; movie[i][0] != null; i++) {
            if(movie[i][0].toString().equals(judul)){
                num = i;
                found = true;
                break;
            }
        }
        
        if (found){
            modelmovie.delete(movie[num][0].toString());
            JOptionPane.showMessageDialog(null,"Data Movie Berhasil Dihapus");
        }else{
           JOptionPane.showMessageDialog(null,"Movie Tidak Tersedia"); 
        }
    }
}
