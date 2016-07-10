
package net.kikuchy.anmitsu.internal

import android.os.Bundle
import java.util.*
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BundleIntArrayList<T>(val getter: () -> Bundle, val name: String? = null): ReadWriteProperty<T, ArrayList<Int>?> {
    override fun getValue(thisRef: T, property: KProperty<*>): ArrayList<Int>? {
        return getter().getIntegerArrayList(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: ArrayList<Int>?) {
        getter().putIntegerArrayList(name ?: property.name, value)
    }
}
