package com.wmods.wppenhacer.xposed.core

import android.content.SharedPreferences

/**
 * Compatibility aliases for the legacy EdXposed WppCore source.
 * The imports were intentionally kept out of WppCore while switching the bridge.
 */
typealias R = com.wmods.wppenhacer.R
typealias BottomDialogWpp = com.wmods.wppenhacer.views.dialog.BottomDialogWpp
typealias WaeIIFace = com.wmods.wppenhacer.xposed.bridge.WaeIIFace
typealias FMessageWpp = com.wmods.wppenhacer.xposed.core.components.FMessageWpp
typealias UserJid = com.wmods.wppenhacer.xposed.core.components.FMessageWpp.UserJid
typealias ReflectionUtils = com.wmods.wppenhacer.xposed.utils.ReflectionUtils
typealias CDSharedPreferences = com.wmods.wppenhacer.xposed.utils.CDSharedPreferences
typealias XC_MethodHook = de.robv.android.xposed.XC_MethodHook
typealias XposedBridge = de.robv.android.xposed.XposedBridge
typealias XposedHelpers = de.robv.android.xposed.XposedHelpers

val Utils get() = com.wmods.wppenhacer.xposed.utils.Utils
val Unobfuscator get() = com.wmods.wppenhacer.xposed.core.devkit.Unobfuscator

/** Local replacement for androidx.core.content.edit used by the legacy WppCore source. */
inline fun SharedPreferences.edit(commit: Boolean = false, action: SharedPreferences.Editor.() -> Unit) {
    val editor = edit()
    editor.action()
    if (commit) editor.commit() else editor.apply()
}
