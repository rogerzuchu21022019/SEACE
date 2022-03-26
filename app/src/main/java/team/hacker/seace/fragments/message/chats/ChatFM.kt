package team.hacker.seace.fragments.message.chats

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import team.hacker.seace.databinding.FragmentChatBinding

class ChatFM : Fragment() {
    var fragmentChatBinding: FragmentChatBinding? = null
    lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentChatBinding = FragmentChatBinding.inflate(layoutInflater)
        initClick()

        initNavController()
        return fragmentChatBinding!!.root
    }


    private fun initNavController() {
        navController = findNavController()
    }

    private fun initClick() {
        fragmentChatBinding!!.ivBack.setOnClickListener {
            var action:NavDirections = ChatFMDirections.actionChatFMToBotChat()
            navController.navigate(action)
        }
    }

}