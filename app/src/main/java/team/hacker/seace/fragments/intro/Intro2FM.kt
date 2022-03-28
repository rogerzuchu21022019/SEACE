package team.hacker.seace.fragments.intro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import team.hacker.seace.databinding.FragmentIntro2Binding

class Intro2FM : Fragment() {
    lateinit var fmIntro2FmBinding: FragmentIntro2Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fmIntro2FmBinding = FragmentIntro2Binding.inflate(layoutInflater)
        return fmIntro2FmBinding.root
    }
}