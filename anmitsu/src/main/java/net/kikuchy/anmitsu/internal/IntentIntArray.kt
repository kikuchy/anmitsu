
package net.kikuchy.anmitsu.internal

import android.content.Intent
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class IntentIntArray<T>(val getter: () -> Intent, val name: String? = null) : ReadWriteProperty<T, IntArray?> {
    override fun getValue(thisRef: T, property: KProperty<*>): IntArray? {
        return getter().getIntArrayExtra(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: IntArray?) {
        getter().putExtra(name ?: property.name, value)
    }
}
