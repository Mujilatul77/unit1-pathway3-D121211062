package com.example.businesscardproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardproject.ui.theme.BusinessCardProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CardText( name = "Mujilatul Qaiyemah Juliantira", title = "Informatics Engineering Undergraduate")
                    CardContacts (email = "juliantiramq21d@student.unhas.ac.id", telp = "082350990943", link = "Mujilatul Qaiyemah Juliantira")
                }
            }
        }
    }
}

@Composable
fun CardText(name: String, title: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg)
    Image(
        painter = image,
        contentDescription = null,
        modifier = modifier
            .fillMaxSize()
    )
    // Create a column so that texts don't overlap
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        val image = painterResource(R.drawable.potoo)
        Image(
            painter = image,
            contentDescription = null,
            modifier = modifier
                .size(180.dp)
                .clip(CircleShape)
                .padding(5.dp)
        )
        Text(
            text = name,
            fontSize = 25.sp,
            lineHeight = 50.sp,
            textAlign = TextAlign.Center,
            style = androidx.compose.ui.text.TextStyle(fontWeight = FontWeight.Bold)

        )
        Text(
            text = title,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(5.dp)


        )
    }
}
@Composable
fun CardContacts(email: String, telp: String, link: String, modifier: Modifier = Modifier) {
    // Create a column so that texts don't overlap
    Column (
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Column(
            verticalArrangement = Arrangement.Bottom,
            modifier = modifier
                .padding(
                    bottom = 25.dp,
                    start = 25.dp
                )
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                val image = painterResource(R.drawable.email_542638)
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = modifier
                        .padding(horizontal = 8.dp)
                        .height(20.dp)
                        .width(20.dp)
                )
                Text(
                    text = email,
                    fontSize = 18.sp,
                    lineHeight = 20.sp,
                    textAlign = TextAlign.Center,
                )
            }
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                val image = painterResource(R.drawable.telephone_159832)
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = modifier
                        .padding(horizontal = 8.dp)
                        .height(20 .dp)
                        .width(20.dp)
                )
                Text(
                    text = telp,
                    fontSize = 18.sp,
                    modifier = Modifier
                        .padding(7.dp)
                )
            }
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                val image = painterResource(R.drawable.linkedin_1384014)
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = modifier
                        .padding(horizontal = 8.dp)
                        .height(20.dp)
                        .width(20.dp)
                )
                Text(
                    text = link,
                    fontSize = 18.sp,
                    modifier = Modifier
                        .padding(7.dp)
                )
            }
        }
    }
}