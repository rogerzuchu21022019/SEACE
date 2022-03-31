package team.hacker.seace.models.photoposts

import com.google.gson.annotations.Expose

data class PhotoPostItem(
    @Expose
    val Post: Any,
    @Expose
    val idPhotoPost: Int,
    @Expose
    val idPost: Int,
    @Expose
    val srcPhotoPost: String
)