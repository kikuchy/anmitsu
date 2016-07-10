
package net.kikuchy.anmitsu.internal

import android.content.Intent
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class IntentShortArray<T>(val getter: () -> Intent, val name: String? = null) : ReadWriteProperty<T, ShortArray?> {
    override fun getValue(thisRef: T, property: KProperty<*>): ShortArray? {
        return getter().getShortArrayExtra(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: ShortArray?) {
        getter().putExtra(name ?: property.name, value)
    }
}
