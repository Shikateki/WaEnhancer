package com.wmods.wppenhacer.xposed.core

/**
 * Compatibility aliases for the legacy EdXposed WppCore source.
 * The imports were intentionally kept out of WppCore while switching the bridge.
 */
typealias R = com.wmods.wppenhacer.R
typealias BottomDialogWpp = com.wmods.wppenhacer.views.dialog.BottomDialogWpp
typealias WaeIIFace = com.wmods.wppenhacer.xposed.bridge.WaeIIFace
typealias FMessageWpp = com.wmods.wppenhacer.xposed.core.components.FMessageWpp
typealias ReflectionUtils = com.wmods.wppenhacer.xposed.utils.ReflectionUtils
typealias CDSharedPreferences = com.wmods.wppenhacer.xposed.utils.CDSharedPreferences
typealias XC_MethodHook = de.robv.android.xposed.XC_MethodHook
typealias XposedBridge = de.robv.android.xposed.XposedBridge
typealias XposedHelpers = de.robv.android.xposed.XposedHelpers

val Utils get() = com.wmods.wppenhacer.xposed.utils.Utils
val Unobfuscator get() = com.wmods.wppenhacer.xposed.core.devkit.Unobfuscator
