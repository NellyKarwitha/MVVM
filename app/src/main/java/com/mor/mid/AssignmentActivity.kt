package com.mor.mid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mor.mid.ui.theme.MidTheme
import androidx.compose.material3.Card as Card1
import androidx.compose.material3.Card as Card2

class AssignmentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
         Assignment2()
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Assignment2() {
LazyColumn(
    modifier = Modifier
        .background(color = Color.White)
        .fillMaxSize()
) {
    item {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        )



        {
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
             horizontalArrangement = Arrangement.Absolute.Center
         ) {

             Image(
                 painter = painterResource(id = R.drawable.evening),
                 contentDescription = "null",
                 modifier = Modifier
                     .size(20.dp)
             )

             Text(text = "Hotels")


             Spacer(modifier = Modifier.width(10.dp))



             Image(
                 painter = painterResource(id = R.drawable.green),
                 contentDescription = "null",
                 modifier = Modifier
                     .size(20.dp)
             )

             Column{

             Text(text = "Holiday")

         }




         }

         Spacer(modifier = Modifier.height(30.dp))


            Row() {

                    Image(
                        painter = painterResource(id = R.drawable.night),
                        contentDescription = "null",
                        modifier = Modifier
                            .size(20.dp)
                    )

                Column {

                    Text(text = "Taxi")
                }

                Spacer(modifier = Modifier.width(10.dp))



                    Image(
                        painter = painterResource(id = R.drawable.lake),
                        contentDescription = "null",
                        modifier = Modifier
                            .size(20.dp)
                    )


                Column {
                    Text(
                        text = "Ticket",
                        fontSize = 10.sp

                    )
                }





            }



        }

        }
    }
}


