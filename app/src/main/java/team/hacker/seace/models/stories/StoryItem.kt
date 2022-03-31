package team.hacker.seace.models.stories

import com.google.gson.annotations.Expose

data class StoryItem(
    @Expose
    val User: Any,
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