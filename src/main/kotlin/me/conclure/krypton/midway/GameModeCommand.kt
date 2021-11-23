package me.conclure.krypton.midway

import org.kryptonmc.api.command.BrigadierCommand
import org.kryptonmc.api.command.RawCommand
import org.kryptonmc.api.command.Sender
import org.kryptonmc.api.command.SimpleCommand
import org.kryptonmc.api.entity.player.Player
import org.kryptonmc.api.world.GameMode

class GameModeCommand(val gameMode: GameMode) : SimpleCommand {

    override fun execute(sender: Sender, args: Array<String>) {
        if (sender !is Player) {
            return
        }

    }
}
