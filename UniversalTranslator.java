/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.util.*;
import java.io.*;
/**
 *
 * @author kermi
 */
public class UniversalTranslator implements EarthCellPhone
{
   private AlienCellPhone alien;
   
   public UniversalTranslator() {}
   
   public UniversalTranslator(AlienCellPhone m)
   {
       alien = m;
   }
   
   public void sendMessage(String languageType, String fileName) throws InvalidLanguageException
   {
       try
       {
           File f = new File(fileName);
           
           FileWriter fw = new FileWriter(f);
           
           if(languageType.equals("Earth"))
                fw.write("This is earth to earth text.");
           else if(languageType.equals("Klingon"))
                fw.write("This is earth to Klingon text.");    
           else if(languageType.equals("Vulcan"))
                fw.write("This is earth to Vulcan text.");
                   
           fw.close();
           
           System.out.println(languageType + " Message Sent");
                     
       }catch(IOException e)
       {
           System.out.println("File: " + fileName + " does not exist");
       }
       
         
   }
   
   public void readMessage(String fileName)
   {
       try
        {
            File file = new File(fileName);
            
            Scanner sc = new Scanner(file); 
  
            String stringBuffer = "";
            
            while (sc.hasNextLine()) 
                stringBuffer += sc.nextLine();
            
            if(fileName.equals("Earth.txt"))
                System.out.println(stringBuffer);
            else
            {
                alien.translateText(fileName);
                alien.alienReadText(fileName);
            }

            
            
           
        }catch(IOException e)
        {
           System.out.println("File: " + fileName + " does not exist");
        }
   }
   
}
