package com.example.navigationcomponent

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.databinding.FragemntLoginBinding

class LogInFragment : Fragment(R.layout.fragemnt_login) {
    lateinit var binding: FragemntLoginBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragemntLoginBinding.bind(view)

        binding.btnConfirm.setOnClickListener {
            val username = binding.etUsername.text.toString()
            val password = binding.etPassword.text.toString()
            val action =
                LogInFragmentDirections.actionLogInFragmentToWelcomeFragment(username, password)
            findNavController().navigate(action)
        }
    }
}