package team.hacker.seace.fragments.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.DividerItemDecoration
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import team.hacker.seace.R
import team.hacker.seace.adapters.PostAdapter
import team.hacker.seace.adapters.StoriesInHomeScreenSeaceAdapter
import team.hacker.seace.databinding.FragmentHomeScreenSeaceBinding
import team.hacker.seace.databinding.ItemRvPostBinding
import team.hacker.seace.networks.API
import team.hacker.seace.networks.APIService

@DelicateCoroutinesApi
class HomeScreenSeaceFM : Fragment(), PostAdapter.OnClickItemInRecyclerView {
    lateinit var fmHomeSeaceFmBinding: FragmentHomeScreenSeaceBinding
    var apiService: APIService = API.getAPI().create(APIService::class.java)
    lateinit var navController: NavController
    lateinit var action: NavDirections
    lateinit var adapterStory: StoriesInHomeScreenSeaceAdapter
    lateinit var adapterPost: PostAdapter
    lateinit var itemRvPostBinding: ItemRvPostBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fmHomeSeaceFmBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_home_screen_seace,container,false)
        getAllStories()
        initRecyclerView()
        initNavController()
        initNavBot()
        initClick()
        return fmHomeSeaceFmBinding.root
    }


    private fun getAllStories() {
        GlobalScope.launch(Dispatchers.Main) {
            val response = apiService.getAllPosts()
            val responseStory = apiService.getAllStories()
            val responseUser = apiService.getAllUsers()
            if (responseUser.isSuccessful) {
                    adapterStory.setDataForAdapter(
                        listStories = responseStory.body()!!,
                        listUsers = responseUser.body()!!
                    )
                    adapterPost.setDataforAdapter(
                        listPosts = response.body()!!,
                        listUser= responseUser.body()!!

                    )
            }
        }
    }


    private fun initRecyclerView() {
        adapterPost = PostAdapter()

        adapterStory = StoriesInHomeScreenSeaceAdapter()
        adapterPost.setItemOnClickInRecyclerView(this)

        val decoration = DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL)
        fmHomeSeaceFmBinding.rcvPostContent.setHasFixedSize(true)
        fmHomeSeaceFmBinding.rcvPostContent.addItemDecoration(decoration)
        fmHomeSeaceFmBinding.rcvPostContent.adapter = adapterPost
        fmHomeSeaceFmBinding.rcvStory.adapter = adapterStory
    }

    private fun initClick() {
        fmHomeSeaceFmBinding.tvCreatePost.setOnClickListener {
                    Toast.makeText(requireContext()," Create ",Toast.LENGTH_SHORT ).show()
        }
        fmHomeSeaceFmBinding.ivCreatePost.setOnClickListener {
                    Toast.makeText(requireContext()," Create ",Toast.LENGTH_SHORT ).show()
        }

        fmHomeSeaceFmBinding.tvMess.setOnClickListener {
            action = HomeScreenSeaceFMDirections.actionBotHomeToBotChat()
            runAction()
        }
        fmHomeSeaceFmBinding.ivAvatar.setOnClickListener {
            action = HomeScreenSeaceFMDirections.actionBotHomeToProfileMeFragment()
            runAction()
        }
    }

    private fun runAction() {
        navController.navigate(action)
    }

    private fun initNavBot() {
        NavigationUI.setupWithNavController(fmHomeSeaceFmBinding.navBot, navController)
    }

    private fun initNavController() {
        navController = findNavController()
    }


    override fun onItemClick(position: Int, itemRvPostBinding: ItemRvPostBinding) {
//        Toast.makeText(requireContext()," $position",Toast.LENGTH_SHORT ).show()

        itemRvPostBinding.tvComment.setOnClickListener {
            action = HomeScreenSeaceFMDirections.actionBotHomeToCommentFM()
            runAction()
        }
        itemRvPostBinding.tvLike.setOnClickListener {
            Toast.makeText(requireContext(), "OK  +like", Toast.LENGTH_SHORT).show()

        }
        itemRvPostBinding.tvShare.setOnClickListener {
            Toast.makeText(requireContext(), "OK  +share", Toast.LENGTH_SHORT).show()
        }

    }


}