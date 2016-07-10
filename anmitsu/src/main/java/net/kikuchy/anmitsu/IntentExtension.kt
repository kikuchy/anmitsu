
package net.kikuchy.anmitsu

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import net.kikuchy.anmitsu.internal.*
import java.io.Serializable
import java.util.*
import kotlin.properties.ReadWriteProperty

inline fun <reified T> Activity.intent(name: String? = null): ReadWriteProperty<Activity, T> {
    return when (T::class) {
        String::class -> intentString(name)
        else -> throw Exception("Type: ${T::class.qualifiedName} is not supported.")
    } as ReadWriteProperty<Activity, T>
}

fun <T> T.intentBooleanArray(intent: Intent, name: String? = null): ReadWriteProperty<T, BooleanArray?> {
    return IntentBooleanArray({ intent }, name)
}

fun Activity.intentBooleanArray(name: String? = null): ReadWriteProperty<Activity, BooleanArray?> {
    return IntentBooleanArray({ intent }, name)
}
    
fun <T> T.intentBoolean(intent: Intent, defaultValue: Boolean, name: String? = null): ReadWriteProperty<T, Boolean> {
    return IntentBoolean(defaultValue, { intent }, name)
}

fun Activity.intentBoolean(defaultValue: Boolean, name: String? = null): ReadWriteProperty<Activity, Boolean> {
    return IntentBoolean(defaultValue, { intent }, name)
}
    
fun <T> T.intentBundle(intent: Intent, name: String? = null): ReadWriteProperty<T, Bundle?> {
    return IntentBundle({ intent }, name)
}

fun Activity.intentBundle(name: String? = null): ReadWriteProperty<Activity, Bundle?> {
    return IntentBundle({ intent }, name)
}
    
fun <T> T.intentByteArray(intent: Intent, name: String? = null): ReadWriteProperty<T, ByteArray?> {
    return IntentByteArray({ intent }, name)
}

fun Activity.intentByteArray(name: String? = null): ReadWriteProperty<Activity, ByteArray?> {
    return IntentByteArray({ intent }, name)
}
    
fun <T> T.intentByte(intent: Intent, defaultValue: Byte, name: String? = null): ReadWriteProperty<T, Byte> {
    return IntentByte(defaultValue, { intent }, name)
}

fun Activity.intentByte(defaultValue: Byte, name: String? = null): ReadWriteProperty<Activity, Byte> {
    return IntentByte(defaultValue, { intent }, name)
}
    
fun <T> T.intentCharArray(intent: Intent, name: String? = null): ReadWriteProperty<T, CharArray?> {
    return IntentCharArray({ intent }, name)
}

fun Activity.intentCharArray(name: String? = null): ReadWriteProperty<Activity, CharArray?> {
    return IntentCharArray({ intent }, name)
}
    
fun <T> T.intentChar(intent: Intent, defaultValue: Char, name: String? = null): ReadWriteProperty<T, Char> {
    return IntentChar(defaultValue, { intent }, name)
}

fun Activity.intentChar(defaultValue: Char, name: String? = null): ReadWriteProperty<Activity, Char> {
    return IntentChar(defaultValue, { intent }, name)
}
    
fun <T> T.intentCharSequenceArray(intent: Intent, name: String? = null): ReadWriteProperty<T, Array<CharSequence>?> {
    return IntentCharSequenceArray({ intent }, name)
}

fun Activity.intentCharSequenceArray(name: String? = null): ReadWriteProperty<Activity, Array<CharSequence>?> {
    return IntentCharSequenceArray({ intent }, name)
}
    
fun <T> T.intentCharSequenceArrayList(intent: Intent, name: String? = null): ReadWriteProperty<T, ArrayList<CharSequence>?> {
    return IntentCharSequenceArrayList({ intent }, name)
}

fun Activity.intentCharSequenceArrayList(name: String? = null): ReadWriteProperty<Activity, ArrayList<CharSequence>?> {
    return IntentCharSequenceArrayList({ intent }, name)
}
    
fun <T> T.intentCharSequence(intent: Intent, name: String? = null): ReadWriteProperty<T, CharSequence?> {
    return IntentCharSequence({ intent }, name)
}

fun Activity.intentCharSequence(name: String? = null): ReadWriteProperty<Activity, CharSequence?> {
    return IntentCharSequence({ intent }, name)
}
    
fun <T> T.intentDoubleArray(intent: Intent, name: String? = null): ReadWriteProperty<T, DoubleArray?> {
    return IntentDoubleArray({ intent }, name)
}

fun Activity.intentDoubleArray(name: String? = null): ReadWriteProperty<Activity, DoubleArray?> {
    return IntentDoubleArray({ intent }, name)
}
    
fun <T> T.intentDouble(intent: Intent, defaultValue: Double, name: String? = null): ReadWriteProperty<T, Double> {
    return IntentDouble(defaultValue, { intent }, name)
}

fun Activity.intentDouble(defaultValue: Double, name: String? = null): ReadWriteProperty<Activity, Double> {
    return IntentDouble(defaultValue, { intent }, name)
}
    
fun <T> T.intentFloatArray(intent: Intent, name: String? = null): ReadWriteProperty<T, FloatArray?> {
    return IntentFloatArray({ intent }, name)
}

fun Activity.intentFloatArray(name: String? = null): ReadWriteProperty<Activity, FloatArray?> {
    return IntentFloatArray({ intent }, name)
}
    
fun <T> T.intentFloat(intent: Intent, defaultValue: Float, name: String? = null): ReadWriteProperty<T, Float> {
    return IntentFloat(defaultValue, { intent }, name)
}

fun Activity.intentFloat(defaultValue: Float, name: String? = null): ReadWriteProperty<Activity, Float> {
    return IntentFloat(defaultValue, { intent }, name)
}
    
fun <T> T.intentIntArray(intent: Intent, name: String? = null): ReadWriteProperty<T, IntArray?> {
    return IntentIntArray({ intent }, name)
}

fun Activity.intentIntArray(name: String? = null): ReadWriteProperty<Activity, IntArray?> {
    return IntentIntArray({ intent }, name)
}
    
fun <T> T.intentInt(intent: Intent, defaultValue: Int, name: String? = null): ReadWriteProperty<T, Int> {
    return IntentInt(defaultValue, { intent }, name)
}

fun Activity.intentInt(defaultValue: Int, name: String? = null): ReadWriteProperty<Activity, Int> {
    return IntentInt(defaultValue, { intent }, name)
}
    
fun <T> T.intentIntArrayList(intent: Intent, name: String? = null): ReadWriteProperty<T, ArrayList<Int>?> {
    return IntentIntArrayList({ intent }, name)
}

fun Activity.intentIntArrayList(name: String? = null): ReadWriteProperty<Activity, ArrayList<Int>?> {
    return IntentIntArrayList({ intent }, name)
}
    
fun <T> T.intentLongArray(intent: Intent, name: String? = null): ReadWriteProperty<T, LongArray?> {
    return IntentLongArray({ intent }, name)
}

fun Activity.intentLongArray(name: String? = null): ReadWriteProperty<Activity, LongArray?> {
    return IntentLongArray({ intent }, name)
}
    
fun <T> T.intentLong(intent: Intent, defaultValue: Long, name: String? = null): ReadWriteProperty<T, Long> {
    return IntentLong(defaultValue, { intent }, name)
}

fun Activity.intentLong(defaultValue: Long, name: String? = null): ReadWriteProperty<Activity, Long> {
    return IntentLong(defaultValue, { intent }, name)
}
    
fun <T> T.intentParcelableArray(intent: Intent, name: String? = null): ReadWriteProperty<T, Array<Parcelable>?> {
    return IntentParcelableArray({ intent }, name)
}

fun Activity.intentParcelableArray(name: String? = null): ReadWriteProperty<Activity, Array<Parcelable>?> {
    return IntentParcelableArray({ intent }, name)
}
    
fun <T> T.intentParcelableArrayList(intent: Intent, name: String? = null): ReadWriteProperty<T, ArrayList<Parcelable>?> {
    return IntentParcelableArrayList({ intent }, name)
}

fun Activity.intentParcelableArrayList(name: String? = null): ReadWriteProperty<Activity, ArrayList<Parcelable>?> {
    return IntentParcelableArrayList({ intent }, name)
}
    
fun <T> T.intentParcelable(intent: Intent, name: String? = null): ReadWriteProperty<T, Parcelable?> {
    return IntentParcelable({ intent }, name)
}

fun Activity.intentParcelable(name: String? = null): ReadWriteProperty<Activity, Parcelable?> {
    return IntentParcelable({ intent }, name)
}
    
fun <T> T.intentSerializable(intent: Intent, name: String? = null): ReadWriteProperty<T, Serializable?> {
    return IntentSerializable({ intent }, name)
}

fun Activity.intentSerializable(name: String? = null): ReadWriteProperty<Activity, Serializable?> {
    return IntentSerializable({ intent }, name)
}
    
fun <T> T.intentShortArray(intent: Intent, name: String? = null): ReadWriteProperty<T, ShortArray?> {
    return IntentShortArray({ intent }, name)
}

fun Activity.intentShortArray(name: String? = null): ReadWriteProperty<Activity, ShortArray?> {
    return IntentShortArray({ intent }, name)
}
    
fun <T> T.intentShort(intent: Intent, defaultValue: Short, name: String? = null): ReadWriteProperty<T, Short> {
    return IntentShort(defaultValue, { intent }, name)
}

fun Activity.intentShort(defaultValue: Short, name: String? = null): ReadWriteProperty<Activity, Short> {
    return IntentShort(defaultValue, { intent }, name)
}
    
fun <T> T.intentStringArray(intent: Intent, name: String? = null): ReadWriteProperty<T, Array<String>?> {
    return IntentStringArray({ intent }, name)
}

fun Activity.intentStringArray(name: String? = null): ReadWriteProperty<Activity, Array<String>?> {
    return IntentStringArray({ intent }, name)
}
    
fun <T> T.intentStringArrayList(intent: Intent, name: String? = null): ReadWriteProperty<T, ArrayList<String>?> {
    return IntentStringArrayList({ intent }, name)
}

fun Activity.intentStringArrayList(name: String? = null): ReadWriteProperty<Activity, ArrayList<String>?> {
    return IntentStringArrayList({ intent }, name)
}
    
fun <T> T.intentString(intent: Intent, name: String? = null): ReadWriteProperty<T, String?> {
    return IntentString({ intent }, name)
}

fun Activity.intentString(name: String? = null): ReadWriteProperty<Activity, String?> {
    return IntentString({ intent }, name)
}
    