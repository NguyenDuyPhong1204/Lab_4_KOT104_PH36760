package com.example.lab4.Lab6.Activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.livedata.observeAsState
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.lab4.Lab6.MovieScreen
import com.example.lab4.Lab6.UI.Screens.CinemaSeatBookingScreen
import com.example.lab4.Lab6.UI.Screens.ScreenNavController
import com.example.lab4.Lab6.UI.Screens.createTheaterSeating
import com.example.lab4.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            CinemaSeatBookingScreen(
//                createTheaterSeating(
//                    totalRows = 12,
//                    totalSeatsPerRow = 9,
//                    aislePositionInRow = 4,
//                    aislePositionInColumn = 5
//                ), totalSeatsPerRow = 9
//            )
//            val mainViewModel: MainViewModel = viewModel()
//            val moviesState =
//                mainViewModel.movies.observeAsState(initial = emptyList())
//            MovieScreen(moviesState.value)
            ScreenNavController()
        }
    }
}