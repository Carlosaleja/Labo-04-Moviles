package com.enriselle.labo4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.enriselle.labo4.navigation.RootNavigation
import com.enriselle.labo4.screens.ChampionsViewModel
import com.enriselle.labo4.screens.DetailScreen
import com.enriselle.labo4.screens.MainScreen
import com.enriselle.labo4.ui.theme.Labo4Theme

class MainActivity : ComponentActivity() {
    private val viewModel: ChampionsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Labo4Theme {
                RootNavigation(viewModel = viewModel)
            }
        }
    }
}