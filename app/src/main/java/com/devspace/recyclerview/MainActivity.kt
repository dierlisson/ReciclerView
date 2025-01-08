package com.devspace.recyclerview

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        // Set Adapter
        // Linear Layout manager
        // submeter a lista

        val rvList = findViewById<RecyclerView>(R.id.rv_list)
        val ivList = findViewById<ImageView>(R.id.iv_list)
        val ivGrid = findViewById<ImageView>(R.id.iv_grid)
        val adapter = ContactListAdapter()

        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)
        adapter.submitList(contacts)

        ivGrid.setOnClickListener {
            rvList.layoutManager = GridLayoutManager(this, 2)
        }

        ivList.setOnClickListener {
            rvList.layoutManager = LinearLayoutManager(this)
        }

        adapter.setOnClickListener { contact ->
            Log.d("Dierlisson", contact.toString())
        }


    }
}

val contacts = listOf(
    Contact(
        "Dierlisson",
        "(55) 27 999999999",
        R.drawable.sample2
    ), Contact(
        "Leticia",
        "(55) 27 999123499",
        R.drawable.sample3
    ), Contact(
        "Marcos",
        "(55) 27 129837732",
        R.drawable.sample12
    ), Contact(
        "Vitor",
        "(55) 27 123123123",
        R.drawable.sample14
    ), Contact(
        "Josefina",
        "(55) 27 981723981",
        R.drawable.sample1
    ), Contact(
        "Ana",
        "(55) 27 999876543",
        R.drawable.sample4
    ), Contact(
        "Carla",
        "(55) 27 987654321",
        R.drawable.sample5
    ), Contact(
        "Fernanda",
        "(55) 27 986543210",
        R.drawable.sample6
    ), Contact(
        "Gabriela",
        "(55) 27 985432109",
        R.drawable.sample7
    ), Contact(
        "Heleno",
        "(55) 27 984321098",
        R.drawable.sample8
    ), Contact(
        "Igor",
        "(55) 27 983210987",
        R.drawable.sample9
    ), Contact(
        "Juliano",
        "(55) 27 982109876",
        R.drawable.sample10
    ), Contact(
        "Leonarda",
        "(55) 27 981098765",
        R.drawable.sample11
    ), Contact(
        "Mariana",
        "(55) 27 980987654",
        R.drawable.sample13
    ), Contact(
        "Paula",
        "(55) 27 979876543",
        R.drawable.sample15
    ), Contact(
        "Ricarda",
        "(55) 27 978765432",
        R.drawable.sample16
    )
)