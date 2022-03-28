package team.hacker.seace.fragments.accounts

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import team.hacker.seace.databinding.FragmentRegisterBinding

class RegisterFM : Fragment() {
    lateinit var fmRegisterFmBinding: FragmentRegisterBinding
    lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fmRegisterFmBinding = FragmentRegisterBinding.inflate(layoutInflater)
        fmRegisterFmBinding.lavAdd.setOnClickListener{
            navController = findNavController()
            var action = RegisterFMDirections.actionRegisterFMToSignInFM()
            navController.navigate(action)
        }
        return fmRegisterFmBinding.root
    }
}