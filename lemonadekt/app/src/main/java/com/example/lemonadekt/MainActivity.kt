package com.example.lemonadekt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.lemonadekt.ui.theme.LemonadektTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeApp()
        }
    }
}


@Composable
fun LemonadeApp() {
    var step by remember{muatableIntStateOf(1)}
    Surface(modifier = Modifier.fillMaxSize(),
        color = colorResource(R.color.teal_200 )) {}
        Step1()
    }

@Composable
fun Step1(){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier.fillMaxWidth())
    {
        Text(text = stringResource(R.string.app_name),
            color = colorResource(R.color.white),
            fontSize = (30.sp)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LemonadektTheme {
        LemonadeApp()
    }
}