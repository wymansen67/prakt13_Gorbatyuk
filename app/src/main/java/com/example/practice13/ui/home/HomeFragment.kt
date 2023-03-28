package com.example.practice13.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.practice13.R
import com.example.practice13.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    /* val feel_recycler : RecyclerView = root.findViewById(R.id.feel_rec)
    feel_recycler.adapter = FeelRecycler(requireContext(), MyFeel().list) */

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val root: View = inflater.inflate(R.layout.fragment_home, container, false)

        return root
    }

}