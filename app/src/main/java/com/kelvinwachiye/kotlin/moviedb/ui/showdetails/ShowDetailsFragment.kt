package com.kelvinwachiye.kotlin.moviedb.ui.showdetails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import androidx.navigation.fragment.navArgs
import com.kelvinwachiye.kotlin.moviedb.R
import com.kelvinwachiye.kotlin.moviedb.databinding.FragmentShowDetailsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ShowDetailsFragment : Fragment(R.layout.fragment_details) {

    private val args by navArgs<ShowDetailsFragmentArgs>()
    private val viewModel by viewModels<ShowDetailsViewModel>()
    private var _binding: FragmentShowDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentShowDetailsBinding.inflate(inflater, container, false)

        displayShow()

        return binding.root
    }

    private fun displayShow() {
        var content = ""
        viewModel.show.observe(viewLifecycleOwner) {
            content += "last_air_date: " + it.last_air_date + "\n"
            content += "last_episode_to_air: " + it.last_episode_to_air!!.name + "\n"
            content += "overview: " + it.overview + "\n"
            content += "seasons: " + it.seasons.toString() + "\n"
            content += "status: " + it.status + "\n"
            content += "Season 1: " + it.seasons!![0].overview
            binding.tvMain.text = content
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}