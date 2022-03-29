package team.hacker.seace.adapters

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import team.hacker.seace.R

class BindindImageAdapter{
    @DelicateCoroutinesApi
    companion object{
        @JvmStatic
        @BindingAdapter("android:loadURL")
        fun loadImage(imageView: ImageView,url:String){
            GlobalScope.launch(Dispatchers.Main){
                Glide.with(imageView).load(url).placeholder(R.drawable.girl).error(R.drawable.delete).into(imageView)
            }

        }
    }
}