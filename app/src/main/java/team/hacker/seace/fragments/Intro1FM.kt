package team.hacker.seace.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import team.hacker.seace.R
import team.hacker.seace.databinding.FragmentIntro1FmBinding

class Intro1FM : Fragment() {
    lateinit var intro1FmBinding: FragmentIntro1FmBinding
    lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        intro1FmBinding = FragmentIntro1FmBinding.inflate(layoutInflater)
        return intro1FmBinding.root
    }
}