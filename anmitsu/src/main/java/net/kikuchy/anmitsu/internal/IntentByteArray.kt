
package net.kikuchy.anmitsu.internal

import android.content.Intent
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class IntentByteArray<T>(val getter: () -> Intent, val name: String? = null) : ReadWriteProperty<T, ByteArray?> {
    override fun getValue(thisRef: T, property: KProperty<*>): ByteArray? {
        return getter().getByteArrayExtra(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: ByteArray?) {
        getter().putExtra(name ?: property.name, value)
    }
}
