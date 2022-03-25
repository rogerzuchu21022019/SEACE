package team.hacker.seace.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import team.hacker.seace.R
import team.hacker.seace.databinding.FragmentIntro2FmBinding
import team.hacker.seace.databinding.FragmentIntro3FmBinding

class Intro2FM : Fragment() {
    lateinit var intro2FmBinding: FragmentIntro2FmBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        intro2FmBinding = FragmentIntro2FmBinding.inflate(layoutInflater)
        return intro2FmBinding.root
    }
}