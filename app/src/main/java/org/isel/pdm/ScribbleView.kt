package org.isel.pdm

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.View

const val SCRIBBLE_STATE = "SCRIBBLE_STATE"

class ScribbleView(ctx: Context, attrs: AttributeSet? = null) : View(ctx, attrs) {
    var curr : Line? = null

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        curr?.draw(canvas)
    }
}