package com.kelvinwachiye.kotlin.moviedb.ui.moviedetails

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.kelvinwachiye.kotlin.moviedb.adapters.CastAdapter
import com.kelvinwachiye.kotlin.moviedb.databinding.FragmentDetailsBinding
import com.kelvinwachiye.kotlin.moviedb.domains.Movie
import dagger.hilt.android.AndroidEntryPoint

private const val TAG = "MovieDetailsFragment"

@AndroidEntryPoint
class MovieDetailsFragment : Fragment() {


    private val args by navArgs<MovieDetailsFragmentArgs>()
    private var _binding: FragmentDetailsBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MovieDetailsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d(TAG, "onCreateView: ${args.movie2.title}")
        _binding = FragmentDetailsBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this
        val castAdapter = CastAdapter()
        val layoutManager = LinearLayoutManager(requireContext())
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        displayMovieDetails(args.movie2)
        binding.viewModel = viewModel

        viewModel.credits.observe(viewLifecycleOwner, {
            castAdapter.submitList(it.cast)
        })

        return binding.root
    }

    private fun displayMovieDetails(movie: Movie) {
        binding.apply {
            tvTitile.text = movie.title
            tvPlot.text = movie.overview
            date.text = movie.date
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}