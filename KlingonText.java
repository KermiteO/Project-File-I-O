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
 * @author Omar and Luke
 *output: messages translated into alien languages from earth language
 *purpose: translate earth text messages into alien languages and sent them to alien cellphones
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
            
            Scanner in = new Scanner(file);
            
            System.out.print("Klingon ");
            while(in.hasNext())
            {
                String input = in.nextLine();
                System.out.println(input);
            }

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
            
            FileWriter writer = new FileWriter(fileName);
            
            writer.write(text);
            
            writer.close();
            
            
        }catch(IOException e)
        {
            System.out.println("File: " + fileName + " does not exist");
        }
        
        
        return text;
    }
    
}
