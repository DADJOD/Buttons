package com.template.buttons

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var mButtonNo: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(view: View) {
        if (view.id == R.id.add_button) {
            val newButton = Button(this)
            newButton.setOnClickListener(this)
            newButton.text = buildString {
                                            append(getString(R.string.button_text))
                                            append(mButtonNo++) }
            (view.parent as LinearLayout).addView(newButton)
        } else {
            (view.parent as LinearLayout).removeView(view)
        }
    }


//    override fun onClick(view: View) {
//        if (view.id == R.id.add_button) {
//            val newButton = Button(this)
//            newButton.setOnClickListener(this)
//            newButton.text = " " + mButtonNo++
//            (view.parent as LinearLayout).addView(newButton)
//        }
//    }
}