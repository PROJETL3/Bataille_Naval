/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Jude
 */
public class Coordonnee {
    
    int x;
    int y;
//    boolean horizontale; // true si le bateau est horizontale, false vertical
    int toucher; // -1 aucune action , 0 il y a un bateau , 1 coord toucher
    
    public Coordonnee(int X,int Y,boolean H,int T)
    {
        this.x=X;
        this.y=Y;
    //    this.horizontale=H;
        this.toucher=T;
    }
    
}
