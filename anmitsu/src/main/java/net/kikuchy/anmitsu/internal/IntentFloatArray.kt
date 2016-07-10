
package net.kikuchy.anmitsu.internal

import android.content.Intent
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class IntentFloatArray<T>(val getter: () -> Intent, val name: String? = null) : ReadWriteProperty<T, FloatArray?> {
    override fun getValue(thisRef: T, property: KProperty<*>): FloatArray? {
        return getter().getFloatArrayExtra(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: FloatArray?) {
        getter().putExtra(name ?: property.name, value)
    }
}
