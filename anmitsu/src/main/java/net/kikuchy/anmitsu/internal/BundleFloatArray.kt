
package net.kikuchy.anmitsu.internal

import android.os.Bundle
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BundleFloatArray<T>(val getter: () -> Bundle, val name: String? = null): ReadWriteProperty<T, FloatArray?> {
    override fun getValue(thisRef: T, property: KProperty<*>): FloatArray? {
        return getter().getFloatArray(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: FloatArray?) {
        getter().putFloatArray(name ?: property.name, value)
    }
}
