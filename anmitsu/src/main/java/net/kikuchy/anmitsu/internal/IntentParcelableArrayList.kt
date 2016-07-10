
package net.kikuchy.anmitsu.internal

import android.content.Intent
import android.os.Parcelable
import java.util.*
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class IntentParcelableArrayList<T>(val getter: () -> Intent, val name: String? = null) : ReadWriteProperty<T, ArrayList<Parcelable>?> {
    override fun getValue(thisRef: T, property: KProperty<*>): ArrayList<Parcelable>? {
        return getter().getParcelableArrayListExtra(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: ArrayList<Parcelable>?) {
        getter().putParcelableArrayListExtra(name ?: property.name, value)
    }
}
