package team.hacker.seace.models.photoposts

import com.google.gson.annotations.Expose
import team.hacker.seace.models.posts.PostItem

data class PhotoPostItem(
    val Post: PostItem,
    @Expose
    val idPhoto: Int,
    @Expose
    val idPost: Int,
    @Expose
    val srcPhoto: String
)