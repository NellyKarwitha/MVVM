package com.mor.mid

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mor.mid.ui.theme.MidTheme

class AssignmentActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        Assignment()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Assignment() {
            LazyColumn(

                      modifier = Modifier
                          .background(Color.LightGray)
                          .fillMaxSize()
                  ){
                      item {
                          Column(
                              modifier = Modifier
                                  .padding(10.dp)
                                  .fillMaxSize(),
                              horizontalAlignment = Alignment.CenterHorizontally
                          ) {

                              Row(
                                  horizontalArrangement = Arrangement.SpaceEvenly,
                                  modifier = Modifier
                                      .fillMaxWidth(),
                              ) {

                                  Image(imageVector = Icons.Default.Home,
                                      contentDescription ="",
                                  )

                                  Column(
                                      horizontalAlignment = Alignment.CenterHorizontally
                                  ) {
                                      Text(text = "Location")

                                      Row {
                                          Image(
                                              imageVector = Icons.Default.LocationOn,
                                              contentDescription ="",
                                              modifier = Modifier
                                                  .size(15.dp)

                                          )
                                          Text(text = "Nairobi")
                                      }

                                  }

                                  Image(imageVector = Icons.Default.Settings, contentDescription ="" )

                              }
//
                              Spacer(modifier = Modifier.height(15.dp))


                              Row(
                                  horizontalArrangement = Arrangement.Absolute.SpaceBetween
                              ) {

                                  Row(
                                      modifier = Modifier
                                          .padding(10.dp)
                                          .background(Color.White)
                                          .padding(10.dp)
                                          .shadow(elevation = 10.dp)


                                  ) {
                                      Image(imageVector = Icons.Default.Home,
                                          contentDescription ="",
                                      )
                                      Text(
                                          text = "Hotels",
                                          color = Color.Black,
                                          fontFamily = FontFamily.Cursive,
                                          fontWeight  = FontWeight.Bold
                                      )

                                  }

                                  Spacer(modifier = Modifier.width(25.dp))
                                  Row(
                                      modifier = Modifier
                                          .padding(10.dp)
                                          .background(Color.Cyan)
                                          .padding(10.dp)
                                          .shadow(elevation = 10.dp)
                                  ) {
                                      Image(imageVector = Icons.Default.Home,
                                          contentDescription ="",
                                      )
                                      Text(text = "Holiday")

                                  }

                              }



                              Row(
                                  horizontalArrangement = Arrangement.Absolute.SpaceBetween
                              ) {

                                  Row(
                                      modifier = Modifier
                                          .padding(10.dp)
                                          .background(Color.White)
                                          .padding(10.dp)
                                          .shadow(elevation = 10.dp)


                                  ) {
                                      Image(imageVector = Icons.Default.Home,
                                          contentDescription ="",
                                      )
                                      Text(text = "Hotels")

                                  }

                                  Spacer(modifier = Modifier.width(25.dp))
                                  Row(
                                      modifier = Modifier
                                          .padding(10.dp)
                                          .background(Color.White)
                                          .padding(10.dp)
                                          .shadow(elevation = 10.dp)
                                  ) {
                                      Image(imageVector = Icons.Default.Home,
                                          contentDescription ="",
                                      )
                                      Text(text = "Holiday")

                                  }

                              }

                              Spacer(modifier = Modifier.height(5.dp))

                              Row(
                                  horizontalArrangement = Arrangement.Absolute.SpaceBetween
                              ) {

                                  Row(
                                      modifier = Modifier
                                          .padding(10.dp)
                                          .background(Color.White)
                                          .padding(10.dp)
                                          .shadow(elevation = 10.dp)


                                  ) {
                                      Image(imageVector = Icons.Default.Home,
                                          contentDescription ="",
                                      )
                                      Text(text = "Hotels")

                                  }

                                  Spacer(modifier = Modifier.width(25.dp))
                                  Row(
                                      modifier = Modifier
                                          .padding(10.dp)
                                          .background(Color.White)
                                          .padding(10.dp)
                                          .shadow(elevation = 10.dp)
                                  ) {
                                      Image(imageVector = Icons.Default.Home,
                                          contentDescription ="",
                                      )
                                      Text(text = "Holiday")

                                  }

                              }

                              Row (
                              ){

                                  Text(text = "Popular")

                                  Spacer(modifier = Modifier.width(60.dp))

                                  Text(text = "View All")

                              }


















                          }
                      }
                  }



              }




