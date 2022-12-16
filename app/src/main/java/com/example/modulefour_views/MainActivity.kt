package com.example.modulefour_views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.modulefour_views.MyTests.ImageViewActivity
import com.example.modulefour_views.viewGroup.LinearAndFrameLayoutWithAssignment
import com.example.modulefour_views.views.ImageEdTextAndBtnAssignmentActivity
import com.example.modulefour_views.views.YourRideAssignmentActivity
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

        btnGoLayout.setOnClickListener {
            startActivity(Intent(this,LinearAndFrameLayoutWithAssignment::class.java))
        }

        btnGoYourRider.setOnClickListener {
            startActivity(Intent(this,YourRideAssignmentActivity::class.java))
        }
    }
}