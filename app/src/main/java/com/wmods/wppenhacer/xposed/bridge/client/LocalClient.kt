package com.wmods.wppenhacer.xposed.bridge.client

import com.wmods.wppenhacer.xposed.bridge.WaeIIFace
import com.wmods.wppenhacer.xposed.bridge.service.HookBinder

/** In-process filesystem bridge for legacy Xposed/EdXposed. */
class LocalClient : BaseClient() {
    override val service: WaeIIFace = HookBinder

    override suspend fun connect(): Boolean = true

    override fun tryReconnect() = Unit
}
