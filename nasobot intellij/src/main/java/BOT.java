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
        String content = message.getContentRaw();
        MessageChannel channel = event.getChannel();

        if (content.equals("who is joe")) {
            channel.sendMessage("Joe Mama").queue();
        }
        if (content.equals("what is joe")) {
            channel.sendMessage("Joe Biden").queue();
        }
        if (content.equals("squeeze")) {
            channel.sendMessage("Ian-Kun").queue();
        }
        if (content.indexOf(0).equals("n* ttt") && content.length() > 7) {
            String stuff = content.substring(8);
            TicTacToe(stuff);
        }
    }

    public void TicTacToe(MessageReceivedEvent event) {
        Message message = event.getMessage();
        String content = message.getContentRaw();
        MessageChannel channel = event.getChannel();

        if (content.equals("")) {
            channel.sendMessage("Who are you trying to challenge?");
        }


    }


}

