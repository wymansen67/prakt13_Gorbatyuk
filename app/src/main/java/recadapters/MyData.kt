package recadapters

import com.example.practice13.R

data class feel(val image:Int, val name_feel:String)

class MyFeel{ val list = arrayListOf(feel(R.drawable.salm,"Спокойным"),
    feel(R.drawable.relaxed,"Расслабленным"),
    feel(R.drawable.concentrated,"Сосредоточеным"),
    feel(R.drawable.excited,"Взволнованным"),
    feel(R.drawable.empty,""))
}
data class state(val title:String, val text_state:String, val image_state: Int)
class MyState
{val state_list = arrayListOf(state("Заголовок статьи", "Краткое описание", R.drawable.pic))
    val state_listTwo = arrayListOf(state("Заголовок статьи", "Краткое описание", R.drawable.pictwo))}