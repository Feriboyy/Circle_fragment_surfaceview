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

//    private lateinit var radiusEditText: EditText
//    private lateinit var drawCircleButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater, container, false)




        binding.drawCircleButton.setOnClickListener {

//            val radiusText = binding.radiusEditText.text.toString()
//
//            if (radiusText.isNotBlank()) {
//                try {
//                    val radius = radiusText.toFloat()
//                    val listener = activity as? OnDrawCircleListener
//                    listener?.onDrawCircle(radius)
//                } catch (e: NumberFormatException) {
//                    // Handle the case where the input is not a valid float
//                    // You can show a Toast or set an error message on the EditText
//                    binding.radiusEditText.error = "Invalid radius"
//                }
//            } else {
//                // Handle the case where the input is empty
//                binding.radiusEditText.error = "Enter a radius"
//            }





            val radius = binding.radiusEditText.text.toString().toFloat()
            if (radius != null) {
                val listener = activity as? OnDrawCircleListener
                listener?.onDrawCircle(radius)
            }
        }

        return binding.root

    }
}