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
public interface EarthCellPhone {
   public void sendMessage(String languageType, String fileName) 
        throws InvalidLanguageException;
   public void readMessage(String fileName);
}
