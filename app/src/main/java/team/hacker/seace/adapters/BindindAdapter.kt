package team.hacker.seace.adapters

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

class BindindAdapter{
    companion object{
        @JvmStatic
        @BindingAdapter("android:loadURL")
        fun loadImage(imageView: ImageView,url:String){
            Glide.with(imageView).load(url).into(imageView)
        }
    }
}