package team.hacker.seace.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import team.hacker.seace.databinding.FragmentIntro3FmBinding

class Intro3FM : Fragment() {
    lateinit var intro3FmBinding: FragmentIntro3FmBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        intro3FmBinding = FragmentIntro3FmBinding.inflate(layoutInflater)

        return intro3FmBinding.root
    }
}