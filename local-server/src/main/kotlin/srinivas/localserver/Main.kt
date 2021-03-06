package srinivas.localserver

import com.beust.jcommander.JCommander
import ws.osiris.localserver.ServerArgs
import ws.osiris.localserver.runLocalServer

import srinivas.core.api
import srinivas.core.config
import srinivas.core.createComponents

fun main(args: Array<String>) {
    val serverArgs = ServerArgs()
    JCommander.newBuilder().addObject(serverArgs).build().parse(*args)
    val components = createComponents()
    runLocalServer(api, components, config, serverArgs.port, serverArgs.root, "core/src/main/static")
}
