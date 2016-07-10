
package net.kikuchy.anmitsu.internal

import android.content.Intent
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class IntentChar<T>(val defaultValue: Char ,val getter: () -> Intent, val name: String? = null) : ReadWriteProperty<T, Char> {
    override fun getValue(thisRef: T, property: KProperty<*>): Char {
        return getter().getCharExtra(name ?: property.name, defaultValue)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: Char) {
        getter().putExtra(name ?: property.name, value)
    }
}
