
package net.kikuchy.anmitsu.internal

import android.os.Bundle
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BundleCharArray<T>(val getter: () -> Bundle, val name: String? = null): ReadWriteProperty<T, CharArray?> {
    override fun getValue(thisRef: T, property: KProperty<*>): CharArray? {
        return getter().getCharArray(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: CharArray?) {
        getter().putCharArray(name ?: property.name, value)
    }
}
