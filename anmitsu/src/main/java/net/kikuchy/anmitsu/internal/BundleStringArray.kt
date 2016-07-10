
package net.kikuchy.anmitsu.internal

import android.os.Bundle
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BundleStringArray<T>(val getter: () -> Bundle, val name: String? = null): ReadWriteProperty<T, Array<String>?> {
    override fun getValue(thisRef: T, property: KProperty<*>): Array<String>? {
        return getter().getStringArray(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: Array<String>?) {
        getter().putStringArray(name ?: property.name, value)
    }
}
