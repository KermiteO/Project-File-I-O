/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author kermi
 */
public interface AlienCellPhone {
   public void alienSendText(String fileName);
   public void alienReadText(String fileName);
   //translateText returns the name of the output file
   //that has the translated message
   public String translateText(String fileName);
}