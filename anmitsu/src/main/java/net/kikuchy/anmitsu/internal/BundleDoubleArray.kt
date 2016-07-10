
package net.kikuchy.anmitsu.internal

import android.os.Bundle
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BundleDoubleArray<T>(val getter: () -> Bundle, val name: String? = null): ReadWriteProperty<T, DoubleArray?> {
    override fun getValue(thisRef: T, property: KProperty<*>): DoubleArray? {
        return getter().getDoubleArray(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: DoubleArray?) {
        getter().putDoubleArray(name ?: property.name, value)
    }
}
