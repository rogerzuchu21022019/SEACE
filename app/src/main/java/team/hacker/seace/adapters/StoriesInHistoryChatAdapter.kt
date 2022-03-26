package team.hacker.seace.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import team.hacker.seace.databinding.ItemRvStoriesBinding

import team.hacker.seace.models.stories.StoryItem
import team.hacker.seace.models.users.UserItem

class StoriesInHistoryChatAdapter :
    RecyclerView.Adapter<StoriesInHistoryChatAdapter.HistoryViewHolder>() {
    private var listStories: List<StoryItem> = emptyList()
    private var listUsers: List<UserItem> = emptyList()
    lateinit var layoutInflater: LayoutInflater
    lateinit var itemRvStoriesBinding: ItemRvStoriesBinding

    class HistoryViewHolder(itemRvStoriesBinding: ItemRvStoriesBinding) :
        RecyclerView.ViewHolder(itemRvStoriesBinding.root) {
    }

    fun setDataForAdapter(listStories: List<StoryItem>, listUsers: List<UserItem>) {
        this.listStories = listStories
        this.listUsers = listUsers
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        layoutInflater = LayoutInflater.from(parent.context)
        itemRvStoriesBinding = ItemRvStoriesBinding.inflate(layoutInflater, parent, false)
        return HistoryViewHolder(itemRvStoriesBinding = itemRvStoriesBinding)
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        var currentStory = listStories[position]
        var currentUser = listUsers[position]
        itemRvStoriesBinding.user = currentUser
        itemRvStoriesBinding.story = currentStory
    }

    override fun getItemCount(): Int {
        return listStories.size
    }
}