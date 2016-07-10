
package net.kikuchy.anmitsu.internal

import android.content.Intent
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class IntentDouble<T>(val defaultValue: Double ,val getter: () -> Intent, val name: String? = null) : ReadWriteProperty<T, Double> {
    override fun getValue(thisRef: T, property: KProperty<*>): Double {
        return getter().getDoubleExtra(name ?: property.name, defaultValue)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: Double) {
        getter().putExtra(name ?: property.name, value)
    }
}
