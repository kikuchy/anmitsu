
package net.kikuchy.anmitsu.internal

import android.os.Bundle
import android.os.Parcelable
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BundleParcelable<T>(val getter: () -> Bundle, val name: String? = null): ReadWriteProperty<T, Parcelable?> {
    override fun getValue(thisRef: T, property: KProperty<*>): Parcelable? {
        return getter().getParcelable(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: Parcelable?) {
        getter().putParcelable(name ?: property.name, value)
    }
}
