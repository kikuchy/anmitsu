package net.kikuchy.anmitsu

import android.app.Fragment
import android.os.Bundle
import android.os.Parcelable
import android.util.SparseArray
import net.kikuchy.anmitsu.internal.*
import java.io.Serializable
import java.util.*
import kotlin.properties.ReadWriteProperty
import android.support.v4.app.Fragment as SupportFragment

fun <T> T.bundleBooleanArray(bundle: Bundle, name: String? = null): ReadWriteProperty<T, BooleanArray?>
        = BundleBooleanArray({ bundle }, name)

fun Fragment.argBooleanArray(name: String? = null): ReadWriteProperty<Fragment, BooleanArray?> {
    return BundleBooleanArray({ arguments }, name)
}

fun SupportFragment.argBooleanArray(name: String? = null): ReadWriteProperty<SupportFragment, BooleanArray?> {
    return BundleBooleanArray({ arguments }, name)
}

fun <T> T.bundleBoolean(bundle: Bundle, defaultValue: Boolean, name: String? = null): ReadWriteProperty<T, Boolean>
        = BundleBoolean(defaultValue, { bundle }, name)

fun Fragment.argBoolean(defaultValue: Boolean, name: String? = null): ReadWriteProperty<Fragment, Boolean> {
    return BundleBoolean(defaultValue, { arguments }, name)
}

fun SupportFragment.argBoolean(defaultValue: Boolean, name: String? = null): ReadWriteProperty<SupportFragment, Boolean> {
    return BundleBoolean(defaultValue, { arguments }, name)
}

fun <T> T.bundleBundle(bundle: Bundle, name: String? = null): ReadWriteProperty<T, Bundle?>
        = BundleBundle({ bundle }, name)

fun Fragment.argBundle(name: String? = null): ReadWriteProperty<Fragment, Bundle?> {
    return BundleBundle({ arguments }, name)
}

fun SupportFragment.argBundle(name: String? = null): ReadWriteProperty<SupportFragment, Bundle?> {
    return BundleBundle({ arguments }, name)
}

fun <T> T.bundleByteArray(bundle: Bundle, name: String? = null): ReadWriteProperty<T, ByteArray?>
        = BundleByteArray({ bundle }, name)

fun Fragment.argByteArray(name: String? = null): ReadWriteProperty<Fragment, ByteArray?> {
    return BundleByteArray({ arguments }, name)
}

fun SupportFragment.argByteArray(name: String? = null): ReadWriteProperty<SupportFragment, ByteArray?> {
    return BundleByteArray({ arguments }, name)
}

fun <T> T.bundleByte(bundle: Bundle, defaultValue: Byte, name: String? = null): ReadWriteProperty<T, Byte>
        = BundleByte(defaultValue, { bundle }, name)

fun Fragment.argByte(defaultValue: Byte, name: String? = null): ReadWriteProperty<Fragment, Byte> {
    return BundleByte(defaultValue, { arguments }, name)
}

fun SupportFragment.argByte(defaultValue: Byte, name: String? = null): ReadWriteProperty<SupportFragment, Byte> {
    return BundleByte(defaultValue, { arguments }, name)
}

fun <T> T.bundleCharArray(bundle: Bundle, name: String? = null): ReadWriteProperty<T, CharArray?>
        = BundleCharArray({ bundle }, name)

fun Fragment.argCharArray(name: String? = null): ReadWriteProperty<Fragment, CharArray?> {
    return BundleCharArray({ arguments }, name)
}

fun SupportFragment.argCharArray(name: String? = null): ReadWriteProperty<SupportFragment, CharArray?> {
    return BundleCharArray({ arguments }, name)
}

fun <T> T.bundleChar(bundle: Bundle, defaultValue: Char, name: String? = null): ReadWriteProperty<T, Char>
        = BundleChar(defaultValue, { bundle }, name)

fun Fragment.argChar(defaultValue: Char, name: String? = null): ReadWriteProperty<Fragment, Char> {
    return BundleChar(defaultValue, { arguments }, name)
}

fun SupportFragment.argChar(defaultValue: Char, name: String? = null): ReadWriteProperty<SupportFragment, Char> {
    return BundleChar(defaultValue, { arguments }, name)
}

fun <T> T.bundleCharSequenceArray(bundle: Bundle, name: String? = null): ReadWriteProperty<T, Array<CharSequence>?>
        = BundleCharSequenceArray({ bundle }, name)

fun Fragment.argCharSequenceArray(name: String? = null): ReadWriteProperty<Fragment, Array<CharSequence>?> {
    return BundleCharSequenceArray({ arguments }, name)
}

fun SupportFragment.argCharSequenceArray(name: String? = null): ReadWriteProperty<SupportFragment, Array<CharSequence>?> {
    return BundleCharSequenceArray({ arguments }, name)
}

fun <T> T.bundleCharSequenceArrayList(bundle: Bundle, name: String? = null): ReadWriteProperty<T, ArrayList<CharSequence>?>
        = BundleCharSequenceArrayList({ bundle }, name)

fun Fragment.argCharSequenceArrayList(name: String? = null): ReadWriteProperty<Fragment, ArrayList<CharSequence>?> {
    return BundleCharSequenceArrayList({ arguments }, name)
}

fun SupportFragment.argCharSequenceArrayList(name: String? = null): ReadWriteProperty<SupportFragment, ArrayList<CharSequence>?> {
    return BundleCharSequenceArrayList({ arguments }, name)
}

fun <T> T.bundleCharSequence(bundle: Bundle, name: String? = null): ReadWriteProperty<T, CharSequence?>
        = BundleCharSequence({ bundle }, name)

fun Fragment.argCharSequence(name: String? = null): ReadWriteProperty<Fragment, CharSequence?> {
    return BundleCharSequence({ arguments }, name)
}

fun SupportFragment.argCharSequence(name: String? = null): ReadWriteProperty<SupportFragment, CharSequence?> {
    return BundleCharSequence({ arguments }, name)
}

fun <T> T.bundleDoubleArray(bundle: Bundle, name: String? = null): ReadWriteProperty<T, DoubleArray?>
        = BundleDoubleArray({ bundle }, name)

fun Fragment.argDoubleArray(name: String? = null): ReadWriteProperty<Fragment, DoubleArray?> {
    return BundleDoubleArray({ arguments }, name)
}

fun SupportFragment.argDoubleArray(name: String? = null): ReadWriteProperty<SupportFragment, DoubleArray?> {
    return BundleDoubleArray({ arguments }, name)
}

fun <T> T.bundleDouble(bundle: Bundle, defaultValue: Double, name: String? = null): ReadWriteProperty<T, Double>
        = BundleDouble(defaultValue, { bundle }, name)

fun Fragment.argDouble(defaultValue: Double, name: String? = null): ReadWriteProperty<Fragment, Double> {
    return BundleDouble(defaultValue, { arguments }, name)
}

fun SupportFragment.argDouble(defaultValue: Double, name: String? = null): ReadWriteProperty<SupportFragment, Double> {
    return BundleDouble(defaultValue, { arguments }, name)
}

fun <T> T.bundleFloatArray(bundle: Bundle, name: String? = null): ReadWriteProperty<T, FloatArray?>
        = BundleFloatArray({ bundle }, name)

fun Fragment.argFloatArray(name: String? = null): ReadWriteProperty<Fragment, FloatArray?> {
    return BundleFloatArray({ arguments }, name)
}

fun SupportFragment.argFloatArray(name: String? = null): ReadWriteProperty<SupportFragment, FloatArray?> {
    return BundleFloatArray({ arguments }, name)
}

fun <T> T.bundleFloat(bundle: Bundle, defaultValue: Float, name: String? = null): ReadWriteProperty<T, Float>
        = BundleFloat(defaultValue, { bundle }, name)

fun Fragment.argFloat(defaultValue: Float, name: String? = null): ReadWriteProperty<Fragment, Float> {
    return BundleFloat(defaultValue, { arguments }, name)
}

fun SupportFragment.argFloat(defaultValue: Float, name: String? = null): ReadWriteProperty<SupportFragment, Float> {
    return BundleFloat(defaultValue, { arguments }, name)
}

fun <T> T.bundleIntArray(bundle: Bundle, name: String? = null): ReadWriteProperty<T, IntArray?>
        = BundleIntArray({ bundle }, name)

fun Fragment.argIntArray(name: String? = null): ReadWriteProperty<Fragment, IntArray?> {
    return BundleIntArray({ arguments }, name)
}

fun SupportFragment.argIntArray(name: String? = null): ReadWriteProperty<SupportFragment, IntArray?> {
    return BundleIntArray({ arguments }, name)
}

fun <T> T.bundleInt(bundle: Bundle, defaultValue: Int, name: String? = null): ReadWriteProperty<T, Int>
        = BundleInt(defaultValue, { bundle }, name)

fun Fragment.argInt(defaultValue: Int, name: String? = null): ReadWriteProperty<Fragment, Int> {
    return BundleInt(defaultValue, { arguments }, name)
}

fun SupportFragment.argInt(defaultValue: Int, name: String? = null): ReadWriteProperty<SupportFragment, Int> {
    return BundleInt(defaultValue, { arguments }, name)
}

fun <T> T.bundleIntArrayList(bundle: Bundle, name: String? = null): ReadWriteProperty<T, ArrayList<Int>?>
        = BundleIntArrayList({ bundle }, name)

fun Fragment.argIntArrayList(name: String? = null): ReadWriteProperty<Fragment, ArrayList<Int>?> {
    return BundleIntArrayList({ arguments }, name)
}

fun SupportFragment.argIntArrayList(name: String? = null): ReadWriteProperty<SupportFragment, ArrayList<Int>?> {
    return BundleIntArrayList({ arguments }, name)
}

fun <T> T.bundleLongArray(bundle: Bundle, name: String? = null): ReadWriteProperty<T, LongArray?>
        = BundleLongArray({ bundle }, name)

fun Fragment.argLongArray(name: String? = null): ReadWriteProperty<Fragment, LongArray?> {
    return BundleLongArray({ arguments }, name)
}

fun SupportFragment.argLongArray(name: String? = null): ReadWriteProperty<SupportFragment, LongArray?> {
    return BundleLongArray({ arguments }, name)
}

fun <T> T.bundleLong(bundle: Bundle, defaultValue: Long, name: String? = null): ReadWriteProperty<T, Long>
        = BundleLong(defaultValue, { bundle }, name)

fun Fragment.argLong(defaultValue: Long, name: String? = null): ReadWriteProperty<Fragment, Long> {
    return BundleLong(defaultValue, { arguments }, name)
}

fun SupportFragment.argLong(defaultValue: Long, name: String? = null): ReadWriteProperty<SupportFragment, Long> {
    return BundleLong(defaultValue, { arguments }, name)
}

fun <T> T.bundleSparseParcelableArray(bundle: Bundle, name: String? = null): ReadWriteProperty<T, SparseArray<Parcelable>?>
        = BundleSparseParcelableArray({ bundle }, name)

fun Fragment.argSparseParcelableArray(name: String? = null): ReadWriteProperty<Fragment, SparseArray<Parcelable>?> {
    return BundleSparseParcelableArray({ arguments }, name)
}

fun SupportFragment.argSparseParcelableArray(name: String? = null): ReadWriteProperty<SupportFragment, SparseArray<Parcelable>?> {
    return BundleSparseParcelableArray({ arguments }, name)
}

fun <T> T.bundleParcelableArray(bundle: Bundle, name: String? = null): ReadWriteProperty<T, Array<Parcelable>?>
        = BundleParcelableArray({ bundle }, name)

fun Fragment.argParcelableArray(name: String? = null): ReadWriteProperty<Fragment, Array<Parcelable>?> {
    return BundleParcelableArray({ arguments }, name)
}

fun SupportFragment.argParcelableArray(name: String? = null): ReadWriteProperty<SupportFragment, Array<Parcelable>?> {
    return BundleParcelableArray({ arguments }, name)
}

fun <T> T.bundleParcelableArrayList(bundle: Bundle, name: String? = null): ReadWriteProperty<T, ArrayList<Parcelable>?>
        = BundleParcelableArrayList({ bundle }, name)

fun Fragment.argParcelableArrayList(name: String? = null): ReadWriteProperty<Fragment, ArrayList<Parcelable>?> {
    return BundleParcelableArrayList({ arguments }, name)
}

fun SupportFragment.argParcelableArrayList(name: String? = null): ReadWriteProperty<SupportFragment, ArrayList<Parcelable>?> {
    return BundleParcelableArrayList({ arguments }, name)
}

fun <T> T.bundleParcelable(bundle: Bundle, name: String? = null): ReadWriteProperty<T, Parcelable?>
        = BundleParcelable({ bundle }, name)

fun Fragment.argParcelable(name: String? = null): ReadWriteProperty<Fragment, Parcelable?> {
    return BundleParcelable({ arguments }, name)
}

fun SupportFragment.argParcelable(name: String? = null): ReadWriteProperty<SupportFragment, Parcelable?> {
    return BundleParcelable({ arguments }, name)
}

fun <T> T.bundleSerializable(bundle: Bundle, name: String? = null): ReadWriteProperty<T, Serializable?>
        = BundleSerializable({ bundle }, name)

fun Fragment.argSerializable(name: String? = null): ReadWriteProperty<Fragment, Serializable?> {
    return BundleSerializable({ arguments }, name)
}

fun SupportFragment.argSerializable(name: String? = null): ReadWriteProperty<SupportFragment, Serializable?> {
    return BundleSerializable({ arguments }, name)
}

fun <T> T.bundleShortArray(bundle: Bundle, name: String? = null): ReadWriteProperty<T, ShortArray?>
        = BundleShortArray({ bundle }, name)

fun Fragment.argShortArray(name: String? = null): ReadWriteProperty<Fragment, ShortArray?> {
    return BundleShortArray({ arguments }, name)
}

fun SupportFragment.argShortArray(name: String? = null): ReadWriteProperty<SupportFragment, ShortArray?> {
    return BundleShortArray({ arguments }, name)
}

fun <T> T.bundleShort(bundle: Bundle, defaultValue: Short, name: String? = null): ReadWriteProperty<T, Short>
        = BundleShort(defaultValue, { bundle }, name)

fun Fragment.argShort(defaultValue: Short, name: String? = null): ReadWriteProperty<Fragment, Short> {
    return BundleShort(defaultValue, { arguments }, name)
}

fun SupportFragment.argShort(defaultValue: Short, name: String? = null): ReadWriteProperty<SupportFragment, Short> {
    return BundleShort(defaultValue, { arguments }, name)
}

fun <T> T.bundleStringArray(bundle: Bundle, name: String? = null): ReadWriteProperty<T, Array<String>?>
        = BundleStringArray({ bundle }, name)

fun Fragment.argStringArray(name: String? = null): ReadWriteProperty<Fragment, Array<String>?> {
    return BundleStringArray({ arguments }, name)
}

fun SupportFragment.argStringArray(name: String? = null): ReadWriteProperty<SupportFragment, Array<String>?> {
    return BundleStringArray({ arguments }, name)
}

fun <T> T.bundleStringArrayList(bundle: Bundle, name: String? = null): ReadWriteProperty<T, ArrayList<String>?>
        = BundleStringArrayList({ bundle }, name)

fun Fragment.argStringArrayList(name: String? = null): ReadWriteProperty<Fragment, ArrayList<String>?> {
    return BundleStringArrayList({ arguments }, name)
}

fun SupportFragment.argStringArrayList(name: String? = null): ReadWriteProperty<SupportFragment, ArrayList<String>?> {
    return BundleStringArrayList({ arguments }, name)
}

fun <T> T.bundleString(bundle: Bundle, name: String? = null): ReadWriteProperty<T, String?>
        = BundleString({ bundle }, name)

fun Fragment.argString(name: String? = null): ReadWriteProperty<Fragment, String?> {
    return BundleString({ arguments }, name)
}

fun SupportFragment.argString(name: String? = null): ReadWriteProperty<SupportFragment, String?> {
    return BundleString({ arguments }, name)
}
