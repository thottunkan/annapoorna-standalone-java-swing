/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.LookAndFeel;

/**
 *
 * @author AMBADY MONU
 */
public class Theme {
    
    static FlatLightLaf  flatLightLaf = new FlatIntelliJLaf();
    static FlatDarculaLaf flatDarculaLaf = new FlatDarculaLaf();
    static FlatDarkLaf flatDarkLaf = new FlatDarkLaf();
    static FlatIntelliJLaf intelliJLaf = new FlatIntelliJLaf();
    
    public static LookAndFeel getTheme(String name){
        
        if(name.equals("flatlignt")){
            return flatLightLaf;
        }else if(name.equals("flatdarcula")){
            return flatDarculaLaf;
            
        }else if(name.equals("flatdark")){
            return flatDarkLaf;
        }else if(name.equals("intellij")){
            return intelliJLaf;
        }
        return null;
    }
    
}
