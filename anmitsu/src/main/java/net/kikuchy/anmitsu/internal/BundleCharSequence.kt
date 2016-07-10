
package net.kikuchy.anmitsu.internal

import android.os.Bundle
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BundleCharSequence<T>(val getter: () -> Bundle, val name: String? = null): ReadWriteProperty<T, CharSequence?> {
    override fun getValue(thisRef: T, property: KProperty<*>): CharSequence? {
        return getter().getCharSequence(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: CharSequence?) {
        getter().putCharSequence(name ?: property.name, value)
    }
}
