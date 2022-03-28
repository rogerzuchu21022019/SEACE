package team.hacker.seace.fragments.intro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import team.hacker.seace.databinding.FragmentIntro3Binding

class Intro3FM : Fragment() {
    lateinit var fmIntro3FmBinding: FragmentIntro3Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fmIntro3FmBinding = FragmentIntro3Binding.inflate(layoutInflater)

        return fmIntro3FmBinding.root
    }
}