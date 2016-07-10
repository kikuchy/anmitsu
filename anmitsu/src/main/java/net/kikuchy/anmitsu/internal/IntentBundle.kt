
package net.kikuchy.anmitsu.internal

import android.content.Intent
import android.os.Bundle
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class IntentBundle<T>(val getter: () -> Intent, val name: String? = null) : ReadWriteProperty<T, Bundle?> {
    override fun getValue(thisRef: T, property: KProperty<*>): Bundle? {
        return getter().getBundleExtra(name ?: property.name)
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: Bundle?) {
        getter().putExtra(name ?: property.name, value)
    }
}
