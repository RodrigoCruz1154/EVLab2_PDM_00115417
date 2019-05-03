package com.feranstirman.myapplication.activity.activities

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import com.feranstirman.myapplication.R
import com.feranstirman.myapplication.activity.fragments.BlankFragment
import com.feranstirman.myapplication.activity.fragments.colores

class MainActivity : AppCompatActivity(), BlankFragment.OnFragmentInteractionListener, colores.OnFragmentInteractionListener{
    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private lateinit var fragmentoBotones : BlankFragment
    private lateinit var fragmentoColores : colores

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniciarFragment()
    }

    private fun cambiarFragmento(id: Int, frag: Fragment) {
        supportFragmentManager.beginTransaction().replace(id, frag).commit()
    }

    private fun iniciarFragment() {
        fragmentoBotones = BlankFragment.newInstance()
        cambiarFragmento(R.id.botonesFR,fragmentoBotones)
        fragmentoColores = colores.newInstance()
        cambiarFragmento(R.id.coloresFR,fragmentoColores)

    }
}

