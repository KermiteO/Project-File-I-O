
import java.util.*;
import java.io.*;
/**
 *
 * @author Omar and Luke
 * output: messages translated into alien languages from earth language
 * purpose: translate earth text messages into alien languages and sent them to alien cellphones
 */
public class UniversalTranslator implements EarthCellPhone
{
   private AlienCellPhone alien;
   
   public UniversalTranslator() {}
   
   public UniversalTranslator(AlienCellPhone m)
   {
       alien = m;
   }
   
   public void sendMessage(String languageType, String fileName) throws InvalidLanguageException //sends message 
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
   
   public void readMessage(String fileName) //reads message received on phone
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
