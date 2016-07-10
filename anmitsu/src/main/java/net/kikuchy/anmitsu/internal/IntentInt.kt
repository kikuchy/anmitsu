
package net.kikuchy.anmitsu.internal

import android.content.Intent
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class IntentInt<T>(val defaultValue: Int ,val getter: () -> Intent, val name: String? = null) : ReadWriteProperty<T, Int> {
    override fun getValue(thisRef: T, property: KProperty<*>): Int {
        return getter().getIntExtra(name ?: property.name, defaultValue)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: Int) {
        getter().putExtra(name ?: property.name, value)
    }
}
