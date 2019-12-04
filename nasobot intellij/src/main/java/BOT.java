
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
        
        


        if (content.equals("who is joe")) 
        {
            channel.sendMessage("Joe Mama").queue();
        }
        
        if (content.equals("what is joe")) 
        {
            channel.sendMessage("Joe Biden").queue();
        }
        
        if (content.equals("squeeze")) 
        {
            channel.sendMessage("Ian-Kun!!!").queue();
        }
        
        if (content.equals("what am i")) 
        {
            channel.sendMessage("You are " + user.getName() + " aka Big Gey").queue();
        }

        if (content.equals("n* help")) 
        {
            channel.sendMessage("Here are some Not Useless Commands:\nSimple Text Commands: Who is Joe,  What is Joe, Squeeze, What Am I \ncalc: +, -, *, /, %, ^ with two numbers \nhero: Hero RNG Simulator\nsmashchar: A characteristic of every Smash character\nuno: The Uno Argument").queue();
        }

        if (content.contains("n* calc") && content.length() > 7) 
        {
            String stuff = content.substring(8).trim();
            Calculate(stuff, event);
        }
        if (content.contains("n* hero")) 
        {
            herospells = Hero(event);
        }
        
        if(herospells.contains(content)) 
        {
            HeroSpells(event, content);
            herospells.clear();
        }

        if(content.contains("n* roast")  && content.length() > 8)
        {
            Roast(event, content);
        }
        
        if(content.contains("n* smashcharacter"))
        {
            SmashChar(event, content);
        }
        
        if(content.contains("n* uno"))
        {
            Uno(event);
        }

        if ((user.getName().equals("TheMasterSlayer") || user.getName().equals("Ian W.")) && Math.random() * 100 == 69)
        {
            channel.sendMessage("Neko-Senpai: Ian... i love u\nchibi: Ian... i miss u so much... come back to me\nCherry: Ian my love...\nHatsune Miku: Ian... i want to be with u ").queue();
        }
        
    }

   
    public void printOnChannel(MessageReceivedEvent event, String stuff) {
        MessageChannel channel = event.getChannel();
        channel.sendMessage(stuff).queue();
    }

   
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
    
    public void Uno (MessageReceivedEvent event)
    {
        
        printOnChannel(event, "Do you guys want to play Uno real quick and i can record it and make that my upload tonight?");
        
        printOnChannel(event, "I don't have Uno, so go fuck off.");
        
        printOnChannel(event, "Everyone has Uno dipshit it came free with your fucking xbox!");
        
        printOnChannel(event, "I didn't get it I have oldest xbox know to man.");
        
        printOnChannel(event, "No you don't, I bought mine on day one you fucking tard!");
        
        printOnChannel(event, "Well mine didn't have i-");
        
        printOnChannel(event, "YOU HAVE UNO YOU FUCKING DICK!");
        
        printOnChannel(event, "I DON'T HAVE IT YOU FUCKI-");
        
        printOnChannel(event, "YOOOOOOOOUUUUUUUUUU HAAAAAAAAAAAAVE UNOOOOOOOOOOOOOO!!!!!!!!!!");
        
        printOnChannel(event, "I DON'T HAVE FUCKING UNO MOTHER FUCKER!");
        
        printOnChannel(event, "GO INTO THE ARCADE AND YOU'LL BE ABLE TO DOWNLOAD IT FOR FREE YOU DUMB MOTHER FUCKER! (I DON'T HAVE TWO, I DON'T HAVE THREE, I DON'T HAVE FUCKING FOUR)IT'S A FUCKING CARD GAME, THEY DON'T EVEN CHARGE PEOPLE FOR IT! (I DON'T HAVE 6, 8, 9, 10! OR 11!)");
        
        printOnChannel(event, "YOU DON'T KNOW A GOD DAMN THINGS IT'S FUCKING UNO! IT'S FREE!");
        
        printOnChannel(event, "I DON'T HAVE UNO!");
        
        printOnChannel(event, "IT'S FREE AND IT'S FUN!");
        
        printOnChannel(event, "Is this going on Youtube?");
        
    }



}
