
package net.kikuchy.anmitsu.internal

import android.content.Intent
import android.os.Parcelable
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class IntentParcelableArray<T>(val getter: () -> Intent, val name: String? = null) : ReadWriteProperty<T, Array<Parcelable>?> {
    override fun getValue(thisRef: T, property: KProperty<*>): Array<Parcelable>? {
        return getter().getParcelableArrayExtra(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: Array<Parcelable>?) {
        getter().putExtra(name ?: property.name, value)
    }
}
