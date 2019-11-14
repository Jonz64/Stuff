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
        String content = message.getContentRaw().toLowerCase().;
        MessageChannel channel = event.getChannel();
        User user = event.getAuthor();
        event.

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
            channel.sendMessage("Here are some Not Useless Commands: \nttt: Tic Tac Toe \n ");
        }

        if (content.contains("n* ttt") && content.length() > 6) {
            String stuff = content.substring(7).trim();
            TicTacToe(stuff, user);
            
           
        if (content.contains("n* calc") && content.length() > 7)
            String stuff = content.substring(8).trim();
            Calculate(stuff)
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
        String otherName = ""
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
        
    public void Calculate(String equation){
        int firstNum = Character.getNumericValue(equation.charAt(0));
        int lastNum = Character.getNumericValue(equation.charAt(equation.length() - 1));
        
        for (int i = 1; i < equation.length()- 1; i++){
            if(equation.charAt(i) == '+'){
                printOnChannel(MessageReceivedEvent event, Integer.toString(firstNum + lastNum));
                break;
            }
            if(equation.charAt(i) == '-'){
                printOnChannel(MessageReceivedEvent event, Integer.toString(firstNum - lastNum)); 
                break;
            }
            if(equation.charAt(i) == '*'){
                printOnChannel(MessageReceivedEvent event, Integer.toString(firstNum * lastNum));
                break;
            }
            if(equation.charAt(i) == '/'){
                printOnChannel(MessageReceivedEvent event, Integer.toString(firstNum / lastNum));
                break;
            }
            if(equation.charAt(i) == '%'){
                printOnChannel(MessageReceivedEvent event, Integer.toString(firstNum % lastNum));
                break;
            }
            if(equation.charAt(i) == '^'){
                printOnChannel(MessageReceivedEvent event, Integer.toString(firstNum ^ lastNum));
                break;
            }
        }
        
    }





    }


}

