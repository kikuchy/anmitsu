
package net.kikuchy.anmitsu.internal

import android.os.Bundle
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BundleLongArray<T>(val getter: () -> Bundle, val name: String? = null): ReadWriteProperty<T, LongArray?> {
    override fun getValue(thisRef: T, property: KProperty<*>): LongArray? {
        return getter().getLongArray(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: LongArray?) {
        getter().putLongArray(name ?: property.name, value)
    }
}
