package com.kelvinwachiye.kotlin.moviedb.ui.moviedetails

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.kelvinwachiye.kotlin.moviedb.R
import com.kelvinwachiye.kotlin.moviedb.databinding.FragmentDetailsBinding
import com.kelvinwachiye.kotlin.moviedb.domains.Movie
import dagger.hilt.android.AndroidEntryPoint

private const val IMAGE_BASE_URL = "https://image.tmdb.org/t/p/w185/"
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
    ): View? {
        Log.d(TAG, "onCreateView: ${args.movie.title}")
        _binding = FragmentDetailsBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this
////        val viewModelFactory = MovieDetailsFactory(args.movie.id)
//        binding.viewModel = ViewModelProvider(
//            this,
//            viewModelFactory
//        ).get(MovieDetailsViewModel::class.java)

        displayMovieDetails(args.movie)

        return binding.root
    }

    private fun displayMovieDetails(movie: Movie) {
        binding.tvTitile.text = movie.title
        binding.tvPlot.text = movie.overview
        binding.date.text = movie.date
        Glide.with(requireContext())
            .load(IMAGE_BASE_URL + movie.imageSrcUrl)
            .centerCrop()
            .transition(DrawableTransitionOptions.withCrossFade())
            .error(R.drawable.ic_broken_image)
            .into(binding.backdrop)

        viewModel.details.observe(viewLifecycleOwner) {
            if (it.language == "en") {
                binding.tvLanguage.text = getString(R.string.eng)
            } else {
                binding.tvLanguage.text = it.language
                Log.d(TAG, "displayMovieDetails: ${it.language}")
            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}