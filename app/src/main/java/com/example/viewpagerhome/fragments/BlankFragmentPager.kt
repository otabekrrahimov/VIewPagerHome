package com.example.viewpagerhome.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpagerhome.R
import com.example.viewpagerhome.databinding.FragmentBlankPagerBinding

private const val ARG_PARAM0 = "param0"
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class BlankFragmentPager : Fragment() {
    private var param0: Int? = null
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param0 = it.getInt(ARG_PARAM0)
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }
    private lateinit var binding: FragmentBlankPagerBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankPagerBinding.inflate(layoutInflater)

        binding.fragLinear.setBackgroundResource(param0!!)
        binding.tvFrag1.text = param1
        binding.tvFrag2.text = param2

       return binding.root
    }

    companion object {

        fun newInstance(param0: Int , param1: String, param2: String) =
            BlankFragmentPager().apply {
                arguments = Bundle().apply {
                    getInt(ARG_PARAM0 , param0)
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}