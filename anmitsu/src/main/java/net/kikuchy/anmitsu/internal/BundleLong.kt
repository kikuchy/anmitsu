
package net.kikuchy.anmitsu.internal

import android.os.Bundle
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BundleLong<T>(val defaultValue: Long ,val getter: () -> Bundle, val name: String? = null): ReadWriteProperty<T, Long> {
    override fun getValue(thisRef: T, property: KProperty<*>): Long {
        return getter().getLong(name ?: property.name, defaultValue)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: Long) {
        getter().putLong(name ?: property.name, value)
    }
}
