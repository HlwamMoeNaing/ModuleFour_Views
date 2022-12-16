package com.example.modulefour_views.views

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.SeekBar
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.modulefour_views.R
import kotlinx.android.synthetic.main.activity_image_ed_text_and_btn_assignment.*
import java.util.*

class ImageEdTextAndBtnAssignmentActivity : AppCompatActivity() {

    var myBrightnessLevel = 0.5f

    private var visibility = true
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

        rbMale.setOnCheckedChangeListener { compoundButton, isCheck ->
            if(isCheck){
                Toast.makeText(this,getString(R.string.male),Toast.LENGTH_LONG).show()
            }
        }

        rbFemale.setOnCheckedChangeListener { compoundButton, isCheck ->
            if(isCheck){
                Toast.makeText(this,getString(R.string.female),Toast.LENGTH_LONG).show()
            }
        }

        toggleRoomLight.setOnCheckedChangeListener { compoundButton, isCkeck ->
            when{
                isCkeck->
                    Toast.makeText(this,getString(R.string.turning_on_room_light),Toast.LENGTH_LONG).show()
                else->
                    Toast.makeText(this,getString(R.string.turning_off_room_light),Toast.LENGTH_LONG).show()
            }
        }

        swDoorLock.setOnCheckedChangeListener { compoundButton, isCheck ->
            when{
                isCheck->
                    Toast.makeText(this,getString(R.string.turning_on_room_light),Toast.LENGTH_LONG).show()
                else->
                    Toast.makeText(this,getString(R.string.turning_off_room_light),Toast.LENGTH_LONG).show()
            }
        }


        seekBarBrightness.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
             myBrightnessLevel = progress/100f
                tvBrightnessStatus.text = myBrightnessLevel.toString()
                val layoutParams = window.attributes
                layoutParams.screenBrightness = myBrightnessLevel
                window.attributes = layoutParams
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })

        btnRatingStatus.setOnClickListener {
            val ratingBarValue = ratingBar.rating
            Toast.makeText(this,"Rating - $ratingBarValue",Toast.LENGTH_LONG).show()
        }

        btnStartProgress.setOnClickListener {

            visibility = !visibility

            if (visibility){
                progressBar.visibility = View.VISIBLE
            }else{
                progressBar.visibility = View.GONE
            }



        }


        val additionalDrinkAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            resources.getStringArray(R.array.additional_drink)
        )

        additionalAutoComplete.setAdapter(additionalDrinkAdapter)

        /// Date And Time

        btnDatePicker.setOnClickListener {
            val calender = Calendar.getInstance()
            val day = calender[Calendar.DAY_OF_MONTH]
            val month = calender[Calendar.MONTH]
            val year = calender[Calendar.YEAR]
            // dialog
            val picker = DatePickerDialog(
                this,
                {view,year,monthOfYear,dayOfMonth->

                    tvSelectedDate.text = ("$dayOfMonth/${monthOfYear+1}/$year")
                },
                1978,3,21
            )
            picker.show()
        }


        btnTimePicker.setOnClickListener {
            val calender = Calendar.getInstance()
            val hour = calender[Calendar.HOUR_OF_DAY]
            val minus = calender[Calendar.MINUTE]

            // dialog

            val picker = TimePickerDialog(
                this,
                {tp,sHour,sMinus->
                    tvSelectedTime.text = ("$sHour : $sMinus")

                },
                hour,minus,true
            )
            picker.show()
        }

    }
}


