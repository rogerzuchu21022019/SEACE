package team.hacker.seace.fragments.message.calls

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import team.hacker.seace.databinding.FragmentCallVideoBinding

class CallVideoFM : Fragment() {
private lateinit var fmCallVideoBinding: FragmentCallVideoBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        fmCallVideoBinding= FragmentCallVideoBinding.inflate(layoutInflater)
        return fmCallVideoBinding.root
    }
}