
package net.kikuchy.anmitsu.internal

import android.content.Intent
import java.util.*
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class IntentIntArrayList<T>(val getter: () -> Intent, val name: String? = null) : ReadWriteProperty<T, ArrayList<Int>?> {
    override fun getValue(thisRef: T, property: KProperty<*>): ArrayList<Int>? {
        return getter().getIntegerArrayListExtra(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: ArrayList<Int>?) {
        getter().putIntegerArrayListExtra(name ?: property.name, value)
    }
}
