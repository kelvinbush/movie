package com.kelvinwachiye.kotlin.moviedb.ui.showdetails

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.kelvinwachiye.kotlin.moviedb.R
import com.kelvinwachiye.kotlin.moviedb.constants.MyConstants
import com.kelvinwachiye.kotlin.moviedb.constants.MyConstants.Companion.IMAGE_BASE_URL
import com.kelvinwachiye.kotlin.moviedb.databinding.FragmentShowDetailsBinding
import com.kelvinwachiye.kotlin.moviedb.domains.Cast
import com.kelvinwachiye.kotlin.moviedb.domains.Crew
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.*

@AndroidEntryPoint
class ShowDetailsFragment : Fragment(R.layout.fragment_details),
    AdapterView.OnItemSelectedListener {

    private val viewModel by viewModels<ShowDetailsViewModel>()
    private var _binding: FragmentShowDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentShowDetailsBinding.inflate(inflater, container, false)

        displayShow()

        return binding.root
    }

    private val spinnerList: ArrayList<String>
        get() {
            return arrayListOf()
        }

    private fun displayShow() {
        val spinner = binding.spinner
        var content = ""
        val spinnerItems = spinnerList
        viewModel.show.observe(viewLifecycleOwner, {
            val seasons = it.number_of_seasons
            for (i in 1..seasons!!) {
                content = "Season $i"
                spinnerItems.add(content)
            }
            binding.apply {
                tvTitle.text = it.name
                tvPlot.text = it.overview
                tvDate.text = getDate(it.first_air_date!!)
                tvRating.text = it.vote_average
                tvNoOfSeasons.text = it.number_of_seasons.toString() + " seasons"
                glideAdapter(it.backdrop_path, backdrop)
                glideAdapter(it.poster_path, poster)
                showCredits()

            }

        })
        val arrayAdapter =
            ArrayAdapter(requireActivity(), android.R.layout.simple_spinner_item, spinnerItems)
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = arrayAdapter
        spinner.onItemSelectedListener = this
    }

    private fun glideAdapter(imageUrl: String?, view: ImageView) {
        Glide.with(requireContext())
            .load(IMAGE_BASE_URL + imageUrl)
            .error(R.drawable.ic_broken_image)
            .into(view)
    }


    private fun showCredits() {
        viewModel.credits.observe(viewLifecycleOwner, {
            when (it.cast?.size) {
                1 -> oneCast(it.cast, it.crew!!)
                2 -> twoCast(it.cast, it.crew!!)
                3 -> threeCast(it.cast, it.crew!!)
                else -> {
                    fourCast(it.cast!!)
                }
            }
        })
    }

    private fun fourCast(cast: List<Cast>) {
        binding.apply {
            tvCast1.text = cast[0].character ?: MyConstants.NOT_AVAILABLE
            tvCast2.text = cast[1].character ?: MyConstants.NOT_AVAILABLE
            tvCast3.text = cast[2].character ?: MyConstants.NOT_AVAILABLE
            tvCast4.text = cast[3].character ?: MyConstants.NOT_AVAILABLE
            tCast1.text = cast[0].original_name ?: MyConstants.NOT_AVAILABLE
            tCast2.text = cast[1].original_name ?: MyConstants.NOT_AVAILABLE
            tCast3.text = cast[2].original_name ?: MyConstants.NOT_AVAILABLE
            tCast4.text = cast[3].original_name ?: MyConstants.NOT_AVAILABLE
            glideAdapter(cast[0].profile_path, cast1)
            glideAdapter(cast[1].profile_path, cast2)
            glideAdapter(cast[2].profile_path, cast3)
            glideAdapter(cast[3].profile_path, cast4)
        }
    }

    private fun threeCast(cast: List<Cast>, crew: List<Crew>) {
        binding.apply {
            tvCast1.text = cast[0].character ?: MyConstants.NOT_AVAILABLE
            tvCast2.text = cast[1].character ?: MyConstants.NOT_AVAILABLE
            tvCast3.text = cast[2].character ?: MyConstants.NOT_AVAILABLE
            tCast1.text = cast[0].original_name ?: MyConstants.NOT_AVAILABLE
            tCast2.text = cast[1].original_name ?: MyConstants.NOT_AVAILABLE
            tCast3.text = cast[2].original_name ?: MyConstants.NOT_AVAILABLE
            glideAdapter(cast[0].profile_path, cast1)
            glideAdapter(cast[1].profile_path, cast2)
            glideAdapter(cast[2].profile_path, cast3)

            tvCast4.text = crew[0].job ?: MyConstants.NOT_AVAILABLE
            tCast4.text = crew[0].original_name ?: MyConstants.NOT_AVAILABLE
            glideAdapter(crew[0].profile_path, cast4)
        }
    }

    private fun twoCast(cast: List<Cast>, crew: List<Crew>) {
        binding.apply {
            tvCast1.text = cast[0].character ?: MyConstants.NOT_AVAILABLE
            tvCast2.text = cast[1].character ?: MyConstants.NOT_AVAILABLE
            tCast1.text = cast[0].original_name ?: MyConstants.NOT_AVAILABLE
            tCast2.text = cast[1].original_name ?: MyConstants.NOT_AVAILABLE
            glideAdapter(cast[0].profile_path, cast1)
            glideAdapter(cast[1].profile_path, cast2)


            tvCast3.text = crew[0].job ?: MyConstants.NOT_AVAILABLE
            tCast3.text = crew[0].original_name ?: MyConstants.NOT_AVAILABLE
            tvCast4.text = crew[1].job ?: MyConstants.NOT_AVAILABLE
            tCast4.text = crew[1].original_name ?: MyConstants.NOT_AVAILABLE
            glideAdapter(crew[0].profile_path, cast3)
            glideAdapter(crew[1].profile_path, cast4)
        }
    }

    private fun oneCast(cast: List<Cast>, crew: List<Crew>) {
        binding.apply {
            tvCast1.text = cast[0].character ?: MyConstants.NOT_AVAILABLE
            tCast1.text = cast[0].original_name ?: MyConstants.NOT_AVAILABLE
            glideAdapter(cast[0].profile_path, cast1)

            tvCast2.text = crew[0].job ?: MyConstants.NOT_AVAILABLE
            tCast2.text = crew[0].original_name ?: MyConstants.NOT_AVAILABLE
            tvCast3.text = crew[1].job ?: MyConstants.NOT_AVAILABLE
            tCast3.text = crew[1].original_name ?: MyConstants.NOT_AVAILABLE
            tvCast4.text = crew[2].job ?: MyConstants.NOT_AVAILABLE
            tCast4.text = crew[2].original_name ?: MyConstants.NOT_AVAILABLE

            glideAdapter(crew[0].profile_path, cast2)
            glideAdapter(crew[1].profile_path, cast3)
            glideAdapter(crew[2].profile_path, cast4)
        }
    }


    private fun getDate(dateStr: String): String {
        return try {
            /** DEBUG dateStr = '2006-04-16T04:00:00Z' **/
            val formatter = SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH)
            val mDate = formatter.parse(dateStr) // this never ends while debugging
            val dater = SimpleDateFormat("EEE, MMM d, yyyy")
            dater.format(mDate)
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
        val text = parent?.getItemAtPosition(position).toString() + "selected"
        Toast.makeText(parent?.context, "text", Toast.LENGTH_SHORT).show()
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }
}