
package net.kikuchy.anmitsu.internal

import android.os.Bundle
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BundleInt<T>(val defaultValue: Int ,val getter: () -> Bundle, val name: String? = null): ReadWriteProperty<T, Int> {
    override fun getValue(thisRef: T, property: KProperty<*>): Int {
        return getter().getInt(name ?: property.name, defaultValue)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: Int) {
        getter().putInt(name ?: property.name, value)
    }
}
