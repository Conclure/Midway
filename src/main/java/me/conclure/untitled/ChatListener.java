package me.conclure.untitled;

import org.kryptonmc.krypton.api.event.Listener;
import org.kryptonmc.krypton.api.event.ListenerPriority;
import org.kryptonmc.krypton.api.event.events.play.ChatEvent;

public class ChatListener {


  @Listener(priority = ListenerPriority.LOW)
  public void onChat(ChatEvent event) {

  }

}
