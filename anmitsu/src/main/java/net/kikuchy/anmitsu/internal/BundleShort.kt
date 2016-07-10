
package net.kikuchy.anmitsu.internal

import android.os.Bundle
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BundleShort<T>(val defaultValue: Short ,val getter: () -> Bundle, val name: String? = null): ReadWriteProperty<T, Short> {
    override fun getValue(thisRef: T, property: KProperty<*>): Short {
        return getter().getShort(name ?: property.name, defaultValue)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: Short) {
        getter().putShort(name ?: property.name, value)
    }
}
