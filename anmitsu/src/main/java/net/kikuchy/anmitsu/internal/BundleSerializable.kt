
package net.kikuchy.anmitsu.internal

import android.os.Bundle
import java.io.Serializable
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BundleSerializable<T>(val getter: () -> Bundle, val name: String? = null): ReadWriteProperty<T, Serializable?> {
    override fun getValue(thisRef: T, property: KProperty<*>): Serializable? {
        return getter().getSerializable(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: Serializable?) {
        getter().putSerializable(name ?: property.name, value)
    }
}
