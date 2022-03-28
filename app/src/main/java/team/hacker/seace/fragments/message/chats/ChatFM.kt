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
    var fmChatBinding: FragmentChatBinding? = null
    lateinit var navController: NavController
    lateinit var action: NavDirections
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fmChatBinding = FragmentChatBinding.inflate(layoutInflater)
        initClick()

        initNavController()
        return fmChatBinding!!.root
    }


    private fun initNavController() {
        navController = findNavController()
    }

    private fun initClick() {
        fmChatBinding!!.ivBack.setOnClickListener {
            action = ChatFMDirections.actionChatFMToBotChat()
            runAction()
        }
        fmChatBinding!!.ivCallAudio.setOnClickListener {
            action = ChatFMDirections.actionChatFMToCallAudiolFragment()
            runAction()
        }
        fmChatBinding!!.ivCallVideo.setOnClickListener {
            action = ChatFMDirections.actionChatFMToCallVideoFragment()
            runAction()
        }
        fmChatBinding!!.ivProfile.setOnClickListener {
            action = ChatFMDirections.actionChatFMToProfileFriendFragment()
            runAction()
        }
    }

    private fun runAction() {
        navController.navigate(action)
    }

}