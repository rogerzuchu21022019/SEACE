package team.hacker.seace.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import team.hacker.seace.R
import team.hacker.seace.databinding.FragmentSharePostBinding

class SharePostFM : Fragment() {
    lateinit var fmSharePostBinding: FragmentSharePostBinding
    lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fmSharePostBinding = FragmentSharePostBinding.inflate(layoutInflater)
        initNavController()
        NavigationUI.setupWithNavController(fmSharePostBinding.navBot,navController)
        return fmSharePostBinding.root
    }

    private fun initNavController() {
        navController = findNavController()
    }

}