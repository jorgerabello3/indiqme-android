package me.indiq.dev.indiqme.ui.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import me.indiq.dev.indiqme.R

class ManutencaoFragment : Fragment() {

    companion object {
        fun newInstance(): ManutencaoFragment = ManutencaoFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_manutencao, container, false)
    }
}

