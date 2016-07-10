
package net.kikuchy.anmitsu.internal

import android.os.Bundle
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BundleString<T>(val getter: () -> Bundle, val name: String? = null): ReadWriteProperty<T, String?> {
    override fun getValue(thisRef: T, property: KProperty<*>): String? {
        return getter().getString(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: String?) {
        getter().putString(name ?: property.name, value)
    }
}
