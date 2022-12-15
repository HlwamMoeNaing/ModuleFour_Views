package com.example.modulefour_views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.modulefour_views.MyTests.ImageViewActivity
import com.example.modulefour_views.assignments.ImageEdTextAndBtnAssignmentActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGoImageView.setOnClickListener {
            startActivity(Intent(this, ImageViewActivity::class.java))
        }


        btnGoAssignmentOne.setOnClickListener {
            startActivity(Intent(this,ImageEdTextAndBtnAssignmentActivity::class.java))
        }
    }
}