
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.EmbedBuilder

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
        
        EmbedBuilder emb = new EmbedBuilder();
        
        


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
    
    public void printImageOnChannel(MessageReceivedEvent event, EmbedBuilder emb)
    {
        event.getChannel().sendMessage(emb.build()).queue();
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
        EmbedBuilder emb = new EmbedBuilder();

                if (theSpell.equals("oomph")) {
                    emb.setImage("https://pm1.narvii.com/7283/ccd864dceaac89597067f884b21d53e0d7dc23a2r1-1280-720v2_hq.jpg");
                    printImageOnChannel(event, emb);
                    printOnChannel(event, "I are Stronger");

                } 
                else if (theSpell.equals("psyche up")) {
                    emb.setImage("https://pm1.narvii.com/7283/2aa38bbc05a5c4112dd85317c4c9a9195c449c9ar1-1280-720v2_hq.jpg");
                    printImageOnChannel(event, emb);
                    printOnChannel(event, "HAAAAAAAAAAAAAAAAAAA!!!!!!!!!!!!");

                } 
                else if (theSpell.equals("bounce")) {
                    emb.setImage("https://pm1.narvii.com/7283/17ee95cba6b7dae680829f3b36cf95327db49b61r1-1280-720v2_hq.jpg");
                    printImageOnChannel(event, emb);
                    printOnChannel(event, "Screw Projectiles");

                } 
                else if (theSpell.equals("heal")) {
                    emb.setImage("https://pm1.narvii.com/7283/52c6c977ecb0a19917705544e3f5e7b85f62cc75r1-1280-720v2_hq.jpg");
                    printImageOnChannel(event, emb);
                    printOnChannel(event, "Aaaaaaaaaaaa *nuts*");

                } 
                else if (theSpell.equals("flame slash")) {
                    emb.setImage("https://pm1.narvii.com/7283/b62ca5224345d82064a3eed11972bc244135184fr1-1280-720v2_hq.jpg");
                    printImageOnChannel(event, emb);
                    printOnChannel(event, "HOT HOT HOT!!!!!!!");

                } 
                else if (theSpell.equals("kacrackle slash")) {
                    emb.setImage("https://pm1.narvii.com/7283/3d190f573e8c657979b188910413bc749d326c6cr1-1280-720v2_hq.jpg");
                    printImageOnChannel(event, emb);
                    printOnChannel(event, ":O");

                } 
                else if (theSpell.equals("accelerate")) {
                    emb.setImage("https://pm1.narvii.com/7283/8008cfb289cae20f767da1e214d1725d0955c042r1-1280-720v2_hq.jpg");
                    printImageOnChannel(event, emb);
                    printOnChannel(event, "GOTTA GO FAAASSSSTTTT!!!!!");

                } 
                else if (theSpell.equals("sizz")) {
                    emb.setImage("https://pm1.narvii.com/7283/33842132d45768a82f55d2eb8a5177bc2f288f31r1-1280-720v2_hq.jpg");
                    printImageOnChannel(event, emb);
                    printOnChannel(event, "BOOM!");

                } 
                else if (theSpell.equals("sizzle")) {
                    emb.setImage("https://pm1.narvii.com/7283/8b772a32f9c1b4c39944fe63b32d4869abb26ba7r1-1280-720v2_hq.jpg");
                    printImageOnChannel(event, emb);
                    printOnChannel(event, "BOOOOOOOOOOOMMMMM!");

                } 
                else if (theSpell.equals("bang")) {
                    emb.setImage("https://pm1.narvii.com/7283/462b967f134e47056509913839ec8369db3fe38dr1-1280-720v2_hq.jpg");
                    printImageOnChannel(event, emb);
                    printOnChannel(event, "Boom");

                } 
                else if (theSpell.equals("kaboom")) {
                    emb.setImage("https://pm1.narvii.com/7283/0bee56a088b56fac4e6e01eaa544ba755df4eb25r1-1280-720v2_hq.jpg");
                    printImageOnChannel(event, emb);
                    printOnChannel(event, "*mushroom cloud*");

                } 
                else if (theSpell.equals("snooze")) {
                    emb.setImage("https://pm1.narvii.com/7283/57835e26d73b639d4d902d868990464354a89d42r1-1280-720v2_hq.jpg");
                    printImageOnChannel(event, emb);
                    printOnChannel(event, "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");

                } 
                else if (theSpell.equals("hatchet man")) {
                    emb.setImage("https://pm1.narvii.com/7283/cbba8fb40d393e87fe187cdcf18dace96cb9a6f5r1-1280-720v2_hq.jpg");
                    printImageOnChannel(event, emb);
                    printOnChannel(event, "Whoops your shields gone");

                } 
                else if (theSpell.equals("thwack")) {
                    emb.setImage("https://pm1.narvii.com/7283/7568ed98b49b32046c6d2505db7534d062f95b32r1-1280-720v2_hq.jpg");
                    printImageOnChannel(event, emb);
                    printOnChannel(event, "Ford Starts to Rage");

                } 
                else if (theSpell.equals("whack")) {
                    emb.setImage("https://pm1.narvii.com/7283/d31d4dd1b1323e52924a39fb944d25da9b6e47bcr1-1280-720v2_hq.jpg");
                    printImageOnChannel(event, emb);
                    printOnChannel(event, "Ford Also Starts to Rage");

                } 
                else if (theSpell.equals("zoom")) {
                    emb.setImage("https://pm1.narvii.com/7283/d3d004516b7bfe642f68968d108a90f016fca2f1r1-1280-720v2_hq.jpg");
                    printImageOnChannel(event, emb);
                    printOnChannel(event, "I can FLY!");

                } 
                else if (theSpell.equals("kaclang")) {
                    emb.setImage("https://pm1.narvii.com/7283/c70f299f1a940e613661e23c30b58a25837c2c57r1-1280-720v2_hq.jpg");
                    printImageOnChannel(event, emb);
                    printOnChannel(event, "This move sux");

                } 
                else if (theSpell.equals("metal slash")) {
                    emb.setImage("https://pm1.narvii.com/7283/180acc6e6cad8e0eaca5fb6a86d9703dd9063f14r1-1280-720v2_hq.jpg");
                    printImageOnChannel(event, emb);
                    printOnChannel(event, "This move also sux");

                } 
                else if (theSpell.equals("hocus pocus")) {
                    emb.setImage("https://pm1.narvii.com/7283/4e19613b8f17b00dad614157959bd232efc30253r1-1280-720v2_hq.jpg");
                    printImageOnChannel(event, emb);
                    printOnChannel(event, "RNG at it's finest");

                } 
                else if (theSpell.equals("magic burst")) {
                    emb.setImage("https://pm1.narvii.com/7283/db288034ca7085adec9f0d78d272a3c23b718ec9r1-1280-720v2_hq.jpg");
                    printImageOnChannel(event, emb);
                    printOnChannel(event, "HYYYYAAAAAA!!!!!!!!!!");

                } 
                else if (theSpell.equals("kamikazee")) {
                    emb.setImage("https://pm1.narvii.com/7283/200fe9a3ab4c1120935daa46e1dbc13f3fb4d369r1-1280-720v2_hq.jpg");
                    printImageOnChannel(event, emb);
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
        
        printOnChannel(event, "YOU DON'T KNOW A GOD DAMN THING IT'S FUCKING UNO! IT'S FREE!");
        
        printOnChannel(event, "I DON'T HAVE UNO!");
        
        printOnChannel(event, "IT'S FREE AND IT'S FUN!");
        
        printOnChannel(event, "Is this going on Youtube?");
        
    }



}
