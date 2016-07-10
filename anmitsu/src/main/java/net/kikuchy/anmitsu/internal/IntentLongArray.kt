
package net.kikuchy.anmitsu.internal

import android.content.Intent
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class IntentLongArray<T>(val getter: () -> Intent, val name: String? = null) : ReadWriteProperty<T, LongArray?> {
    override fun getValue(thisRef: T, property: KProperty<*>): LongArray? {
        return getter().getLongArrayExtra(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: LongArray?) {
        getter().putExtra(name ?: property.name, value)
    }
}
