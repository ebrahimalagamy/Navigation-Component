package com.example.navigationcomponent

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.databinding.FragmentHomeBinding
import com.example.navigationcomponent.databinding.FragmentSettingsBinding
import com.example.navigationcomponent.databinding.FragmentTermsConditionsBinding

class TermsAndConditionsFragment : Fragment(R.layout.fragment_terms_conditions) {
    private lateinit var binding: FragmentTermsConditionsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTermsConditionsBinding.bind(view)

    }
}