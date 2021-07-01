/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review;

import modeldatabase.Konektor;
import view.MovieView;

/**
 *
 * @author User
 */
public class Review {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Konektor DB = new Konektor();
        
        MovieView movieview = new MovieView(DB);
        movieview.setVisible(true);
    }
    
}
