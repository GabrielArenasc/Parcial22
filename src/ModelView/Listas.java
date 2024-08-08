/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelView;

import java.util.ArrayList;

/**
 *
 * @author gabou
 */
public class Listas {
    ArrayList<String> fru;
    public void fruta(ArrayList<String> fruta){
        fru.add("Las frutas que hordenaste son: ");
        fru.addAll(fruta);
    }
    ArrayList<String> ver;
    public void verdura(ArrayList<String> verdura){
        ver.add("Las frutas que hordenaste son: ");
        ver.addAll(verdura);
    }
    
    public ArrayList fr(){
        return fru;
    }
    public ArrayList ve(){
        return ver;
    }
}
