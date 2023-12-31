package com.example.circle3

import android.content.Context
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.util.Log
import android.view.SurfaceHolder
import android.view.SurfaceView

class CircleSurfaceView : SurfaceView, SurfaceHolder.Callback {

    private var radius: Float = 0f

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    private fun init() {
        holder.addCallback(this)
    }

    fun setCircleRadius(radius: Float) {
        this.radius = radius
        drawCircle()
    }

    private fun drawCircle() {
        val canvas = holder.lockCanvas()
        canvas.drawColor(Color.WHITE)

        val paint = Paint().apply {
            color = Color.RED
            style = Paint.Style.FILL
        }

        val centerX = canvas.width / 2f
        val centerY = canvas.height / 2f

        canvas.drawCircle(centerX, centerY, radius, paint)

        holder.unlockCanvasAndPost(canvas)
    }

    override fun surfaceCreated(holder: SurfaceHolder) {
        Log.d("CircleSurfaceView", "Surface created")
//        drawCircle()
    }

    override fun surfaceChanged(holder: SurfaceHolder, format: Int, width: Int, height: Int) {
        Log.d("CircleSurfaceView", "Surface changed")
//        drawCircle()
    }

    override fun surfaceDestroyed(holder: SurfaceHolder) {
        Log.d("CircleSurfaceView", "Surface destroyed")
    }

}