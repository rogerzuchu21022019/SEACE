package team.hacker.seace.fragments.intro

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import team.hacker.seace.databinding.FragmentSplashBinding

class SplashFM : Fragment() {
    lateinit var fmSplashBinding: FragmentSplashBinding
    lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        navController = findNavController()




        fmSplashBinding = FragmentSplashBinding.inflate(layoutInflater)
        initSplashScreen()
        return fmSplashBinding.root
    }

    private fun initSplashScreen() {
        var handler: Handler = Handler(Looper.myLooper()!!)
        handler.postDelayed(Runnable {
            var action: NavDirections = SplashFMDirections.actionSplashFMToContainerFM()
            navController.navigate(action)
        }, 3000)
    }
}