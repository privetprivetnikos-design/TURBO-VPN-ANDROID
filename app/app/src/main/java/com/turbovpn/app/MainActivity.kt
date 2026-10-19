package com.turbovpn.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.statusBarColor = Color.rgb(8, 17, 31)
        window.navigationBarColor = Color.rgb(8, 17, 31)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(28, 28, 28, 28)
            setBackgroundColor(Color.rgb(8, 17, 31))
        }

        val title = TextView(this).apply {
            text = "TURBO VPN"
            textSize = 34f
            gravity = Gravity.CENTER
            setTextColor(Color.rgb(54, 214, 165))
        }

        val status = TextView(this).apply {
            text = "NOT CONNECTED"
            textSize = 18f
            gravity = Gravity.CENTER
            setTextColor(Color.WHITE)
            setPadding(0, 35, 0, 25)
        }

        val button = Button(this).apply {
            text = "CONNECT"
            textSize = 18f
            setOnClickListener {
                status.text = "SERVER NOT CONFIGURED"
            }
        }

        val info = TextView(this).apply {
            text = "Secure connection starts here"
            textSize = 14f
            gravity = Gravity.CENTER
            setTextColor(Color.LTGRAY)
            setPadding(0, 30, 0, 0)
        }

        layout.addView(title)
        layout.addView(status)
        layout.addView(button)
        layout.addView(info)

        setContentView(layout)
    }
}
