package team.hacker.seace.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import team.hacker.seace.models.HistoryChatModel
import team.hacker.seace.databinding.ItemRvHistoryChatBinding

class HistoryChatAdapter : RecyclerView.Adapter<HistoryChatAdapter.HistoryViewHolder>() {
    var historyChatList:List<HistoryChatModel> = emptyList()
    lateinit var layoutInflater: LayoutInflater
    lateinit var itemRvHistoryChatBinding: ItemRvHistoryChatBinding

    class HistoryViewHolder(itemRvHistoryChatBinding: ItemRvHistoryChatBinding) : RecyclerView.ViewHolder(itemRvHistoryChatBinding.root) {

    }
    fun setDataForAdapter(historyChatList:List<HistoryChatModel>){
        this.historyChatList = historyChatList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        layoutInflater = LayoutInflater.from(parent.context)
        itemRvHistoryChatBinding = ItemRvHistoryChatBinding.inflate(layoutInflater,parent,false)
        return HistoryViewHolder(itemRvHistoryChatBinding = itemRvHistoryChatBinding)
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        var currentContent = historyChatList[position]
        itemRvHistoryChatBinding.history = currentContent
    }

    override fun getItemCount(): Int {
        return historyChatList.size
    }
}