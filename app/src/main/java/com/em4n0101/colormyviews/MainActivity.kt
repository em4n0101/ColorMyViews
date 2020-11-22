package com.em4n0101.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    setListeners()
  }

  private fun setListeners() {
    val clickableViews: List<View> = listOf(boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText, constraintLayout, buttonGreen, buttonRed, buttonYellow)

    for (innerView in clickableViews) {
      innerView.setOnClickListener { makeColored(it) }
    }
  }

  private fun makeColored(innerView: View?) {
    when (innerView?.id) {
      R.id.boxOneText -> innerView.setBackgroundColor(Color.DKGRAY)
      R.id.boxTwoText -> innerView.setBackgroundColor(Color.GRAY)

      R.id.boxThreeText -> innerView.setBackgroundResource(android.R.color.holo_green_light)
      R.id.boxFourText -> innerView.setBackgroundResource(android.R.color.holo_green_dark)
      R.id.boxFiveText -> innerView.setBackgroundResource(android.R.color.holo_green_light)

      R.id.buttonGreen -> boxThreeText.setBackgroundResource(android.R.color.holo_green_light)
      R.id.buttonRed -> boxFourText.setBackgroundResource(android.R.color.holo_green_dark)
      R.id.buttonYellow -> boxFiveText.setBackgroundResource(android.R.color.holo_green_light)

      else -> innerView?.setBackgroundColor(Color.LTGRAY)
    }
  }
}