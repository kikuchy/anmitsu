
package net.kikuchy.anmitsu.internal

import android.os.Bundle
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BundleByte<T>(val defaultValue: Byte ,val getter: () -> Bundle, val name: String? = null): ReadWriteProperty<T, Byte> {
    override fun getValue(thisRef: T, property: KProperty<*>): Byte {
        return getter().getByte(name ?: property.name, defaultValue)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: Byte) {
        getter().putByte(name ?: property.name, value)
    }
}
