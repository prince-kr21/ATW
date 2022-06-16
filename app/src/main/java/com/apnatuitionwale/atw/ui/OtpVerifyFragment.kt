package com.apnatuitionwale.atw.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.apnatuitionwale.atw.R
import com.apnatuitionwale.atw.databinding.FragmentMainBinding
import com.apnatuitionwale.atw.databinding.FragmentOtpVerifyBinding


class OtpVerifyFragment : Fragment() {
    private var _binding : FragmentOtpVerifyBinding? = null
    private val binding: FragmentOtpVerifyBinding
        get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentOtpVerifyBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}