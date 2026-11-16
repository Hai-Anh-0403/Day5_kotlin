package com.example.lab5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WordAdapter(
    private val wordList: List<Word>
) : RecyclerView.Adapter<WordAdapter.WordViewHolder>() {

    class WordViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        val tvEnglish: TextView =
            itemView.findViewById(R.id.tvEnglish)

        val tvVietnamese: TextView =
            itemView.findViewById(R.id.tvVietnamese)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): WordViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_word, parent, false)

        return WordViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: WordViewHolder,
        position: Int
    ) {

        val word = wordList[position]

        holder.tvEnglish.text = word.english
        holder.tvVietnamese.text = word.vietnamese
    }

    override fun getItemCount(): Int {
        return wordList.size
    }
}