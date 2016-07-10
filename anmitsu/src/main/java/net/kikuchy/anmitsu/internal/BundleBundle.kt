
package net.kikuchy.anmitsu.internal

import android.os.Bundle
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BundleBundle<T>(val getter: () -> Bundle, val name: String? = null): ReadWriteProperty<T, Bundle?> {
    override fun getValue(thisRef: T, property: KProperty<*>): Bundle? {
        return getter().getBundle(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: Bundle?) {
        getter().putBundle(name ?: property.name, value)
    }
}
