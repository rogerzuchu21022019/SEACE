package team.hacker.seace.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import team.hacker.seace.databinding.ItemRvStoryChatBinding
import team.hacker.seace.databinding.ItemRvStorySeaceBinding

import team.hacker.seace.models.stories.StoryItem
import team.hacker.seace.models.users.UserItem

class StoriesChatAdapter :
    RecyclerView.Adapter<StoriesChatAdapter.HistoryViewHolder>() {
    private var listStories: List<StoryItem> = emptyList()
    private var listUsers: List<UserItem> = emptyList()
    lateinit var layoutInflater: LayoutInflater
    lateinit var itemRvStoryChatBinding: ItemRvStoryChatBinding

    class HistoryViewHolder(itemRvStoryChatBinding: ItemRvStoryChatBinding) :
        RecyclerView.ViewHolder(itemRvStoryChatBinding.root) {
    }

    fun setDataForAdapter(listStories: List<StoryItem>, listUsers: List<UserItem>) {
        this.listStories = listStories
        this.listUsers = listUsers
        this.notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        layoutInflater = LayoutInflater.from(parent.context)
        itemRvStoryChatBinding = ItemRvStoryChatBinding.inflate(layoutInflater, parent, false)
        return HistoryViewHolder(itemRvStoryChatBinding = itemRvStoryChatBinding)
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        val currentStory = listStories[position]
        val currentUser = listUsers[position]
        itemRvStoryChatBinding.user = currentUser
        itemRvStoryChatBinding.story = currentStory
    }

    override fun getItemCount(): Int {
        return listStories.size
    }
}