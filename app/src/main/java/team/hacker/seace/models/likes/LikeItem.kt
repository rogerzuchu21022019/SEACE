package team.hacker.seace.models.likes

import com.google.gson.annotations.Expose
import team.hacker.seace.models.posts.PostItem
import team.hacker.seace.models.users.UserItem

data class LikeItem(
    @Expose
    val Post: PostItem,
    @Expose
    val User: UserItem,
    @Expose
    val idLike: Int,
    @Expose
    val idPost: Int,
    @Expose
    val idUser: String,
    @Expose
    val typeLike: Int
)