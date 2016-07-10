
package net.kikuchy.anmitsu.internal

import android.content.Intent
import java.util.*
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class IntentCharSequenceArrayList<T>(val getter: () -> Intent, val name: String? = null) : ReadWriteProperty<T, ArrayList<CharSequence>?> {
    override fun getValue(thisRef: T, property: KProperty<*>): ArrayList<CharSequence>? {
        return getter().getCharSequenceArrayListExtra(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: ArrayList<CharSequence>?) {
        getter().putCharSequenceArrayListExtra(name ?: property.name, value)
    }
}
