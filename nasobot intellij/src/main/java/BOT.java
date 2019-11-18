import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class BOT extends ListenerAdapter {
    public static void main(String[] args) throws Exception {
        JDA bot = new JDABuilder("NjM4ODMxMTkwODAzMjE4NDUy.Xbib9w.jXOHZsfQgQ9PhlgU0HfleEb3PBc").addEventListeners(new BOT()).build();
    }

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
            channel.sendMessage("Here are some Not Useless Commands: \nttt: Tic Tac Toe (canceled)\ncalc: +, -, *, /, %, ^ with two numbers \nhero: Hero RNG Simulator ").queue();
        }

        if (content.contains("n* ttt") && content.length() > 6) {
            String stuff = content.substring(7).trim();
            TicTacToe(stuff, user);
            
           
        if (content.contains("n* calc") && content.length() > 7)
            String stuff = content.substring(8).trim();
            Calculate(stuff);
            
        if(content.contains("n* hero"))
            Hero(MessageReceivedEvent event);
            
        if(user.getName("Jonz64").equals() && Math.random()*100 == 69)
            channel.sendMessage("")
        }
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
    public void printOnChannel(MessageReceivedEvent event, String stuff){
        MessageChannel channel = event.getChannel();
        channel.sendMessage(stuff).queue();
    }
    
    public void TicTacToe(String other, String me) {
        String otherName = "";
        if (other.equals("")) {
            printOnChannel(MessageReceivedEvent event, "Who are you trying to challenge?");
        }

        else
            {
                //String otherName = checkGuild(other);
            otherName = "Person";
            }

        if(otherName.equals("No")){
            printOnChannel(MessageReceivedEvent event, "Who the frick is that, dumas?");
        }

        else
        {
            int [][] board = new int[3][3]();
            printOnChannel(MessageReceivedEvent event, (me + "(X)'s Turn"));

        }
    }   
    public void Calculate(String equation){
        if(Character.isDigit(equation.charAt(0)) && Character.isDigit(equation.charAt(equation.length() - 1))){
            
        int firstNum = Character.getNumericValue(equation.charAt(0));
        int lastNum = Character.getNumericValue(equation.charAt(equation.length() - 1));
        
        for (int i = 1; i < equation.length()- 1; i++){
            if(equation.charAt(i) == '+'){
                printOnChannel(MessageReceivedEvent event, Integer.toString(firstNum + lastNum));
                break;
            }
            else if(equation.charAt(i) == '-'){
                printOnChannel(MessageReceivedEvent event, Integer.toString(firstNum - lastNum)); 
                break;
            }
            else if(equation.charAt(i) == '*'){
                printOnChannel(MessageReceivedEvent event, Integer.toString(firstNum * lastNum));
                break;
            }
            else if(equation.charAt(i) == '/'){
                printOnChannel(MessageReceivedEvent event, Integer.toString(firstNum / lastNum));
                break;
            }
            else if(equation.charAt(i) == '%'){
                printOnChannel(MessageReceivedEvent event, Integer.toString(firstNum % lastNum));
                break;
            }
            else if(equation.charAt(i) == '^'){
                printOnChannel(MessageReceivedEvent event, Integer.toString(Math.pow(firstNum, lastNum)));
                break;
            }
        }
    }
        
        else
            printOnChannel(MessageReceivedEvent event, "Type it better, you bot!")
        
    }
    
    public void Hero(MessageReceivedEvent event){
        
        Message message = event.getMessage();
        String content = message.getContentRaw().toLowerCase().trim();
        
        ArrayList<String> spells = new ArrayList<String>(21);
        
        spells = ["Oomph", "Psyche Up", "Bounce", "Heal", "Flame Slash", "Kacrackle Slash", "Accelerate", "Sizz", "Sizzle", "Bang", "Kaboom", "Snooze", "Hatchet Man", "Thwack", "Whack", "Zoom", "Kaclang", "Metal Slash", "Hocus Pocus", "Magic Burst", "Kamikazee"];
        
        int one = Math.random()*21;
        int two = Math.random()*21;
        int three = Math.random()*21;
        int four = Math.random()*21;
        
        while(one == two || two == three || three == four || four == one || one == three || two == four){
            one = Math.random()*21;
            two = Math.random()*21;
            three = Math.random()*21;
            four = Math.random()*21;
        }
        
        int crit = Math.random()*10;
        
        if(crit == 9)
            printOnChannel(MessageReceivedEvent event, "KKKKRRRRRRAAAAA!!!!!");
        
        printOnChannel(MessageReceivedEvent event, spells.get(one) + "\n" + spells.get(two) + "\n" + spells.get(three) + "\n" + spells.get(four));
        
        ArrayList<String> theSpells = new ArrayList<String>(4);
        theSpells = [spells.get(one), spells.get(two), spells.get(three), spells.get(four)]
        
        String theSpell = "";
            
        for(int i = 0; i < theSpells.length(); i++)
        {
            if(content.contains(theSpells.get(i)))
                theSpell = theSpells.get(i);
        }
        
        while(True){
        if(theSpell.equals("Oomph")){
            printOnChannel(MessageReceivedEvent event, "I are Stronger");
            break;
        }
        
        else if(theSpell.equals("Psyche Up")){
            printOnChannel(MessageReceivedEvent event, "HAAAAAAAAAAAAAAAAAAA!!!!!!!!!!!!");
            break;
        }
        
        else if(theSpell.equals("Bounce")){
            printOnChannel(MessageReceivedEvent event, "Screw Projectiles");
            break;
        }
        
        else if(theSpell.equals("Heal")){
            printOnChannel(MessageReceivedEvent event, "Aaaaaaaaaaaa *nuts*");
            break;
        }
        
        else if(theSpell.equals("Flame Slash")){
            printOnChannel(MessageReceivedEvent event, "HOT HOT HOT!!!!!!!");
            break;
        }
        
        else if(theSpell.equals("Kacrackle Slash")){
            printOnChannel(MessageReceivedEvent event, ":O");
            break;
        }
        
        else if(theSpell.equals("Accelerate")){
            printOnChannel(MessageReceivedEvent event, "GOTTA GO FAAASSSSTTTT!!!!!");
            break;
        }
        
        else if(theSpell.equals("Sizz")){
            printOnChannel(MessageReceivedEvent event, "Boom");
            break;
        }
        
        else if(theSpell.equals("Sizzle")){
            printOnChannel(MessageReceivedEvent event, "BOOM!");
            break;
        }
        
        else if(theSpell.equals("Bang")){
            printOnChannel(MessageReceivedEvent event, "BOOOOOOOOOOOOMMMMMM!!!!!");
            break;
        }
        
        else if(theSpell.equals("Kaboom")){
            printOnChannel(MessageReceivedEvent event, "*mushroom cloud*");
            break;
        }
        
        else if(theSpell.equals("Snooze")){
            printOnChannel(MessageReceivedEvent event, "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
            break;
        }
        
        else if(theSpell.equals("Hatchet Man")){
            printOnChannel(MessageReceivedEvent event, "Whoops your shields gone");
            break;
        }
        
        else if(theSpell.equals("Thwack")){
            printOnChannel(MessageReceivedEvent event, "Ford Starts to Rage");
            break;
        }
        
        else if(theSpell.equals("Whack")){
            printOnChannel(MessageReceivedEvent event, "Ford Also Starts to Rage");
            break;
        }
        
        else if(theSpell.equals("Zoom")){
            printOnChannel(MessageReceivedEvent event, "I can FLY!");
            break;
        }
        
        else if(theSpell.equals("Kaclang")){
            printOnChannel(MessageReceivedEvent event, "This move sux");
            break;
        }
        
        else if(theSpell.equals("Metal Slash")){
            printOnChannel(MessageReceivedEvent event, "This move also sux");
            break;
        }
        
        else if(theSpell.equals("Hocus Pocus")){
            printOnChannel(MessageReceivedEvent event, "RNG at it's finest");
            break;
        }
        
        else if(theSpell.equals("Magic Burst")){
            printOnChannel(MessageReceivedEvent event, "HYYYYAAAAAA!!!!!!!!!!");
            break;
        }
        
        else if(theSpell.equals("Kamikazee")){
            printOnChannel(MessageReceivedEvent event, "BYE BYE!");
            break;
        }
            
        }
        
    }
    
    
    





    


}

