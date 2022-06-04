package com.enzhongwen.hanyu2

import android.content.ContentResolver
import android.content.Context
import android.provider.Settings.Global.getString
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.StringRes
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import kotlin.coroutines.coroutineContext

class LessonAdapter: RecyclerView.Adapter<LessonAdapter.LessonViewHolder>() {

    lateinit var context: Context

    class LessonViewHolder(val view: View): RecyclerView.ViewHolder(view){
        val lesson: TextView = view.findViewById(R.id.lesson)
        val heading: TextView = view.findViewById(R.id.heading)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder {
        val actionLayout = LayoutInflater.from(parent.context).inflate(R.layout.lesson_list,parent,false)
        return LessonViewHolder(actionLayout)
    }

    override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
        val item = data[position]
        context = holder.view.context
        holder.lesson.text = context.resources.getString(item.lesson)
        holder.heading.text = item.heading

        holder.view.setOnClickListener {
            holder.view.findNavController().navigate(LessonFragmentDirections.actionLessonFragmentToVocabularyFragment(position+1))
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
}

data class DataLesson(@StringRes val lesson: Int, val heading: String)

val data: List<DataLesson> = listOf(
    DataLesson(R.string.lesson_1,"西瓜大 苹果小"),
    DataLesson(R.string.lesson_2,"今天的天气很好"),
    DataLesson(R.string.lesson_3,"我们真高兴啊"),
    DataLesson(R.string.lesson_4,"小狗非常可爱"),
    DataLesson(R.string.lesson_5,"这个公园真热闹"),
    DataLesson(R.string.lesson_6,"这双筷子是我的"),
    DataLesson(R.string.lesson_7,"小华的衣服是红的"),
    DataLesson(R.string.lesson_8,"书包里有什么"),
    DataLesson(R.string.lesson_9,"学校前面是马路"),
    DataLesson(R.string.lesson_10,"我们的教室"),
    DataLesson(R.string.lesson_11,"小华常去图书馆"),
    DataLesson(R.string.lesson_12,"小红也学中文"),
    DataLesson(R.string.lesson_13,"我们都是学生"),
    DataLesson(R.string.lesson_14,"他们一起上学"),
    DataLesson(R.string.lesson_15,"下课啦"),
)