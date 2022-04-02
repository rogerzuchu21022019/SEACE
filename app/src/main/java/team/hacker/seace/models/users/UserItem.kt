package team.hacker.seace.models.users

import android.os.Parcelable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.google.gson.annotations.Expose
import kotlinx.parcelize.Parcelize
import team.hacker.seace.models.comments.CommentItem
import team.hacker.seace.models.likes.LikeItem
import team.hacker.seace.models.posts.PostItem
import team.hacker.seace.models.stories.StoryItem
import java.io.Serializable

data class UserItem(
    @Expose
    val Comments: List<CommentItem>,
    @Expose
    val Likes: List<LikeItem>,
    @Expose
    val Posts: List<PostItem>,
    @Expose
    val Stories: List<StoryItem>,
    @Expose
    val address: String,
    @Expose
    val age: Int,
    @Expose
    val avatar: String,
    @Expose
    val email: String,
    @Expose
    val fullname: String,
    @Expose
    val idUser: String,
    @Expose
    val job: String,
    @Expose
    val password: String,
    @Expose
    val phone: String

)
