
package net.kikuchy.anmitsu.internal

import android.os.Bundle
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BundleDouble<T>(val defaultValue: Double ,val getter: () -> Bundle, val name: String? = null): ReadWriteProperty<T, Double> {
    override fun getValue(thisRef: T, property: KProperty<*>): Double {
        return getter().getDouble(name ?: property.name, defaultValue)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: Double) {
        getter().putDouble(name ?: property.name, value)
    }
}
