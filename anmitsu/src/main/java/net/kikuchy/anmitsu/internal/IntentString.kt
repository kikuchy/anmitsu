
package net.kikuchy.anmitsu.internal

import android.content.Intent
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class IntentString<T>(val getter: () -> Intent, val name: String? = null) : ReadWriteProperty<T, String?> {
    override fun getValue(thisRef: T, property: KProperty<*>): String? {
        return getter().getStringExtra(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: String?) {
        getter().putExtra(name ?: property.name, value)
    }
}
