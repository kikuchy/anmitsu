package com.example

import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter

fun main(args: Array<String>) {
    val tableIntent = arrayOf(
            TypeMethodParam("BooleanArray", "BooleanArray", "getBooleanArrayExtra", "putExtra", false),
            TypeMethodParam("Boolean", "Boolean", "getBooleanExtra", "putExtra", true),
            TypeMethodParam("Bundle", "Bundle", "getBundleExtra", "putExtra", false),
            TypeMethodParam("ByteArray", "ByteArray", "getByteArrayExtra", "putExtra", false),
            TypeMethodParam("Byte", "Byte", "getByteExtra", "putExtra", true),
            TypeMethodParam("CharArray", "CharArray", "getCharArrayExtra", "putExtra", false),
            TypeMethodParam("Char", "Char", "getCharExtra", "putExtra", true),
            TypeMethodParam("CharSequenceArray", "Array<CharSequence>", "getCharSequenceArrayExtra", "putExtra", false),
            TypeMethodParam("CharSequenceArrayList", "ArrayList<CharSequence>", "getCharSequenceArrayListExtra", "putCharSequenceArrayListExtra", false),
            TypeMethodParam("CharSequence", "CharSequence", "getCharSequenceExtra", "putExtra", false),
            TypeMethodParam("DoubleArray", "DoubleArray", "getDoubleArrayExtra", "putExtra", false),
            TypeMethodParam("Double", "Double", "getDoubleExtra", "putExtra", true),
            TypeMethodParam("FloatArray", "FloatArray", "getFloatArrayExtra", "putExtra", false),
            TypeMethodParam("Float", "Float", "getFloatExtra", "putExtra", true),
            TypeMethodParam("IntArray", "IntArray", "getIntArrayExtra", "putExtra", false),
            TypeMethodParam("Int", "Int", "getIntExtra", "putExtra", true),
            TypeMethodParam("IntArrayList", "ArrayList<Int>", "getIntegerArrayListExtra", "putIntegerArrayListExtra", false),
            TypeMethodParam("LongArray", "LongArray", "getLongArrayExtra", "putExtra", false),
            TypeMethodParam("Long", "Long", "getLongExtra", "putExtra", true),
            TypeMethodParam("ParcelableArray", "Array<Parcelable>", "getParcelableArrayExtra", "putExtra", false),
            TypeMethodParam("ParcelableArrayList", "ArrayList<Parcelable>", "getParcelableArrayListExtra", "putParcelableArrayListExtra", false),
            TypeMethodParam("Parcelable", "Parcelable", "getParcelableExtra", "putExtra", false),
            TypeMethodParam("Serializable", "Serializable", "getSerializableExtra", "putExtra", false),
            TypeMethodParam("ShortArray", "ShortArray", "getShortArrayExtra", "putExtra", false),
            TypeMethodParam("Short", "Short", "getShortExtra", "putExtra", true),
            TypeMethodParam("StringArray", "Array<String>", "getStringArrayExtra", "putExtra", false),
            TypeMethodParam("StringArrayList", "ArrayList<String>", "getStringArrayListExtra", "putStringArrayListExtra", false),
            TypeMethodParam("String", "String", "getStringExtra", "putExtra", false)
    )

    saveCodesForIntent(tableIntent)

    val tableBundle = arrayOf(
            TypeMethodParam("BooleanArray", "BooleanArray", "getBooleanArray", "putBooleanArray", false),
            TypeMethodParam("Boolean", "Boolean", "getBoolean", "putBoolean", true),
            TypeMethodParam("Bundle", "Bundle", "getBundle", "putBundle", false),
            TypeMethodParam("ByteArray", "ByteArray", "getByteArray", "putByteArray", false),
            TypeMethodParam("Byte", "Byte", "getByte", "putByte", true),
            TypeMethodParam("CharArray", "CharArray", "getCharArray", "putCharArray", false),
            TypeMethodParam("Char", "Char", "getChar", "putChar", true),
            TypeMethodParam("CharSequenceArray", "Array<CharSequence>", "getCharSequenceArray", "putCharSequenceArray", false),
            TypeMethodParam("CharSequenceArrayList", "ArrayList<CharSequence>", "getCharSequenceArrayList", "putCharSequenceArrayList", false),
            TypeMethodParam("CharSequence", "CharSequence", "getCharSequence", "putCharSequence", false),
            TypeMethodParam("DoubleArray", "DoubleArray", "getDoubleArray", "putDoubleArray", false),
            TypeMethodParam("Double", "Double", "getDouble", "putDouble", true),
            TypeMethodParam("FloatArray", "FloatArray", "getFloatArray", "putFloatArray", false),
            TypeMethodParam("Float", "Float", "getFloat", "putFloat", true),
            TypeMethodParam("IntArray", "IntArray", "getIntArray", "putIntArray", false),
            TypeMethodParam("Int", "Int", "getInt", "putInt", true),
            TypeMethodParam("IntArrayList", "ArrayList<Int>", "getIntegerArrayList", "putIntegerArrayList", false),
            TypeMethodParam("LongArray", "LongArray", "getLongArray", "putLongArray", false),
            TypeMethodParam("Long", "Long", "getLong", "putLong", true),
            TypeMethodParam("SparseParcelableArray", "SparseArray<Parcelable>", "getSparseParcelableArray", "putSparseParcelableArray", false),
            TypeMethodParam("ParcelableArray", "Array<Parcelable>", "getParcelableArray", "putParcelableArray", false),
            TypeMethodParam("ParcelableArrayList", "ArrayList<Parcelable>", "getParcelableArrayList", "putParcelableArrayList", false),
            TypeMethodParam("Parcelable", "Parcelable", "getParcelable", "putParcelable", false),
            TypeMethodParam("Serializable", "Serializable", "getSerializable", "putSerializable", false),
            TypeMethodParam("ShortArray", "ShortArray", "getShortArray", "putShortArray", false),
            TypeMethodParam("Short", "Short", "getShort", "putShort", true),
            TypeMethodParam("StringArray", "Array<String>", "getStringArray", "putStringArray", false),
            TypeMethodParam("StringArrayList", "ArrayList<String>", "getStringArrayList", "putStringArrayList", false),
            TypeMethodParam("String", "String", "getString", "putString", false)
    )

    saveCodesForBundle(tableBundle)
}

private fun saveCodesForIntent(table: Array<TypeMethodParam>) {
    val extWriter = BufferedWriter(FileWriter(File("./anmitsu/src/main/java/net/kikuchy/anmitsu/IntentExtension.kt")))
    extWriter.append("""
package net.kikuchy.anmitsu

import android.app.Activity
import android.content.Intent
import kotlin.properties.ReadWriteProperty

inline fun <reified T> Activity.intent(name: String? = null): ReadWriteProperty<Activity, T> {
    return when (T::class) {
        String::class -> intentString(name)
        else -> throw Exception("Type: $\{T::class.qualifiedName} is not supported.")
    } as ReadWriteProperty<Activity, T>
}
""")
    table.map {
        val (extension, helper) = generateCodeForIntent(it)
        extWriter.append(extension)
        FileWriter(File("./anmitsu/src/main/java/net/kikuchy/anmitsu/internal/Intent${it.type}.kt")).apply {
            write(helper)
            close()
        }
    }
    extWriter.close()
}

private fun generateCodeForIntent(t: TypeMethodParam): Pair<String, String> {
    return """
fun <T> T.intent${t.type}(intent: Intent, ${if (t.needDefault) "defaultValue: ${t.signature}, " else ""}name: String? = null): ReadWriteProperty<T, ${t.signature}${if (t.needDefault) "" else "?"}> {
    return Intent${t.type}(${if (t.needDefault) "defaultValue, " else ""}{ intent }, name)
}

fun Activity.intent${t.type}(${if (t.needDefault) "defaultValue: ${t.signature}, " else ""}name: String? = null): ReadWriteProperty<Activity, ${t.signature}${if (t.needDefault) "" else "?"}> {
    return Intent${t.type}(${if (t.needDefault) "defaultValue, " else ""}{ intent }, name)
}
""" to """
package net.kikuchy.anmitsu.internal

import android.content.Intent
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class Intent${t.type}<T>(${if (t.needDefault) "val defaultValue: ${t.signature} ," else ""}val getter: () -> Intent, val name: String? = null) : ReadWriteProperty<T, ${t.signature}${if (t.needDefault) "" else "?"}> {
    override fun getValue(thisRef: T, property: KProperty<*>): ${t.signature}${if (t.needDefault) "" else "?"} {
        return getter().${t.getter}(name ?: property.name${if (t.needDefault) ", defaultValue" else ""})
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: ${t.signature}${if (t.needDefault) "" else "?"}) {
        getter().${t.setter}(name ?: property.name, value)
    }
}
"""
}

private fun saveCodesForBundle(table: Array<TypeMethodParam>) {
    val extWriter = BufferedWriter(FileWriter(File("./anmitsu/src/main/java/net/kikuchy/anmitsu/BundleExtension.kt")))
    extWriter.append("""
package net.kikuchy.anmitsu

import android.app.Fragment
import android.os.Bundle
import kotlin.properties.ReadWriteProperty
import android.support.v4.app.Fragment as SupportFragment
""")
    table.map {
        val (extension, helper) = generateCodeForBundle(it)
        extWriter.append(extension)
        FileWriter(File("./anmitsu/src/main/java/net/kikuchy/anmitsu/internal/Bundle${it.type}.kt")).apply {
            write(helper)
            close()
        }
    }
    extWriter.close()
}

private fun generateCodeForBundle(t: TypeMethodParam): Pair<String, String> {
    return """
fun <T> T.bundle${t.type}(bundle: Bundle, ${if (t.needDefault) "defaultValue: ${t.signature}, " else ""}name: String? = null): ReadWriteProperty<T, ${t.signature}${if (t.needDefault) "" else "?"}>
        = Bundle${t.type}(${if (t.needDefault) "defaultValue, " else ""}{ bundle }, name)

fun Fragment.arg${t.type}(${if (t.needDefault) "defaultValue: ${t.signature}, " else ""}name: String? = null): ReadWriteProperty<Fragment, ${t.signature}${if (t.needDefault) "" else "?"}> {
    return Bundle${t.type}(${if (t.needDefault) "defaultValue, " else ""}{ arguments }, name)
}

fun SupportFragment.arg${t.type}(${if (t.needDefault) "defaultValue: ${t.signature}, " else ""}name: String? = null): ReadWriteProperty<SupportFragment, ${t.signature}${if (t.needDefault) "" else "?"}> {
    return Bundle${t.type}(${if (t.needDefault) "defaultValue, " else ""}{ arguments }, name)
}
""" to """
package net.kikuchy.anmitsu.internal

import android.os.Bundle
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class Bundle${t.type}<T>(${if (t.needDefault) "val defaultValue: ${t.signature} ," else ""}val getter: () -> Bundle, val name: String? = null): ReadWriteProperty<T, ${t.signature}${if (t.needDefault) "" else "?"}> {
    override fun getValue(thisRef: T, property: KProperty<*>): ${t.signature}${if (t.needDefault) "" else "?"} {
        return getter().${t.getter}(name ?: property.name${if (t.needDefault) ", defaultValue" else ""})
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: ${t.signature}${if (t.needDefault) "" else "?"}) {
        getter().${t.setter}(name ?: property.name, value)
    }
}
"""
}

private data class TypeMethodParam(
        val type: String,
        val signature: String,
        val getter: String,
        val setter: String,
        val needDefault: Boolean)