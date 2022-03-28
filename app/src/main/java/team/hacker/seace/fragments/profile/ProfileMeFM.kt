package team.hacker.seace.fragments.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import team.hacker.seace.databinding.FragmentProfileMeBinding

class ProfileMeFM : Fragment() {
private lateinit var fmProfileMeBinding: FragmentProfileMeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fmProfileMeBinding= FragmentProfileMeBinding.inflate(layoutInflater)
        return fmProfileMeBinding.root
    }
}