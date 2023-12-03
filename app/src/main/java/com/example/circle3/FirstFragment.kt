package com.example.circle3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.circle3.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    interface OnDrawCircleListener {
        fun onDrawCircle(radius: Float)
    }

    lateinit var binding: FragmentFirstBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater, container, false)




        binding.drawCircleButton.setOnClickListener {

            val radius = binding.radiusEditText.text.toString().toFloat()
            if (radius != null) {
                val listener = activity as? OnDrawCircleListener
                listener?.onDrawCircle(radius)
            }
        }

        return binding.root

    }
}