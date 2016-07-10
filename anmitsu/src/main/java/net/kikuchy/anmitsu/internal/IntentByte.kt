
package net.kikuchy.anmitsu.internal

import android.content.Intent
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class IntentByte<T>(val defaultValue: Byte ,val getter: () -> Intent, val name: String? = null) : ReadWriteProperty<T, Byte> {
    override fun getValue(thisRef: T, property: KProperty<*>): Byte {
        return getter().getByteExtra(name ?: property.name, defaultValue)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: Byte) {
        getter().putExtra(name ?: property.name, value)
    }
}
