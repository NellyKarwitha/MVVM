package com.mor.mid

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.experimental.R
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Greeting()
            
        }
    }
}

fun Button(onClick: () -> Unit, modifier: () -> Unit) {

}

@Preview(showBackground = true)
@Composable
fun Greeting() {
    Box(
        modifier = Modifier
            .fillMaxSize()

    ) {

        Image(
            painter = painterResource(id = com.mor.mid.R.drawable.lake),
            contentDescription = "null",
            modifier = Modifier
                .fillMaxHeight(),
            contentScale = ContentScale.FillHeight
        )

        LazyColumn() {
            item {


                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp),
                ) {

                    Text(
                        "Welcome to this app!",
                        color = Color.Magenta,
                        fontFamily = FontFamily.Cursive,
                        fontSize = 25.sp
                    )

                    Text(text = "This is a software development learning app.", color = Color.Gray)

                    Text(text = "Are you ready to learn?", color = Color.Gray)

                    Text(text = "Click here to know more.", color = Color.Gray)

                    val about = LocalContext.current
                    Button(
                        onClick = {
                            about.startActivity(Intent(about, AboutActivity::class.java))
                        },

                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        // shape = RectangleShape()
                        shape = RoundedCornerShape(15.dp),
                        border = BorderStroke(2.dp, Color.Blue),


                        ) {

                        Text(text = "About", color = Color.Magenta, fontFamily = FontFamily.Serif)

                    }

                    Spacer(modifier = Modifier.height(30.dp))

                    val ab = AnnotatedString("About")
                    val yz = LocalContext.current

                    ClickableText(text = ab, onClick = {
                        yz.startActivity(Intent(yz, AboutActivity::class.java))
                    })

                    Spacer(modifier = Modifier.height(30.dp))


                    val input = LocalContext.current
                    Button(
                        onClick = {
                            input.startActivity(Intent(input, InputActivity::class.java))
                        },

                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        // shape = RectangleShape()
                        shape = RoundedCornerShape(15.dp),
                        border = BorderStroke(2.dp, Color.Blue),


                        ) {

                        Text(text = "Input", color = Color.Magenta, fontFamily = FontFamily.Serif)

                    }

                    Spacer(modifier = Modifier.height(30.dp))


                    val card = LocalContext.current
                    Button(
                        onClick = {
                            card.startActivity(Intent(card, AssignmentActivity::class.java))
                        },

                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        // shape = RectangleShape()
                        shape = RoundedCornerShape(15.dp),
                        border = BorderStroke(2.dp, Color.Blue),


                        ) {

                        Text(text = "Card", color = Color.Magenta, fontFamily = FontFamily.Serif)

                    }



                    Spacer(modifier = Modifier.height(30.dp))


                    AsyncImage(
                        model = "https://getbootstrap.com/docs/5.3/assets/brand/bootstrap-logo-shadow.png",
                        contentDescription = null,
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    val result = remember { mutableStateOf<Uri?>(null) }
                    val launcher =
                        rememberLauncherForActivityResult(ActivityResultContracts.PickVisualMedia()) {
                            result.value = it
                        }

                    Column {
                        Button(onClick = {
                            launcher.launch(
                                PickVisualMediaRequest(mediaType = ActivityResultContracts.PickVisualMedia.ImageOnly)
                            )
                        }) {
                            Text(text = "Select Image")
                        }

                        result.value?.let { image ->

                            val painter = rememberAsyncImagePainter(
                                ImageRequest
                                    .Builder(LocalContext.current)
                                    .data(data = image)
                                    .build()
                            )
                            Image(
                                painter = painter,
                                contentDescription = null,
                                modifier = Modifier
                                    .size(150.dp, 150.dp)
                                    .padding(16.dp)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(30.dp))


                    val web = LocalContext.current
                    Button(
                        onClick = {
                            web.startActivity(Intent(web, WebviewActivity::class.java))
                        },

                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        // shape = RectangleShape()
                        shape = RoundedCornerShape(15.dp),
                        border = BorderStroke(2.dp, Color.Blue),
                        
                    )
                    { Text(text = "Web")}


                    val work = LocalContext.current
                    Button(
                        onClick = {
                            work.startActivity(Intent(work, AssignmentActivity3::class.java))
                        },

                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        // shape = RectangleShape()
                        shape = RoundedCornerShape(15.dp),
                        border = BorderStroke(2.dp, Color.Blue),

                        )
                    { Text(text = "Wonderly")}


                }

            }

        }

    }

}