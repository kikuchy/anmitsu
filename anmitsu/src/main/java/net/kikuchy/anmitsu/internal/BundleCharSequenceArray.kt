
package net.kikuchy.anmitsu.internal

import android.os.Bundle
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BundleCharSequenceArray<T>(val getter: () -> Bundle, val name: String? = null): ReadWriteProperty<T, Array<CharSequence>?> {
    override fun getValue(thisRef: T, property: KProperty<*>): Array<CharSequence>? {
        return getter().getCharSequenceArray(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: Array<CharSequence>?) {
        getter().putCharSequenceArray(name ?: property.name, value)
    }
}
