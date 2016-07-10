
package net.kikuchy.anmitsu.internal

import android.content.Intent
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class IntentDoubleArray<T>(val getter: () -> Intent, val name: String? = null) : ReadWriteProperty<T, DoubleArray?> {
    override fun getValue(thisRef: T, property: KProperty<*>): DoubleArray? {
        return getter().getDoubleArrayExtra(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: DoubleArray?) {
        getter().putExtra(name ?: property.name, value)
    }
}
