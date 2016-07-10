
package net.kikuchy.anmitsu.internal

import android.content.Intent
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class IntentFloat<T>(val defaultValue: Float ,val getter: () -> Intent, val name: String? = null) : ReadWriteProperty<T, Float> {
    override fun getValue(thisRef: T, property: KProperty<*>): Float {
        return getter().getFloatExtra(name ?: property.name, defaultValue)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: Float) {
        getter().putExtra(name ?: property.name, value)
    }
}
