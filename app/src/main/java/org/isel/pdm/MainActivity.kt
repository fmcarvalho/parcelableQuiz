package org.isel.pdm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonDrawLine.setOnClickListener {
            scribbleView.curr = Line(
                10f, 10f, 100f, 100f
            )
            scribbleView.invalidate()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(SCRIBBLE_STATE, scribbleView.curr)
    }

    override fun onRestoreInstanceState(src: Bundle) {
        super.onRestoreInstanceState(src)
        scribbleView.curr = src.getParcelable<Line>(SCRIBBLE_STATE)
    }
}
