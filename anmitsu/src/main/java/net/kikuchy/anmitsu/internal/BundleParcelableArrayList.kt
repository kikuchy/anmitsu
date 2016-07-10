
package net.kikuchy.anmitsu.internal

import android.os.Bundle
import android.os.Parcelable
import java.util.*
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BundleParcelableArrayList<T>(val getter: () -> Bundle, val name: String? = null): ReadWriteProperty<T, ArrayList<Parcelable>?> {
    override fun getValue(thisRef: T, property: KProperty<*>): ArrayList<Parcelable>? {
        return getter().getParcelableArrayList(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: ArrayList<Parcelable>?) {
        getter().putParcelableArrayList(name ?: property.name, value)
    }
}
