/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author kermi
 */
public class VulcanText implements AlienCellPhone
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
            
            System.out.print("Vulcan ");
            
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
            
            String[] splited = stringBuffer.split(" ");
            
            for(int i = 0; i < splited.length; i++)
            {
                if(splited[i].equals("This"))
                    text += "iVu ";
                else if(splited[i].equals("is"))
                    text += "nr ";
                else if(splited[i].equals("earth"))
                    text += "tslexshTat. ";
                else if(splited[i].equals("to"))
                    text += "coit ";
                else if(splited[i].equals("Vulcan"))
                    text += "th ";
                else if(splited[i].equals("text."))
                    text += "ae";            
            }
            
            PrintWriter writer = new PrintWriter(fileName);
            writer.print("");
            writer.print(text);
            writer.close();
            
        }catch(IOException e)
        {
            System.out.println("File: " + fileName + " does not exist");
        }
        
        
        return text;
    }
}
