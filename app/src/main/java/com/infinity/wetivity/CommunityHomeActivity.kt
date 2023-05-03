package com.infinity.wetivity

import android.content.Intent
import android.graphics.BlurMaskFilter.Blur
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.text.FieldPosition

class CommunityHomeActivity : AppCompatActivity() {

    var Detail = ArrayList<ViewHolder>()
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_community_home)


        init()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    private fun init(){

        recyclerView = findViewById(R.id.recycler_view)

        var data = ArrayList<Class>()
        data.add(Class("Koding Hebat", "Punya Usaha agar para programmer dapat lebih fokus berusaha", "20 April 2021"))
        data.add(Class("Pengusaha", "Punya Usaha agar anak istri dapat tidur dengan nyenyak", "4 Mei 2010"))
        data.add(Class("Programmer", "memiliki skill di masa depan agar berguna bagi perusahaan", "17 Agustus 2012"))

        adapter = MyAdapter(data)



    }


}