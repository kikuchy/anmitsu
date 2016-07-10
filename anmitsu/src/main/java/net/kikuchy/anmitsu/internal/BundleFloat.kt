
package net.kikuchy.anmitsu.internal

import android.os.Bundle
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BundleFloat<T>(val defaultValue: Float ,val getter: () -> Bundle, val name: String? = null): ReadWriteProperty<T, Float> {
    override fun getValue(thisRef: T, property: KProperty<*>): Float {
        return getter().getFloat(name ?: property.name, defaultValue)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: Float) {
        getter().putFloat(name ?: property.name, value)
    }
}
