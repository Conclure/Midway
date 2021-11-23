package me.conclure.krypton.midway

import com.google.inject.Inject
import org.apache.logging.log4j.Logger
import org.kryptonmc.api.Server
import org.kryptonmc.api.command.Sender
import org.kryptonmc.api.command.meta.SimpleCommandMeta
import org.kryptonmc.api.command.meta.simpleCommandMeta
import org.kryptonmc.api.event.Listener
import org.kryptonmc.api.event.server.ServerStartEvent
import org.kryptonmc.api.plugin.annotation.Plugin

@Plugin(
    "midway",
    "Midway",
    "1.0.0",
    "Aims to enhance your server with quality of life features."
)
class KryptonMidwayPluginEntrypoint @Inject constructor(
    private val server: Server,
    private val logger: Logger
) {

    @Listener
    fun onStart(event: ServerStartEvent) {
        this.logger.info("Hello there! This is my first plugin!")
        this.server.commandManager.register(
            PingCommand(),
            SimpleCommandMeta.builder("ping")
                .build()
        )
    }
}
