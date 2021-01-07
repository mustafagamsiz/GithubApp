package org.gamsiz.githubapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.gamsiz.githubapp.data.Item

class ItemAdapter(private val items: List<Item>):RecyclerView.Adapter<ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view, parent, false) as View

        return ItemViewHolder(itemView)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.view.item = items[position]
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = items.size
}