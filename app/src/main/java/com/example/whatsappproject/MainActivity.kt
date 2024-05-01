package com.example.whatsappproject

import android.os.Bundle
import android.os.UserHandle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var UserArrayList:ArrayList<User>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView=findViewById<RecyclerView>(R.id.recycler)
        recyclerView.layoutManager= LinearLayoutManager(this, LinearLayoutManager.VERTICAL,true)
        val Username = arrayOf("Scarlett","Mark","Chris","Chris Evans","Jeremy","Ashley","Cobie","Samuel Jackson","Scarlett","Robert","Scarlett","Mark","Chris","Chris Evans","Jeremy","Ashley","Cobie","Samuel Jackson","Scarlett","Robert")
        val Pfp = intArrayOf(R.drawable.img_3,R.drawable.img_4,R.drawable.img_5,R.drawable.img_6,R.drawable.img_7,R.drawable.img_8,R.drawable.img_9,R.drawable.img_10,R.drawable.img_3,R.drawable.img_4,R.drawable.img_3,R.drawable.img_4,R.drawable.img_5,R.drawable.img_6,R.drawable.img_7,R.drawable.img_8,R.drawable.img_9,R.drawable.img_10,R.drawable.img_3,R.drawable.img_4)
        val Lstmess = arrayOf("I m waiting","Still Waiting be quick!!","Failed to do so.","Where are you?","Hello","Reaching out to You","Lets have a meet today","Thanku","Whatsup?","I m going out","Reached home","Still Waiting be quick!!","Failed to do so.","Where are you?","Hello","Reaching out to You","Lets have a meet today","Thanku","Whatsup?","I m going out")
        val Lsttime = arrayOf("5:30 AM","4:30 PM","5:30 AM","4:30 PM","5:30 AM","4:30 PM","5:30 AM","4:30 PM","5:30 AM","4:30 PM","5:30 AM","4:30 PM","5:30 AM","4:30 PM","5:30 AM","4:30 PM","5:30 AM","4:30 PM","5:30 AM","4:30 PM")

        UserArrayList=ArrayList()


        for (i in Username.indices)
        {
            val user = User(Pfp[i],Username[i],Lstmess[i],Lsttime[i])
            UserArrayList.add(user)
        }

        recyclerView.adapter=MyAdapter(this,UserArrayList)
    }
}


