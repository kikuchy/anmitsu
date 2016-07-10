
package net.kikuchy.anmitsu.internal

import android.os.Bundle
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BundleBoolean<T>(val defaultValue: Boolean ,val getter: () -> Bundle, val name: String? = null): ReadWriteProperty<T, Boolean> {
    override fun getValue(thisRef: T, property: KProperty<*>): Boolean {
        return getter().getBoolean(name ?: property.name, defaultValue)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: Boolean) {
        getter().putBoolean(name ?: property.name, value)
    }
}
