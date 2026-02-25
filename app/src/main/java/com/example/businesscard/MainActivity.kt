package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinesscardTheme
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinesscardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF073042))
            .padding(16.dp)

    ) {
        Column(
            modifier = Modifier
                .align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Top: logo and name
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = "Logo",
                modifier = Modifier
                    .size(100.dp)
                    .padding(bottom = 16.dp)
            )

            Text(
                text = "Akhilesh Gowda",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                textAlign = TextAlign.Center
            )

            Text(
                text = "Android Developer",
                fontSize = 18.sp,
                color = Color(0xFF3ddc84),
                modifier = Modifier.padding(top = 8.dp)
            )
        }

        // Bottom: contact info
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 32.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "📞  +91 98765 43210",
                fontSize = 16.sp,
                color = Color.White,
                modifier = Modifier.padding(4.dp)
            )
            Text(
                text = "✉️  akhilesh@example.com",
                fontSize = 16.sp,
                color = Color.White,
                modifier = Modifier.padding(4.dp)
            )
            Text(
                text = "💼  linkedin.com/in/akhilesh",
                fontSize = 16.sp,
                color = Color.White,
                modifier = Modifier.padding(4.dp)
            )
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BusinessCardPreview() {
    BusinesscardTheme {
        BusinessCard()
    }
}
