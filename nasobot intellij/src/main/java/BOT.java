
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.print.DocFlavor;
import java.util.ArrayList;

import static java.lang.Math.random;
import static java.lang.Math.pow;


public class compsciNaso extends ListenerAdapter {
    public static void main(String[] args) throws Exception {
        JDA bot = new JDABuilder("NjM4ODMxMTkwODAzMjE4NDUy.XcSJDg.2iup0MzLC2EwRWsB9C9Ynv4mw4s").addEventListeners(new compsciNaso()).build();
    }

    ArrayList<String> herospells = new ArrayList<String>();

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        Message message = event.getMessage();
        
        String content = message.getContentRaw().toLowerCase().trim();
        
        MessageChannel channel = event.getChannel();
        
        User user = event.getAuthor();


        if (content.equals("who is joe")) {
            channel.sendMessage("Joe Mama").queue();
        }
        if (content.equals("what is joe")) {
            channel.sendMessage("Joe Biden").queue();
        }
        if (content.equals("squeeze")) {
            channel.sendMessage("Ian-Kun!!!").queue();
        }
        if (content.equals("what am i")) {
            channel.sendMessage("You are " + user.getName() + " aka Big Gey").queue();
        }

        if (content.equals("n* help")) {
            channel.sendMessage("Simple Text Commands: Who is Joe,  What is Joe, Squeeze, What Am I\nHere are some Not Useless Commands: \nttt: Tic Tac Toe (canceled)\ncalc: +, -, *, /, %, ^ with two numbers \nhero: Hero RNG Simulator\nsmashchar: A characteristic of every Smash character").queue();
        }

        if (content.contains("n* ttt") && content.length() > 6) {
            String stuff = content.substring(7).trim();
            //TicTacToe(stuff, user.getName(), event);
        }

        if (content.contains("n* calc") && content.length() > 7) {
            String stuff = content.substring(8).trim();
            Calculate(stuff, event);
        }
        if (content.contains("n* hero")) {
            herospells = Hero(event);

        }
        
        if(herospells.contains(content)) {
            HeroSpells(event, content);
            herospells.clear();

        }

        if(content.contains("n* roast")  && content.length() > 8){

            Roast(event, content);
        }
        
        if(content.contains("n* smashcharacter")){
            SmashChar(event, content);
        }
        
        if(content.contains("n* anime")){
            Anime(event, content);
        }



        

        if ((user.getName().equals("TheMasterSlayer") || user.getName().equals("Ian W.")) && Math.random() * 100 == 69)
            channel.sendMessage("Neko-Senpai: Ian... i love u\nchibi: Ian... i miss u so much... come back to me\nCherry: Ian my love...\nHatsune Miku: Ian... i want to be with u ").queue();
    }

    /*public String checkGuild(String name)
       {
           ArrayList<String> list =
           for(int i = 0; i < list.length(); i++)
               if(list.get(i).equals(name))
                   return list.get(i);
               return "No";
       }
   */
    public void printOnChannel(MessageReceivedEvent event, String stuff) {
        MessageChannel channel = event.getChannel();
        channel.sendMessage(stuff).queue();
    }

   /* public void TicTacToe(String other, String me, MessageReceivedEvent event) {
        String otherName = "";

        if (other.equals("")) {
            printOnChannel(event, "Who are you trying to challenge?");
        } else {
            //String otherName = checkGuild(other);
            otherName = "Person";
        }

        if (otherName.equals("No")) {
            printOnChannel(event, "Who the frick is that, dumas?");
        } else {
            //int[][] board = new int[3][3] ();
            printOnChannel(event, (me + "(X)'s Turn"));

        }
    }
*/
    public void Calculate(String equation, MessageReceivedEvent event) {
        if (Character.isDigit(equation.charAt(0)) && Character.isDigit(equation.charAt(equation.length() - 1))) {

            int firstNum = Character.getNumericValue(equation.charAt(0));
            int lastNum = Character.getNumericValue(equation.charAt(equation.length() - 1));

            for (int i = 1; i < equation.length() - 1; i++) {
                if (equation.charAt(i) == '+') {
                    printOnChannel(event, Integer.toString(firstNum + lastNum));
                    break;
                } 
                else if (equation.charAt(i) == '-') {
                    printOnChannel(event, Integer.toString(firstNum - lastNum));
                    break;
                } 
                else if (equation.charAt(i) == '*') {
                    printOnChannel(event, Integer.toString(firstNum * lastNum));
                    break;
                } 
                else if (equation.charAt(i) == '/') {
                    printOnChannel(event, Integer.toString(firstNum / lastNum));
                    break;
                } 
                else if (equation.charAt(i) == '%') {
                    printOnChannel(event, Integer.toString(firstNum % lastNum));
                    break;
                } 
                else if (equation.charAt(i) == '^') {
                    printOnChannel(event, Integer.toString((int) Math.pow(firstNum, lastNum)));
                    break;
                }
            }
        } 
        else
            printOnChannel(event, "Type it better, you bot!");

    }

    public ArrayList<String> Hero(MessageReceivedEvent event) {

        Message message = event.getMessage();
        String content = message.getContentRaw().toLowerCase().trim();
        ArrayList<String> spells = new ArrayList<String>();
        
        spells.add("Oomph");
        
        spells.add("Psyche Up");
        
        spells.add("Bounce");
        
        spells.add("Heal");
        
        spells.add("Flame Slash");
        
        spells.add("Kacrackle Slash");
        
        spells.add("Accelerate");
        
        spells.add("Sizz");
        
        spells.add("Sizzle");
        
        spells.add("Bang");
        
        spells.add("Kaboom");
        
        spells.add("Snooze");
        
        spells.add("Hatchet Man");
        
        spells.add("Thwack");
        
        spells.add("Whack");
        
        spells.add("Zoom");
        
        spells.add("Kaclang");
        
        spells.add("Metal Slash");
        
        spells.add("Hocus Pocus");
        
        spells.add("Magic Burst");
        
        spells.add("Kamikaze");


        int one = (int) (Math.random() * 21);
        
        int two = (int) (Math.random() * 21);
        
        int three = (int) (Math.random() * 21);
        
        int four = (int) (Math.random() * 21);

        while (one == two || two == three || three == four || four == one || one == three || two == four) {
            one = (int) (Math.random() * 21);
            
            two = (int) (Math.random() * 21);
            
            three = (int) (Math.random() * 21);
            
            four = (int) (Math.random() * 21);
        }

        int crit = (int) (Math.random() * 10);

        if (crit == 9)
            printOnChannel(event, "KKKKRRRRRRAAAAA!!!!!");

        printOnChannel(event, (spells.get(one) + "\n" + spells.get(two) + "\n" + spells.get(three) + "\n" + spells.get(four)));

        ArrayList<String> theSpells = new ArrayList<String>();
        
        theSpells.add(spells.get(one).toLowerCase());
        
        theSpells.add(spells.get(two).toLowerCase());
        
        theSpells.add(spells.get(three).toLowerCase());
        
        theSpells.add(spells.get(four).toLowerCase());

        return theSpells;
        
        }

    public void HeroSpells(MessageReceivedEvent event, String theSpell){

                if (theSpell.equals("oomph")) {
                    printOnChannel(event, "I are Stronger");

                } 
                else if (theSpell.equals("psyche up")) {
                    printOnChannel(event, "HAAAAAAAAAAAAAAAAAAA!!!!!!!!!!!!");

                } 
                else if (theSpell.equals("bounce")) {
                    printOnChannel(event, "Screw Projectiles");

                } 
                else if (theSpell.equals("heal")) {
                    printOnChannel(event, "Aaaaaaaaaaaa *nuts*");

                } 
                else if (theSpell.equals("flame slash")) {
                    printOnChannel(event, "HOT HOT HOT!!!!!!!");

                } 
                else if (theSpell.equals("kacrackle slash")) {
                    printOnChannel(event, ":O");

                } 
                else if (theSpell.equals("accelerate")) {
                    printOnChannel(event, "GOTTA GO FAAASSSSTTTT!!!!!");

                } 
                else if (theSpell.equals("sizz")) {
                    printOnChannel(event, "Boom");

                } 
                else if (theSpell.equals("sizzle")) {
                    printOnChannel(event, "BOOM!");

                } 
                else if (theSpell.equals("bang")) {
                    printOnChannel(event, "BOOOOOOOOOOOOMMMMMM!!!!!");

                } 
                else if (theSpell.equals("kaboom")) {
                    printOnChannel(event, "*mushroom cloud*");

                } 
                else if (theSpell.equals("snooze")) {
                    printOnChannel(event, "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");

                } 
                else if (theSpell.equals("hatchet man")) {
                    printOnChannel(event, "Whoops your shields gone");

                } 
                else if (theSpell.equals("thwack")) {
                    printOnChannel(event, "Ford Starts to Rage");

                } 
                else if (theSpell.equals("whack")) {
                    printOnChannel(event, "Ford Also Starts to Rage");

                } 
                else if (theSpell.equals("zoom")) {
                    printOnChannel(event, "I can FLY!");

                } 
                else if (theSpell.equals("kaclang")) {
                    printOnChannel(event, "This move sux");

                } 
                else if (theSpell.equals("metal slash")) {
                    printOnChannel(event, "This move also sux");

                } 
                else if (theSpell.equals("hocus pocus")) {
                    printOnChannel(event, "RNG at it's finest");

                } 
                else if (theSpell.equals("magic burst")) {
                    printOnChannel(event, "HYYYYAAAAAA!!!!!!!!!!");

                } 
                else if (theSpell.equals("kamikazee")) {
                    printOnChannel(event, "BYE BYE!");


            }
    }

    public void Roast(MessageReceivedEvent event, String person){
        ArrayList<String> roasts = new ArrayList<String>();

        roasts.add(" is triple gay");
        
        roasts.add(", eat shit and die");
        
        roasts.add(", your mom");
        
        roasts.add(" is a Nathan");
        
        roasts.add(", chibi loves you");
        
        /*roasts.add("");
        roasts.add("");
        roasts.add("");
        roasts.add("");
        roasts.add("");
        roasts.add("");
        roasts.add("");
        roasts.add("");
        roasts.add("");
        roasts.add("");
        roasts.add("");
        roasts.add("");
        roasts.add("");
        roasts.add("");
        roasts.add("");
        roasts.add("");
        roasts.add("");
        roasts.add("");
        roasts.add("");
        roasts.add("");
        roasts.add("");
        roasts.add("");
*/


        int number = (int)(Math.random()*roasts.size());
        
        String roast = roasts.get(number);

        String total = person + roast;

        printOnChannel(event, total);



    }
    
    public void SmashChar(MessageReceivedEvent event, String character){
        
    }
    
    public void Anime (MessageReceivedEvent event, String )



}
