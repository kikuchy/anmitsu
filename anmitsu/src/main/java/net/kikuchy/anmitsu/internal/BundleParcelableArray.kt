
package net.kikuchy.anmitsu.internal

import android.os.Bundle
import android.os.Parcelable
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BundleParcelableArray<T>(val getter: () -> Bundle, val name: String? = null): ReadWriteProperty<T, Array<Parcelable>?> {
    override fun getValue(thisRef: T, property: KProperty<*>): Array<Parcelable>? {
        return getter().getParcelableArray(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: Array<Parcelable>?) {
        getter().putParcelableArray(name ?: property.name, value)
    }
}
