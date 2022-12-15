package com.example.modulefour_views.MyTests

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.modulefour_views.R
import kotlinx.android.synthetic.main.activity_image_view.*

class ImageViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view)

        imageView.scaleType =ImageView.ScaleType.CENTER
        val scaleCenter = ImageView.ScaleType.CENTER
        val scaleCenterCrop = ImageView.ScaleType.CENTER_CROP
        val scaleCenterInside = ImageView.ScaleType.CENTER_INSIDE
        val scaleFitCenter = ImageView.ScaleType.FIT_CENTER
        val scaleFitEnd = ImageView.ScaleType.FIT_END
        val scaleFitXy = ImageView.ScaleType.FIT_XY
        val scaleFitStart = ImageView.ScaleType.FIT_START
        val scaleMatrix = ImageView.ScaleType.MATRIX



        btnScaleCenter.setOnClickListener {
            imageView.scaleType =scaleCenter
        }

        btnScaleCenterCrop.setOnClickListener {
            imageView.scaleType =scaleCenterCrop
        }
        btnScaleCenterInside.setOnClickListener {
            imageView.scaleType =scaleCenterInside
        }

        btnScaleFitCenter.setOnClickListener {
            imageView.scaleType =scaleFitCenter
        }

        btnScaleFitEnd.setOnClickListener {
            imageView.scaleType =scaleFitEnd
        }

        btnScaleFitXy.setOnClickListener {
            imageView.scaleType =scaleFitXy
        }

        btnscaleFitStart.setOnClickListener {
            imageView.scaleType =scaleFitStart
        }
        btnScaleMatrix.setOnClickListener {
            imageView.scaleType =scaleMatrix
        }




    }
}