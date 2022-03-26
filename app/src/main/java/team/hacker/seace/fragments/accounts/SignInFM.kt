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
import team.hacker.seace.databinding.FragmentSignInFmBinding

class SignInFM : Fragment() {
    lateinit var fmSignInFmBinding: FragmentSignInFmBinding
    lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fmSignInFmBinding = FragmentSignInFmBinding.inflate(layoutInflater)
        initClick()
        navController = findNavController()
        return fmSignInFmBinding.root
    }

    private fun initClick() {
        fmSignInFmBinding.btnLogin.setOnClickListener {
            var action:NavDirections = SignInFMDirections.actionSignInFMToNavGraph2()
            navController.navigate(action)
        }
    }
}