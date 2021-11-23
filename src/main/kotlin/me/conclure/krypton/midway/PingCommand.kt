package me.conclure.krypton.midway

import net.kyori.adventure.text.Component
import org.kryptonmc.api.command.Sender
import org.kryptonmc.api.command.SimpleCommand

class PingCommand : SimpleCommand {
    override fun execute(sender: Sender, args: Array<String>) {
        sender.sendMessage(Component.text("Pong!"))
    }
}
