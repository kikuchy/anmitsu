
package net.kikuchy.anmitsu.internal

import android.content.Intent
import java.util.*
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class IntentStringArrayList<T>(val getter: () -> Intent, val name: String? = null) : ReadWriteProperty<T, ArrayList<String>?> {
    override fun getValue(thisRef: T, property: KProperty<*>): ArrayList<String>? {
        return getter().getStringArrayListExtra(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: ArrayList<String>?) {
        getter().putStringArrayListExtra(name ?: property.name, value)
    }
}
