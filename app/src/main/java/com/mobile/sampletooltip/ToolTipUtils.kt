package com.mobile.sampletooltip

import android.content.Context
import android.content.res.AssetManager
import androidx.core.content.ContextCompat
import androidx.lifecycle.LifecycleOwner
import com.skydoves.balloon.*


object ToolTipUtils {

    fun getNavigationToolTip(
        context: Context?,
        onBalloonClickListener: OnBalloonClickListener,
        lifecycleOwner: LifecycleOwner,
        messageToDisplay: String,
    ): Balloon {
        return Balloon.Builder(context!!)
            .setArrowSize(20)
            .setArrowOrientation(ArrowOrientation.TOP)
            .setArrowPositionRules(ArrowPositionRules.ALIGN_ANCHOR)
            .setArrowPosition(0.74f)
            .setArrowColorResource(R.color.white)
            .setHeight(120)
            .setWidthRatio(.5f)
            .setPadding(12)
            .setCornerRadius(6f)
            .setTextSize(13f)
            .setText(messageToDisplay)
            .setTextColor(ContextCompat.getColor(context, R.color.black))
            .setBackgroundColor(ContextCompat.getColor(context, R.color.white))
            .setOnBalloonClickListener(onBalloonClickListener)
            .setBalloonAnimation(BalloonAnimation.FADE)
            .setLifecycleOwner(lifecycleOwner)
            .build()
    }

}

