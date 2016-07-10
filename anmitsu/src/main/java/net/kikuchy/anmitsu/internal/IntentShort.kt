
package net.kikuchy.anmitsu.internal

import android.content.Intent
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class IntentShort<T>(val defaultValue: Short ,val getter: () -> Intent, val name: String? = null) : ReadWriteProperty<T, Short> {
    override fun getValue(thisRef: T, property: KProperty<*>): Short {
        return getter().getShortExtra(name ?: property.name, defaultValue)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: Short) {
        getter().putExtra(name ?: property.name, value)
    }
}
