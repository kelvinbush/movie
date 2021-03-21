package com.kelvinwachiye.kotlin.moviedb.ui.showdetails

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.kelvinwachiye.kotlin.moviedb.R
import com.kelvinwachiye.kotlin.moviedb.adapters.CastAdapter
import com.kelvinwachiye.kotlin.moviedb.adapters.EpisodesAdapter
import com.kelvinwachiye.kotlin.moviedb.databinding.FragmentShowDetailsBinding
import dagger.hilt.android.AndroidEntryPoint
import java.util.*

@AndroidEntryPoint
class ShowDetailsFragment : Fragment(R.layout.fragment_show_details),
    AdapterView.OnItemSelectedListener {

    private val viewModel: ShowDetailsViewModel by viewModels()
    private var _binding: FragmentShowDetailsBinding? = null
    private val binding get() = _binding!!
    private var arrayAdapter: ArrayAdapter<String>? = null
    private val allSeasons = arrayListOf<String>()
    private val args by navArgs<ShowDetailsFragmentArgs>()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentShowDetailsBinding.inflate(inflater, container, false)

        val adapter = EpisodesAdapter()
        val castAdapter = CastAdapter()
        val layoutManager = LinearLayoutManager(requireContext())
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL

        binding.apply {
            episodesList.adapter = adapter
            castLayout.adapter = castAdapter
            castLayout.layoutManager = layoutManager
            spinner.onItemSelectedListener = this@ShowDetailsFragment
        }
        binding.showViewModel = viewModel
        binding.lifecycleOwner = this

        viewModel.apply {
            episodes.observe(viewLifecycleOwner, {
                it.let {
                    adapter.submitList(it.episodes)
                }
            })
            credits.observe(viewLifecycleOwner, {
                castAdapter.submitList(it.cast)
            })
            show.observe(viewLifecycleOwner, {
                if (allSeasons.isEmpty()) {
                    for (i in 1..it.number_of_seasons!!) {
                        allSeasons.add("Season $i")
                    }
                }
                arrayAdapter =
                    ArrayAdapter(
                        requireActivity(),
                        android.R.layout.simple_spinner_item,
                        allSeasons
                    )
                binding.spinner.adapter = arrayAdapter
                Log.d("displayShow: ", allSeasons.toString())
            })
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        viewModel.getEpisodes(args.tvShow.id, position + 1)
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

}