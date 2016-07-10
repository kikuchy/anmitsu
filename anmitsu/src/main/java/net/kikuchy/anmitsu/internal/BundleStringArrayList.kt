
package net.kikuchy.anmitsu.internal

import android.os.Bundle
import java.util.*
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BundleStringArrayList<T>(val getter: () -> Bundle, val name: String? = null): ReadWriteProperty<T, ArrayList<String>?> {
    override fun getValue(thisRef: T, property: KProperty<*>): ArrayList<String>? {
        return getter().getStringArrayList(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: ArrayList<String>?) {
        getter().putStringArrayList(name ?: property.name, value)
    }
}
