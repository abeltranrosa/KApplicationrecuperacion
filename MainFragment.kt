package com.example.antonio.kapplication


import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_second.*
import org.jetbrains.anko.support.v4.toast




// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var rootView = inflater.inflate(R.layout.fragment_main, container, false)

        Log.d("LOGFRAGMENT","on CreateView Fragment main")

        return rootView
    }

    override fun onResume() {
        super.onResume()
        Log.d("LOGFRAGMENT", "OnResume")
        main_button.setOnClickListener() {
            Log.d("LOGFRAGMENT", "On click")
            val datos = Intent(context, Main2Activity::class.java)
            datos.putExtra("key1", "valor1")
            startActivity(datos)
        }

    }
}
