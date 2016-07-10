
package net.kikuchy.anmitsu.internal

import android.content.Intent
import android.os.Parcelable
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class IntentParcelable<T>(val getter: () -> Intent, val name: String? = null) : ReadWriteProperty<T, Parcelable?> {
    override fun getValue(thisRef: T, property: KProperty<*>): Parcelable? {
        return getter().getParcelableExtra(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: Parcelable?) {
        getter().putExtra(name ?: property.name, value)
    }
}
