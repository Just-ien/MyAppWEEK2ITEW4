package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun BioScreen2(cont: NavController) {

    val name = "Irah Christine B. Brutas"
    val bio = "I am Irah Christine B. Brutas, a 3rd-year BSIT student. I am 21 years old and currently focusing on building my skills in Java, PHP, HTML, and JavaScript."

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Card(
            modifier = Modifier
                .size(150.dp),
            shape = CircleShape,
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.student2),
                contentDescription = "Profile Picture",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Name: $name",
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(8.dp))


        Spacer(modifier = Modifier.height(8.dp))


        Spacer(modifier = Modifier.height(20.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFF5F5F5)
            ),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
        ) {
            Text(
                text = bio,
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(16.dp),
                color = Color(0xFF333333)
            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = {
                cont.popBackStack()
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF6200EE),
                contentColor = Color.White
            ),
            shape = androidx.compose.foundation.shape.RoundedCornerShape(12.dp),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 8.dp,
                pressedElevation = 12.dp
            )
        ) {
            Text(
                text = "Back",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}