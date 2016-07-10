
package net.kikuchy.anmitsu.internal

import android.os.Bundle
import android.os.Parcelable
import android.util.SparseArray
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class BundleSparseParcelableArray<T>(val getter: () -> Bundle, val name: String? = null): ReadWriteProperty<T, SparseArray<Parcelable>?> {
    override fun getValue(thisRef: T, property: KProperty<*>): SparseArray<Parcelable>? {
        return getter().getSparseParcelableArray(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: SparseArray<Parcelable>?) {
        getter().putSparseParcelableArray(name ?: property.name, value)
    }
}
