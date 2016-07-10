
package net.kikuchy.anmitsu.internal

import android.content.Intent
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class IntentCharSequence<T>(val getter: () -> Intent, val name: String? = null) : ReadWriteProperty<T, CharSequence?> {
    override fun getValue(thisRef: T, property: KProperty<*>): CharSequence? {
        return getter().getCharSequenceExtra(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: CharSequence?) {
        getter().putExtra(name ?: property.name, value)
    }
}
