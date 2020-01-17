package ai.arturxdroid.nutritionhelper.ui.home_ask

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso

object CustomBindingAdapter {

    @JvmStatic
    @BindingAdapter("bind:imageUrl")
    public fun loadImage(imageView: ImageView, urlImage: String?) {
        if (urlImage != null)
            Picasso.get().load(urlImage).into(imageView)

    }

}