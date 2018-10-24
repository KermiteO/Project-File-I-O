/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.io.*;
import java.util.*;
/**
 *
 * @author kermi
 */
public class KlingonText implements AlienCellPhone
{
    public void alienSendText(String fileName)
    {
        try 
        {
            File file = new File("test1.txt");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("This is ");
            fileWriter.write("a test");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    
    public void alienReadText(String fileName)
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
            
            throw new IOException("File: " + fileName + " does not exist");

        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public String translateText(String fileName)
    {
        String text = "";
        try
        {
            File file = new File(fileName);
            
            Scanner sc = new Scanner(file); 
  
            String stringBuffer = "";
            
            while (sc.hasNextLine()) 
                stringBuffer += sc.nextLine();
            
            char [] charArr = new char [1024];
            
            int j = 0;
                   
            for(int i = stringBuffer.length() - 1; i >= 0 ; i--)
            {
                charArr[j] = stringBuffer.charAt(i);
                
                j++;
            }
            
            text = new String(charArr);
            
        }catch(IOException e)
        {
            System.out.println("File: " + fileName + " does not exist");
        }
        
        
        return text;
    }
    
}
