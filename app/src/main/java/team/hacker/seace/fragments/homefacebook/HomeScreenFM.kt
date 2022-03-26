package team.hacker.seace.fragments.homefacebook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import team.hacker.seace.R
import team.hacker.seace.databinding.FragmentHomeScreenFmBinding

class HomeScreenFM : Fragment() {
    lateinit var fmHomeScreenFmBinding: FragmentHomeScreenFmBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fmHomeScreenFmBinding = FragmentHomeScreenFmBinding.inflate(layoutInflater)
        return fmHomeScreenFmBinding.root
    }
}