
package net.kikuchy.anmitsu.internal

import android.content.Intent
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class IntentCharArray<T>(val getter: () -> Intent, val name: String? = null) : ReadWriteProperty<T, CharArray?> {
    override fun getValue(thisRef: T, property: KProperty<*>): CharArray? {
        return getter().getCharArrayExtra(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: CharArray?) {
        getter().putExtra(name ?: property.name, value)
    }
}
