package com.example.firzaapp.utils

import androidx.recyclerview.widget.DiffUtil
import com.example.firzaapp.core.domain.model.TvShow


class DivTvShowCallback(private val oldItem: List<TvShow>, private val newItem: List<TvShow>): DiffUtil.Callback() {
    override fun getOldListSize(): Int = oldItem.size

    override fun getNewListSize(): Int = newItem.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
        oldItem[oldItemPosition].id == newItem[newItemPosition].id

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
        oldItem[oldItemPosition].id == newItem[newItemPosition].id
}