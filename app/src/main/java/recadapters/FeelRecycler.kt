package recadapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.practice13.R

class FeelRecycler(val context: Context, val list: ArrayList<feel>) : RecyclerView.Adapter<FeelRecycler.MyVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyVH {
        val root = LayoutInflater.from(context).inflate(R.layout.feel_adapter, parent,false)
        return MyVH(root)
    }
    class MyVH(itemView: View): RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.img_feel)
        val textView: TextView = itemView.findViewById(R.id.text_feel)
    }
    override fun onBindViewHolder(holder: MyVH, position: Int) {
        holder.image.setImageResource(list[position].image)
        holder.textView.text = list[position].name_feel
    }
    override fun getItemCount(): Int {
        return list.size
    }
}