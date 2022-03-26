package team.hacker.seace.fragments.accounts

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import team.hacker.seace.R
import team.hacker.seace.databinding.FragmentForgotFmBinding


class ForgotFM : Fragment() {
    lateinit var forgotFmBinding: FragmentForgotFmBinding
    lateinit var navController : NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        forgotFmBinding = FragmentForgotFmBinding.inflate(layoutInflater)
        forgotFmBinding.btnOK.setOnClickListener{
            navController = findNavController()
            var action = ForgotFMDirections.actionForgotFMToSignInFM()
            navController.navigate(action)
        }
        return forgotFmBinding.root
    }

}