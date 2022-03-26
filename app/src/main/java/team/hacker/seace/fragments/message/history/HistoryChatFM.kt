package team.hacker.seace.fragments.message.history

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

import team.hacker.seace.adapters.HistoryChatAdapter
import team.hacker.seace.adapters.StoriesInHistoryChatAdapter
import team.hacker.seace.databinding.FragmentMessChatBinding
import team.hacker.seace.networks.API
import team.hacker.seace.networks.APIService

class HistoryChatFM : Fragment() {
    lateinit var fmMessChat: FragmentMessChatBinding
    private lateinit var adapter: HistoryChatAdapter
    lateinit var adapterStories: StoriesInHistoryChatAdapter
    lateinit var navController: NavController

    var apiService: APIService = API.getAPI().create(APIService::class.java)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fmMessChat = FragmentMessChatBinding.inflate(layoutInflater)
        initRecyclerView()
        initNavController()
        NavigationUI.setupWithNavController(fmMessChat.navBot, navController)
        getAllUsers()
        getAllStories()
        initClick()
        return fmMessChat.root
    }

    private fun initClick() {
        fmMessChat.fabNext.setOnClickListener {
            var aciton: NavDirections = HistoryChatFMDirections.actionBotChatToChatFM()
            navController.navigate(aciton)
        }
    }

    private fun initNavController() {
        navController = findNavController()
    }


    private fun getAllUsers() {
        GlobalScope.launch(Dispatchers.Main) {
            val response = apiService.getAllUsers()
            val responseComment = apiService.getAllComments()
            if (response.isSuccessful) {
                for (data in response.body()!!) {
                    adapter.setDataForAdapter(response.body()!!, responseComment.body()!!)

                }
            }

//            )

        }
    }

    private fun getAllStories() {
        GlobalScope.launch(Dispatchers.Main) {
            val response = apiService.getAllStories()
            val responseUsers = apiService.getAllUsers()

            if (response.isSuccessful) {
                for (data in response.body()!!) {
                    adapterStories.setDataForAdapter(response.body()!!,responseUsers.body()!!)

                }
            }

//            )

        }
    }


    private fun initRecyclerView() {
        adapter = HistoryChatAdapter()
        adapterStories = StoriesInHistoryChatAdapter()

        fmMessChat.rvStory.adapter = adapterStories
        fmMessChat.rvHistoryChat.adapter = adapter

    }
}