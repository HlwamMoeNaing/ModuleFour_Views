package com.example.modulefour_views.assignments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.modulefour_views.R
import kotlinx.android.synthetic.main.activity_image_ed_text_and_btn_assignment.*
import kotlin.random.Random

class ImageEdTextAndBtnAssignmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_ed_text_and_btn_assignment)

        val greetingImages = intArrayOf(
            R.drawable.argin,
            R.drawable.camera,
            R.drawable.chritsmas,
            R.drawable.home,
            R.drawable.tree,
            R.drawable.spider
        )


        btnSayHello.setOnClickListener {
            val randomSeed = java.util.Random()
            val randomIndex = randomSeed.nextInt(greetingImages.size)
            ivRandom.setImageResource(greetingImages[randomIndex])

            Toast.makeText(this, edOne.text, Toast.LENGTH_LONG).show()
        }

        btnCheckFruit.setOnClickListener {
            var selectedFruit = ""
            if (checkBoxApple.isChecked) {
                selectedFruit = getString(R.string.apple)
            }
            if (checkBoxOrange.isChecked) {
                selectedFruit += getString(R.string.orange)
            }
            if (checkBoxwatermelon.isChecked) {
                selectedFruit += getString(R.string.watermelon)
            }


            val alertDialog = AlertDialog.Builder(this).create()
            alertDialog.setTitle(getString(R.string.your_fruits))
            alertDialog.setMessage("Your selected fruits $selectedFruit ")
            alertDialog.setButton(
                AlertDialog.BUTTON_NEUTRAL, "OK"
            ) { dialog, _ ->
                dialog.dismiss()

            }
            alertDialog.show()
        }
    }
}


