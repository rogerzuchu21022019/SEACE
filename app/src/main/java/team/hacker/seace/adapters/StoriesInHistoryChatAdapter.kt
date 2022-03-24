package team.hacker.seace.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import team.hacker.seace.databinding.ItemRvStoriesBinding

import team.hacker.seace.models.stories.StoryItem

class StoriesInHistoryChatAdapter : RecyclerView.Adapter<StoriesInHistoryChatAdapter.HistoryViewHolder>() {
    private var listStories: List<StoryItem> = emptyList()
    lateinit var layoutInflater: LayoutInflater
    lateinit var itemRvStoriesBinding: ItemRvStoriesBinding

    class HistoryViewHolder(itemRvStoriesBinding: ItemRvStoriesBinding) :
        RecyclerView.ViewHolder(itemRvStoriesBinding.root) {

    }

    fun setDataForAdapter(listStories: List<StoryItem>) {
     this.listStories = listStories
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        layoutInflater = LayoutInflater.from(parent.context)
        itemRvStoriesBinding = ItemRvStoriesBinding.inflate(layoutInflater, parent, false)
        return HistoryViewHolder(itemRvStoriesBinding = itemRvStoriesBinding)
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        var currentStory = listStories[position]
    }

    override fun getItemCount(): Int {
        return listStories.size
    }
}