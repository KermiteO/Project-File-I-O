/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
/**
 *
 * @author Omar and Luke
 *output: messages translated into alien languages from earth language
 *purpose: translate earth text messages into alien languages and sent them to alien cellphones
 */
public interface EarthCellPhone {
   public void sendMessage(String languageType, String fileName) 
        throws InvalidLanguageException;
   public void readMessage(String fileName);
}
