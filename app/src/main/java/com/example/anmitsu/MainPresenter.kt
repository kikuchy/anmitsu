package com.example.anmitsu

import android.content.Intent
import net.kikuchy.anmitsu.intentString

class MainPresenter(intent: Intent) {
    var moge by intentString(intent)
}