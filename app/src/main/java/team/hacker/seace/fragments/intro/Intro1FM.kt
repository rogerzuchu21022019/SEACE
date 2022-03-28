package team.hacker.seace.fragments.intro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import team.hacker.seace.databinding.FragmentIntro1Binding

class Intro1FM : Fragment() {
    lateinit var fmIntro1FmBinding: FragmentIntro1Binding
    lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fmIntro1FmBinding = FragmentIntro1Binding.inflate(layoutInflater)
        return fmIntro1FmBinding.root
    }
}