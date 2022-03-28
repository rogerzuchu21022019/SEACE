package team.hacker.seace.fragments.accounts

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import team.hacker.seace.R
import team.hacker.seace.databinding.FragmentLoginBinding

class SignInFM : Fragment() {
    lateinit var fmSignInFmBinding: FragmentLoginBinding
    lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fmSignInFmBinding = FragmentLoginBinding.inflate(layoutInflater)
        initClick()
        initNavController()
        return fmSignInFmBinding.root
    }

    private fun initNavController() {
        navController = findNavController()
    }

    private fun initClick() {
        fmSignInFmBinding.acbLogin.setOnClickListener {
            val action:NavDirections = SignInFMDirections.actionSignInFMToHomeScreenFM()
            navController.navigate(action)
        }
        fmSignInFmBinding.tvForgetPassword.setOnClickListener {
            val action:NavDirections = SignInFMDirections.actionSignInFMToForgotFM()
            navController.navigate(action)
        }
        fmSignInFmBinding.tvRegister.setOnClickListener {
            val action:NavDirections = SignInFMDirections.actionSignInFMToRegisterFM()
            navController.navigate(action)
        }
    }
}