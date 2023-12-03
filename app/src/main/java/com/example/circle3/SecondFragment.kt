package com.example.circle3

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.circle3.databinding.FragmentSecondBinding
import kotlin.random.Random

class SecondFragment : Fragment(), FirstFragment.OnDrawCircleListener {

    lateinit var binding: FragmentSecondBinding
    lateinit var circleSurfaceView: CircleSurfaceView

    private var radius: Float = 0f

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater, container, false)
        circleSurfaceView = binding.surfaceViewContainer // Replace with the actual ID

        return binding.root
    }

    override fun onDrawCircle(radius: Float) {
        this.radius = radius
        Log.d("SecondFragment", "Setting radius: $radius")
        val randomX = Random.nextInt(circleSurfaceView.width).toFloat()
        val randomY = Random.nextInt(circleSurfaceView.height).toFloat()
        circleSurfaceView.setCirclePosition(randomX, randomY)
    }

//    override fun onDrawCircle(radius: Float) {
//        this.radius = radius
//        Log.d("SecondFragment", "Setting radius: $radius")
//        circleSurfaceView.setCircleRadius(radius)
//    }
}