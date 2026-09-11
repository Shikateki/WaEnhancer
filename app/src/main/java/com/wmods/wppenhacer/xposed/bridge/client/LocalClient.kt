package com.wmods.wppenhacer.xposed.bridge.client

import com.wmods.wppenhacer.xposed.bridge.WaeIIFace
import com.wmods.wppenhacer.xposed.bridge.service.HookBinder

/**
 * In-process bridge for legacy Xposed/EdXposed.
 *
 * The old ProviderClientKt/BridgeClientKt implementations depended on a
 * cross-process/system-framework bridge. EdXposed does not need that bridge
 * for the filesystem operations exposed by WaeIIFace, so keep the same API
 * but use the binder implementation directly in this process.
 */
class LocalClient : BaseClient() {
    override val service: WaeIIFace = HookBinder

    override suspend fun connect(): Boolean = true

    override fun tryReconnect() = Unit
}
