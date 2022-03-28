package team.hacker.seace.fragments.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

import team.hacker.seace.adapters.HomeScreenChatAdapter
import team.hacker.seace.adapters.UserInHomeScreenChatAdapter
import team.hacker.seace.databinding.FragmentHomeScreenChatBinding
import team.hacker.seace.databinding.ItemRvHomeScreenChatBinding
import team.hacker.seace.databinding.ItemRvUserOnlineInChatBinding
import team.hacker.seace.networks.API
import team.hacker.seace.networks.APIService

class HomeScreenChatFM : Fragment(),HomeScreenChatAdapter.OnClickItemChatInRecyclerView,UserInHomeScreenChatAdapter.OnItemClickInRecyclerViewUser {
    lateinit var fmMessChat: FragmentHomeScreenChatBinding
    private lateinit var adapter: HomeScreenChatAdapter
    lateinit var adapterUser: UserInHomeScreenChatAdapter
    lateinit var navController: NavController
    lateinit var action: NavDirections
    var apiService: APIService = API.getAPI().create(APIService::class.java)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fmMessChat = FragmentHomeScreenChatBinding.inflate(layoutInflater)
        initRecyclerView()
        initNavController()
        NavigationUI.setupWithNavController(fmMessChat.navBot, navController)
        getAllUsers()
        initClick()
        return fmMessChat.root
    }

    private fun initClick() {

        fmMessChat.tvBackSeaceHomeScreen.setOnClickListener {
            action = HomeScreenChatFMDirections.actionBotChatToBotHome2()
            navController.navigate(action)
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
                    adapterUser.setDataForAdapter(response.body()!!)
                }
            }
        }
    }

    private fun initRecyclerView() {
        adapter = HomeScreenChatAdapter()
        adapterUser = UserInHomeScreenChatAdapter()
        adapter.setItemOnClickInRecyclerView(this)
        adapterUser.setOnClickItem(this)
        fmMessChat.rvUserChat.adapter = adapterUser
        fmMessChat.rvItemChat.adapter = adapter

    }


    private fun runAction() {
        navController.navigate(action)
    }

    override fun onItemClick(position: Int, itemRvUserOnlineInChatBinding: ItemRvUserOnlineInChatBinding) {
        itemRvUserOnlineInChatBinding.tvUserName.setOnClickListener {
            action = HomeScreenChatFMDirections.actionBotChatToChatFM()
                    Toast.makeText(requireContext(),"Position $position",Toast.LENGTH_SHORT ).show()

            runAction()
        }
    }

    override fun onClickItem(position: Int, itemRvHomeScreenChatBinding: ItemRvHomeScreenChatBinding) {
//        Toast.makeText(requireContext(), "positon: $position",Toast.LENGTH_SHORT).show()
        action = HomeScreenChatFMDirections.actionBotChatToChatFM()
        runAction()
    }
}