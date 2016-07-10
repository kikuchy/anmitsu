
package net.kikuchy.anmitsu.internal

import android.os.Bundle
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BundleShortArray<T>(val getter: () -> Bundle, val name: String? = null): ReadWriteProperty<T, ShortArray?> {
    override fun getValue(thisRef: T, property: KProperty<*>): ShortArray? {
        return getter().getShortArray(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: ShortArray?) {
        getter().putShortArray(name ?: property.name, value)
    }
}
