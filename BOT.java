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

        if (content.equals("what is joe")) {
            channel.sendMessage("joe mama").queue();
        }

        if (content.equals("who is joe")) {
            channel.sendMessage("joe biden").queue();
        }
        if (content.equals("Squeeze")) {
            channel.sendMessage("Ian-Kun").queue();
        }
    }
}

