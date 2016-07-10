
package net.kikuchy.anmitsu.internal

import android.os.Bundle
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BundleByteArray<T>(val getter: () -> Bundle, val name: String? = null): ReadWriteProperty<T, ByteArray?> {
    override fun getValue(thisRef: T, property: KProperty<*>): ByteArray? {
        return getter().getByteArray(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: ByteArray?) {
        getter().putByteArray(name ?: property.name, value)
    }
}
