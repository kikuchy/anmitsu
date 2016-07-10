
package net.kikuchy.anmitsu.internal

import android.content.Intent
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class IntentBoolean<T>(val defaultValue: Boolean ,val getter: () -> Intent, val name: String? = null) : ReadWriteProperty<T, Boolean> {
    override fun getValue(thisRef: T, property: KProperty<*>): Boolean {
        return getter().getBooleanExtra(name ?: property.name, defaultValue)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: Boolean) {
        getter().putExtra(name ?: property.name, value)
    }
}
