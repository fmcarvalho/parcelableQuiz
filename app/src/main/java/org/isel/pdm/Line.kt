package org.isel.pdm

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Parcel
import android.os.Parcelable

class Line(val x: Float, val y: Float, val xEnd: Float, val yEnd: Float) : Parcelable{
    constructor(parcel: Parcel) : this(0f,0f,0f,0f
        /*
        parcel.readFloat(),
        parcel.readFloat(),
        parcel.readFloat(),
        parcel.readFloat()
        */

    ) {
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        /*
        dest.writeFloat(x)
        dest.writeFloat(y)
        dest.writeFloat(xEnd)
        dest.writeFloat(yEnd)
         */
    }

    override fun describeContents(): Int = 0

    fun draw(canvas: Canvas) {
        val p = Paint()
        p.strokeWidth = 20f
        p.color = Color.BLUE
        canvas.drawLine(x, y , xEnd, yEnd, p)
    }

    companion object CREATOR : Parcelable.Creator<Line> {
        override fun createFromParcel(parcel: Parcel): Line {
            return Line(parcel)
        }

        override fun newArray(size: Int): Array<Line?> {
            return arrayOfNulls(size)
        }
    }

}
