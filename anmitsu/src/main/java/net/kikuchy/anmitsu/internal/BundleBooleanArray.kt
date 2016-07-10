
package net.kikuchy.anmitsu.internal

import android.os.Bundle
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BundleBooleanArray<T>(val getter: () -> Bundle, val name: String? = null): ReadWriteProperty<T, BooleanArray?> {
    override fun getValue(thisRef: T, property: KProperty<*>): BooleanArray? {
        return getter().getBooleanArray(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: BooleanArray?) {
        getter().putBooleanArray(name ?: property.name, value)
    }
}
