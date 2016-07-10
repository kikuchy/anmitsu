
package net.kikuchy.anmitsu.internal

import android.os.Bundle
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BundleIntArray<T>(val getter: () -> Bundle, val name: String? = null): ReadWriteProperty<T, IntArray?> {
    override fun getValue(thisRef: T, property: KProperty<*>): IntArray? {
        return getter().getIntArray(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: IntArray?) {
        getter().putIntArray(name ?: property.name, value)
    }
}
