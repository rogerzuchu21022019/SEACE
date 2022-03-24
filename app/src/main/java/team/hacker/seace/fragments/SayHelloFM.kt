package team.hacker.seace.fragments

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
import team.hacker.seace.databinding.FragmentSayHelloFmBinding

class SayHelloFM : Fragment() {
    lateinit var sayHelloFmBinding : FragmentSayHelloFmBinding
    lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        navController = findNavController()


        var handler : Handler = Handler(Looper.myLooper()!!)
        handler.postDelayed(Runnable {
               var action : NavDirections = SayHelloFMDirections.actionSayHelloFMToContainerFM2()
                navController.navigate(action)
        },3000)


        sayHelloFmBinding = FragmentSayHelloFmBinding.inflate(layoutInflater)
        return sayHelloFmBinding.root
    }
}