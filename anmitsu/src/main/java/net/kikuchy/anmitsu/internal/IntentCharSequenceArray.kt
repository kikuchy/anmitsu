
package net.kikuchy.anmitsu.internal

import android.content.Intent
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class IntentCharSequenceArray<T>(val getter: () -> Intent, val name: String? = null) : ReadWriteProperty<T, Array<CharSequence>?> {
    override fun getValue(thisRef: T, property: KProperty<*>): Array<CharSequence>? {
        return getter().getCharSequenceArrayExtra(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: Array<CharSequence>?) {
        getter().putExtra(name ?: property.name, value)
    }
}
