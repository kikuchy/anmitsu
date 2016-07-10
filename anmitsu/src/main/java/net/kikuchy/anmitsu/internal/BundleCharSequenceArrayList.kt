
package net.kikuchy.anmitsu.internal

import android.os.Bundle
import java.util.*
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BundleCharSequenceArrayList<T>(val getter: () -> Bundle, val name: String? = null): ReadWriteProperty<T, ArrayList<CharSequence>?> {
    override fun getValue(thisRef: T, property: KProperty<*>): ArrayList<CharSequence>? {
        return getter().getCharSequenceArrayList(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: ArrayList<CharSequence>?) {
        getter().putCharSequenceArrayList(name ?: property.name, value)
    }
}
