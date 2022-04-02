package team.hacker.seace.models.stories

import com.google.gson.annotations.Expose
import team.hacker.seace.models.users.UserItem

data class StoryItem(
    @Expose
    val User: UserItem,
    @Expose
    val contentStory: String,
    @Expose
    val idStory: Int,
    @Expose
    val idUser: String,
    @Expose
    val srcImage: String,
    @Expose
    val timeStoryUp: String
)