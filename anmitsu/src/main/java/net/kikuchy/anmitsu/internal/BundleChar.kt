
package net.kikuchy.anmitsu.internal

import android.os.Bundle
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BundleChar<T>(val defaultValue: Char ,val getter: () -> Bundle, val name: String? = null): ReadWriteProperty<T, Char> {
    override fun getValue(thisRef: T, property: KProperty<*>): Char {
        return getter().getChar(name ?: property.name, defaultValue)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: Char) {
        getter().putChar(name ?: property.name, value)
    }
}
