package team.hacker.seace.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import team.hacker.seace.databinding.ItemRvHistoryChatBinding
import team.hacker.seace.models.HistoryChatModel
import team.hacker.seace.models.comments.CommentItem
import team.hacker.seace.models.users.UserItem

class HistoryChatAdapter : RecyclerView.Adapter<HistoryChatAdapter.HistoryViewHolder>() {
    private var historyChatList: List<UserItem> = emptyList()
    private var listComment: List<CommentItem> = emptyList()
    lateinit var layoutInflater: LayoutInflater
    lateinit var itemRvHistoryChatBinding: ItemRvHistoryChatBinding

    class HistoryViewHolder(itemRvHistoryChatBinding: ItemRvHistoryChatBinding) :
        RecyclerView.ViewHolder(itemRvHistoryChatBinding.root) {

    }

    fun setDataForAdapter(historyChatList: List<UserItem>, listComment: List<CommentItem>) {
        this.historyChatList = historyChatList
        this.listComment = listComment
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        layoutInflater = LayoutInflater.from(parent.context)
        itemRvHistoryChatBinding = ItemRvHistoryChatBinding.inflate(layoutInflater, parent, false)
        return HistoryViewHolder(itemRvHistoryChatBinding = itemRvHistoryChatBinding)
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        var currentContent = historyChatList[position]
        var currentComment = listComment[position]
        itemRvHistoryChatBinding.user = currentContent
        itemRvHistoryChatBinding.comment = currentComment
    }

    override fun getItemCount(): Int {
        return historyChatList.size
    }
}