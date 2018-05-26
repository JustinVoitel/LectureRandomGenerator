import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
/**
 * Write a description of class RandomGenerator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class RandomGenerator
{
    private ArrayList<Responses> responses;
    public RandomGenerator(){
        responses = new ArrayList<>();
        add("Sehr gute Zahl");
        add("Schlechte Zahl");
        add("Naja");
        add("geht so");
    }
    
    public int generateNumber(){
        int randomNum = ThreadLocalRandom.current().nextInt(1,6);
        return randomNum;
    }
    
    public void generateResponse(){
        int randomResNum = ThreadLocalRandom.current().nextInt(0,responses.size());
        String randomRes = responses.get(randomResNum).getResponse();
        int randomNum = generateNumber();
        
        System.out.println("Number: "+randomNum+", Response: "+ randomRes);
  
    }
    
    public void add(String Response){
        Responses response = new Responses(Response);
        responses.add(response);
    }
}
