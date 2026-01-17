package com.example.myapplication

import BioScreen2
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                MainScreen();
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}

@Composable
fun MainScreen(){

    val controller = rememberNavController();
    val nav = NavHost(controller, "home"){

        composable("home"){
            Screen1(controller);
        }

        composable("screen2"){
            BioScreen2(controller);
        }

        composable("screen3"){
            BioScreen3(controller);
        }

        composable("screen4"){
            BioScreen4(controller);
        }

        composable("screen5"){
            BioScreen5(controller);
        }

        composable("screen1"){
            BioScreen1(controller);
        }

    }


}

@Composable
fun Screen1(controller: NavController){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ){


        Button(onClick = {
            controller.navigate("screen1");
        }){
            Text("Button 1")
        }

        Button(onClick = {
            controller.navigate("screen2");
        }){
            Text("Button 2")
        }

        Button(onClick = {
            controller.navigate("screen3")
        }){
            Text("Button 3")
        }

        Button(onClick = {
            controller.navigate("screen4");
        }){
            Text("Button 4")
        }

        Button(onClick = {
            controller.navigate("screen5");
        }){
            Text("Button 5")
        }

    }

}