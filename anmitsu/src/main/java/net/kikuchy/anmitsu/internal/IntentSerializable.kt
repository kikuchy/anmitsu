
package net.kikuchy.anmitsu.internal

import android.content.Intent
import java.io.Serializable
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class IntentSerializable<T>(val getter: () -> Intent, val name: String? = null) : ReadWriteProperty<T, Serializable?> {
    override fun getValue(thisRef: T, property: KProperty<*>): Serializable? {
        return getter().getSerializableExtra(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: Serializable?) {
        getter().putExtra(name ?: property.name, value)
    }
}
