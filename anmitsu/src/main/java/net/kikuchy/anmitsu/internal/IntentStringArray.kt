
package net.kikuchy.anmitsu.internal

import android.content.Intent
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class IntentStringArray<T>(val getter: () -> Intent, val name: String? = null) : ReadWriteProperty<T, Array<String>?> {
    override fun getValue(thisRef: T, property: KProperty<*>): Array<String>? {
        return getter().getStringArrayExtra(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: Array<String>?) {
        getter().putExtra(name ?: property.name, value)
    }
}
