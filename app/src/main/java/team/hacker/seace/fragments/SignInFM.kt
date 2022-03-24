package team.hacker.seace.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import team.hacker.seace.R
import team.hacker.seace.databinding.FragmentSignInFmBinding

class SignInFM : Fragment() {
    lateinit var navController: NavController
    lateinit var signInFmBinding: FragmentSignInFmBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        signInFmBinding = FragmentSignInFmBinding.inflate(layoutInflater)

        signInFmBinding.txtRegister.setOnClickListener{
            navController = findNavController()
            var action = SignInFMDirections.actionSignInFMToRegisterFM()
            navController.navigate(action)
        }

        signInFmBinding.txtForgotPassword.setOnClickListener{
            navController = findNavController()
            var action = SignInFMDirections.actionSignInFMToForgotFM()
            navController.navigate(action)
        }
        return signInFmBinding.root
    }
}