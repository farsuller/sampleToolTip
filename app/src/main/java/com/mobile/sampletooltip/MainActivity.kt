package com.mobile.sampletooltip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.skydoves.balloon.OnBalloonClickListener

class MainActivity : AppCompatActivity(), OnBalloonClickListener {

    private val checkAddressToolTip by lazy { ToolTipUtils.getNavigationToolTip(
            this, this, this,
            "You are ordering from. Check if this is the right address.") }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.clickMe)

        button.setOnClickListener {
            checkAddressToolTip.showAlignBottom(button)
        }
    }

    override fun onBalloonClick(view: View) {
        checkAddressToolTip.dismiss()
    }
}