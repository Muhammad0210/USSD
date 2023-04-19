package com.example.ussd.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ussd.databinding.ItemListBinding
import com.example.ussd.models.MyTemplate

class TemAdapter(val list: List<MyTemplate>, val rvClick: RvClick):RecyclerView.Adapter<TemAdapter.Vh>() {

    inner class Vh(val itemRvBinding: ItemListBinding): RecyclerView.ViewHolder(itemRvBinding.root) {
        fun OnBind(myTemplate: MyTemplate, position: Int){
            itemRvBinding.txtName.text = myTemplate.name
            itemRvBinding.txtCode.text = myTemplate.code
            itemRvBinding.txtAbout.text = myTemplate.price

            itemRvBinding.root.setOnClickListener { rvClick.itemClick(myTemplate) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.OnBind(list[position], position)
    }

    override fun getItemCount(): Int = list.size
}
interface RvClick{
    fun itemClick(myTemplate: MyTemplate)
}