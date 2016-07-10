
package net.kikuchy.anmitsu.internal

import android.content.Intent
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class IntentLong<T>(val defaultValue: Long ,val getter: () -> Intent, val name: String? = null) : ReadWriteProperty<T, Long> {
    override fun getValue(thisRef: T, property: KProperty<*>): Long {
        return getter().getLongExtra(name ?: property.name, defaultValue)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: Long) {
        getter().putExtra(name ?: property.name, value)
    }
}
