package com.example.jetfurniture

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetfurniture.navigation.FurnitureNavigation
import com.example.jetfurniture.ui.theme.JetFurnitureTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetFurnitureTheme {
                FurnitureNavigation()

            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetFurnitureTheme {
    }
}