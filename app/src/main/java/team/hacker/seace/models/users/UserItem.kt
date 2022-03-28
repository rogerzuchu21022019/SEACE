package team.hacker.seace.models.users

import android.os.Parcelable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.google.gson.annotations.Expose
import kotlinx.parcelize.Parcelize
import java.io.Serializable

data class UserItem(
    val Comments: List<Any>,
    val Likes: List<Any>,
    val Posts: List<Any>,
    val Stories: List<Any>,
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
