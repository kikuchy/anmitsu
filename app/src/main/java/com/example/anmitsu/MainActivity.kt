package com.example.anmitsu

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import net.kikuchy.anmitsu.intent
import net.kikuchy.anmitsu.intentBoolean
import net.kikuchy.anmitsu.intentInt

class MainActivity : AppCompatActivity() {
    val hoge: String? by intent()
    val moge by intentInt(0)
    val piyo by intentBoolean(false)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text.text = hoge ?: "DEFAULT"
        text.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java).apply { putExtra("hoge", "HOGE!!!!") })
        }
        supportFragmentManager.
                beginTransaction().
                add(R.id.placeholder, BlankFragment.newInstance("HOGE, ON FRAGMENT!!!!!")).
                commit()
    }
}
