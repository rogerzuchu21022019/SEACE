package team.hacker.seace.models.likes

import com.google.gson.annotations.Expose

data class LikeItem(
    @Expose
    val Post: Any,
    @Expose
    val User: Any,
    @Expose
    val idLike: Int,
    @Expose
    val idPost: Int,
    @Expose
    val idUser: String,
    @Expose
    val typeLike: Int
)