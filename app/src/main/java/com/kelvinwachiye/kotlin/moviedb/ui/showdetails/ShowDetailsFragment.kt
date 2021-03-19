package com.kelvinwachiye.kotlin.moviedb.ui.showdetails

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.kelvinwachiye.kotlin.moviedb.R
import com.kelvinwachiye.kotlin.moviedb.adapters.CastAdapter
import com.kelvinwachiye.kotlin.moviedb.adapters.EpisodesAdapter
import com.kelvinwachiye.kotlin.moviedb.databinding.FragmentShowDetailsBinding
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.*

@AndroidEntryPoint
class ShowDetailsFragment : Fragment(R.layout.fragment_details),
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
        }
        viewModel.apply {
            getEpisodes(args.tvShow.id, 1)
            getCredits(args.tvShow.id)
            getShow(args.tvShow.id)
            episodes.observe(viewLifecycleOwner, {
                it.let {
                    adapter.submitList(it.episodes)
                }
            })
            credits.observe(viewLifecycleOwner, {
                castAdapter.submitList(it.cast)
            })
        }

        displayShow()
        return binding.root
    }

    private fun displayShow() {
        val spinner = binding.spinner
        spinner.onItemSelectedListener = this
        viewModel.show.observe(viewLifecycleOwner, {
            for (i in 1..it.number_of_seasons!!) allSeasons.add("Season $i")
            binding.apply {
                tvTitle.text = it.name
                tvPlot.text = it.overview
                tvDate.text = getDate(it.first_air_date!!)
                tvRating.text = it.vote_average
                tvNoOfSeasons.text = it.number_of_seasons.toString() + " seasons"
            }
            arrayAdapter =
                ArrayAdapter(
                    requireActivity(),
                    android.R.layout.simple_spinner_item,
                    allSeasons
                )
            spinner.adapter = arrayAdapter
        })
    }


    private fun getDate(dateStr: String): String {
        return try {
            /** DEBUG dateStr = '2006-04-16T04:00:00Z' **/
            val formatter = SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH)
            val mDate = formatter.parse(dateStr) // this never ends while debugging
            val dater = SimpleDateFormat("EEE, MMM d, yyyy", Locale.ENGLISH)
            dater.format(mDate!!)
        } catch (e: Exception) {
            Log.d("mDate", e.toString()) // this never gets called either
            dateStr
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val selected = parent?.selectedItem.toString()
        Toast.makeText(requireContext(), selected, Toast.LENGTH_SHORT).show()

    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

}