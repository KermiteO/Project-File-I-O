
package lab4;
import java.io.*;
/**
 *
 * @author Omar and Luke
 * output: messages translated into alien languages from earth language
 * purpose: translate earth text messages into alien languages and sent them to alien cellphones
 */
public class EarthText implements EarthCellPhone
{
    public void sendMessage(String languageType, String fileName) throws InvalidLanguageException //sends text from an earth phone         
    {         
       try
       {
           File f = new File(fileName);
           
           if(!f.exists())
           {
               if(!languageType.equals("Earth") 
               && !languageType.equals("Klingon")
               && !languageType.equals("Vulcan"))
               {
                    throw new InvalidLanguageException("Language: " + languageType + " not supported");
               }
               else
               {
                    throw new IOException();
               }
           }
           else
           {
               FileWriter fw = new FileWriter(f);
           
                if(languageType.equals("Earth"))
                    fw.write("This is earth to earth text.");
                else if(languageType.equals("Klingon"))
                    fw.write("This is earth to Klingon text.");    
                else if(languageType.equals("Vulcan"))
                    fw.write("This is earth to Vulcan text.");
                

                fw.close();

                System.out.println(languageType + " Message Sent");
           }                  
       }
       catch(IOException e)
       {
           System.out.println("File: " + fileName + " does not exist");
       }
       
    }
    
    public void readMessage(String fileName) //reads text on earth phone
    {
        try
        {
            File file = new File(fileName);
            
            BufferedReader br = new BufferedReader(new FileReader(file)); 
  
            String st; 
            
            while ((st = br.readLine()) != null) 
            {
              System.out.println(st); 
            }
        }catch(IOException e)
        {
            System.out.println("File: " + fileName + " does not exist");
        }
    }
}
