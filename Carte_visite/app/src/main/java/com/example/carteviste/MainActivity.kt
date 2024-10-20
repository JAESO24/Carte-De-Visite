package com.example.carte_viste

import androidx.compose.foundation.layout.R

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Text

class PersonalCardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            myPersonalCard()
        }
    }
}

@Composable
fun myPersonalCard() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(R.drawable.android_logo),
            contentDescription = null,
            modifier = Modifier.size(80.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text("KOUASSI Ange-Elie", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Text("Développeur", fontSize = 18.sp, color = Color.Gray)
    }

    Spacer(modifier = Modifier.height(32.dp)) // Ajoute un espacement entre les deux colonnes

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Bottom
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(Icons.Default.Phone, contentDescription = "Téléphone")
            Spacer(modifier = Modifier.width(8.dp))
            Text("+225 0102474452")
        }
        Spacer(modifier = Modifier.height(16.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(Icons.Default.AccountCircle, contentDescription = "Social Média")
            Spacer(modifier = Modifier.width(8.dp))
            Text("https://socialmedia")
        }
        Spacer(modifier = Modifier.height(16.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(Icons.Default.Email, contentDescription = "Email")
            Spacer(modifier = Modifier.width(8.dp))
            Text("eliekouassi756@gmail.com")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun myPersonalCardPreview() {
    myPersonalCard()
}