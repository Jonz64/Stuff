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

        if (content.indexOf(0).equals("n* ttt ") && content.length() > 6) {
            String stuff = content.substring(7).trim();
            TicTacToe(stuff, user);
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
    public void TicTacToe(String other, String me) {
        if (other.equals("")) {
            channel.sendMessage("Who are you trying to challenge?");
        }

        else
            {
                //String otherName = checkGuild(other);
            String otherName = "Person";
            }

        if(otherName.equals("No")){
            channel.sendMessage("Who the frick is that, dumas?");
        }

        else
        {
            int [][] board = new int[3][3]();
            channel.sendMessage(me + "(X)'s Turn");

        }





    }


}

