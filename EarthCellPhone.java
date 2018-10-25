
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
