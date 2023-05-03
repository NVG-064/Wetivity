package com.infinity.wetivity

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class ViewHolder(inflater: LayoutInflater, parent:ViewGroup): RecyclerView.ViewHolder(inflater.inflate(R.layout.template_recyclerview, parent, false)) {

    public var judul: TextView? = null
    private var keterangan: TextView? = null
    private var tanggal: TextView? = null


    init {
        judul = itemView.findViewById(R.id.judul)
        keterangan = itemView.findViewById(R.id.keterangan)
        tanggal = itemView.findViewById(R.id.tanggal)
    }

    fun bind(data: Class){
        judul?.text = data.judul
        keterangan?.text = data.keterangan
        tanggal?.text = data.tanggal
    }

}