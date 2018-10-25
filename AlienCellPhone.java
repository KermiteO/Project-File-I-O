

/**
 *
 * @author Omar and Luke
 *output: messages translated into alien languages from earth language
 *purpose: translate earth text messages into alien languages and sent them to alien cellphones
 */
public interface AlienCellPhone {
   public void alienSendText(String fileName);
   public void alienReadText(String fileName);
   //translateText returns the name of the output file
   //that has the translated message
   public String translateText(String fileName);
}
