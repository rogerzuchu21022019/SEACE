package team.hacker.seace.fragments.accounts

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import team.hacker.seace.R
import team.hacker.seace.databinding.FragmentRegisterFmBinding

class RegisterFM : Fragment() {
    lateinit var registerFmBinding: FragmentRegisterFmBinding
    lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        registerFmBinding = FragmentRegisterFmBinding.inflate(layoutInflater)
        registerFmBinding.lavAdd.setOnClickListener{
            navController = findNavController()
            var action = RegisterFMDirections.actionRegisterFMToSignInFM()
            navController.navigate(action)
        }
        return registerFmBinding.root
    }
}