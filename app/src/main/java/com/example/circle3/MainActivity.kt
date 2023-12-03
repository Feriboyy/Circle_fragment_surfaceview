package com.example.circle3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.circle3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), FirstFragment.OnDrawCircleListener {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, FirstFragment())
                .commit()
        }
    }

    override fun onDrawCircle(radius: Float) {
        val secondFragment = SecondFragment()
        val bundle = Bundle()
        bundle.putFloat("radius", radius)
        secondFragment.arguments = bundle

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, secondFragment)
            .addToBackStack(null)
            .commit()
    }
}