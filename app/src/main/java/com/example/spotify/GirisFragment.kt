package com.example.spotify

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.spotify.databinding.FragmentGirisBinding

private lateinit var tasarim:FragmentGirisBinding
class GirisFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        tasarim = FragmentGirisBinding.inflate(layoutInflater)
        return tasarim.root
    }


}