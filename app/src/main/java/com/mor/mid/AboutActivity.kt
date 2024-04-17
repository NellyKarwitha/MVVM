package com.mor.mid

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            About()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun About() {
    Column(
      modifier = Modifier
          .background(Color.Cyan)
          //    .fillMaxWidth()
          //    .fillMaxHeight()
          .fillMaxSize()
          .padding(10.dp),

   //   verticalArrangement = Arrangement.Top,
   //     horizontalAlignment = Alignment.CenterHorizontally,


    ) {

        Row(
            modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth(),

            horizontalArrangement = Arrangement.Center


        )

        {
            Text(text = "Calls")

            Spacer(modifier = Modifier.width(20.dp))

            Text(text = "Logs")
            Spacer(modifier = Modifier.width(20.dp))

            Text(text = "Contacts")

        }

        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "About us!",
            color = Color.DarkGray,
            fontFamily = FontFamily.Cursive,
            fontSize = 30.sp,
            fontStyle = FontStyle(4)
        )

        Spacer(modifier = Modifier.height(45.dp))

        Text(
            text = "Welcome!",
            color = Color.Blue,
            modifier = Modifier.background(Color.Magenta),
            fontFamily = FontFamily.Cursive
        )

        Spacer(modifier = Modifier.height(45.dp))


        val home = LocalContext.current
        Button(onClick = {
            home.startActivity(Intent(home, MainActivity::class.java))
        },

        shape = CutCornerShape(20),
        colors = ButtonDefaults.buttonColors(Color.Blue)

        ) {

            Text(text = "Home Page", color = Color.Magenta, fontFamily = FontFamily.Cursive)

        }
Spacer(modifier = Modifier.height(10.dp))

        val ef = AnnotatedString("Home Page")
        val wx = LocalContext.current
        
        ClickableText(text = ef, onClick = {
            wx.startActivity(Intent(wx, MainActivity::class.java))
            
        })
        
    }
}




