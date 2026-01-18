package com.example.myapplication


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight

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

        composable("screen1"){
            BioScreen1(controller);
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

    }


}

@Composable
fun Screen1(controller: NavController){

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        item{
            namePlate("BRILLANTES", controller, Color(0xFFF63049), "screen1");
        }

        item {
            namePlate("BRUTAS", controller, Color(0xFFD02752), "screen2");
        }

        item {
            namePlate("CANDELARIO", controller, Color(0xFF8A244B), "screen3");
        }

        item {
            namePlate("CAYLAS", controller, Color(0XFF111F35), "screen4");

        }

        item {
            namePlate("DACILLO", controller, Color(0xFF1A5C5C), "screen5");
        }
    }

}

@Composable
fun namePlate(name: String, controller: NavController, color: Color, screen: String){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .background(color),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Text(
            modifier = Modifier.padding(start = 10.dp),
            color = Color(0xFFBBEEDD),
            text = name,
            fontFamily = FontFamily(Font(R.font.komika)),
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold
        );

        Button(
            modifier = Modifier.padding(end = 10.dp, bottom = 10.dp),
            onClick = {
                controller.navigate(screen);
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF0288D1),
                contentColor = Color.White
            )
        ){
            Text("View >>>", fontWeight = FontWeight.Bold)
        }
    }
}