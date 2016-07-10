
package net.kikuchy.anmitsu.internal

import android.content.Intent
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class IntentBooleanArray<T>(val getter: () -> Intent, val name: String? = null) : ReadWriteProperty<T, BooleanArray?> {
    override fun getValue(thisRef: T, property: KProperty<*>): BooleanArray? {
        return getter().getBooleanArrayExtra(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: BooleanArray?) {
        getter().putExtra(name ?: property.name, value)
    }
}
