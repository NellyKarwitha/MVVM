package com.mor.mid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mor.mid.ui.theme.MidTheme

class InputActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Input()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Input() {

    Box(
        modifier = Modifier
            .fillMaxHeight()
        ){
            Image(
                painter = painterResource(id = R.drawable.zz),
                contentDescription = "null",
                modifier = Modifier
                    .fillMaxHeight(),
                contentScale = ContentScale.FillHeight

            )

        LazyColumn {
            item {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(30.dp),


                    horizontalAlignment = Alignment.CenterHorizontally

                ){

                    var name by remember {
                        mutableStateOf(TextFieldValue(""))
                    }

                    TextField(
                        value = name,
                        onValueChange = {name = it},
                        label = {Text(text = "Enter name")},
                        trailingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "")},

                        )


                    Spacer(modifier = Modifier.height(40.dp))

                    var abc by remember {
                        mutableStateOf(TextFieldValue(""))
                    }

                    TextField(
                        value = abc,
                        onValueChange = {abc = it},
                        label = {Text(text = "Residence")},
                        trailingIcon = { Icon(imageVector = Icons.Default.Home, contentDescription = "")}

                    )


                    Spacer(modifier = Modifier.height(40.dp))


                    var phone by remember {
                        mutableStateOf(TextFieldValue(""))
                    }

                    OutlinedTextField(
                        value = phone,
                        onValueChange ={phone = it},
                        label = {Text(text = "Phone")},
                        leadingIcon = { Icon(imageVector = Icons.Default.Phone , contentDescription = "")},
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                        textStyle = TextStyle(Color.Black),
                        colors = TextFieldDefaults.outlinedTextFieldColors(

                            focusedBorderColor = Color.Blue,
                            unfocusedBorderColor = Color.Magenta,
                            focusedLabelColor = Color.Blue,
                            unfocusedLabelColor = Color.Blue,
                            cursorColor = Color.Black,
                            focusedLeadingIconColor = Color.Gray,
                            unfocusedLeadingIconColor = Color.Gray

                        )


                    )

                    Spacer(modifier = Modifier.height(40.dp))

                    var country by remember {
                        mutableStateOf(TextFieldValue(""))
                    }

                    OutlinedTextField(
                        value = country,
                        onValueChange ={country = it},
                        label = { Text(text = "Country") },
                        leadingIcon = { Icon(imageVector = Icons.Default.FavoriteBorder , contentDescription = "")},
                        textStyle = TextStyle(Color.Black),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                        colors = TextFieldDefaults.outlinedTextFieldColors(

                            focusedBorderColor = Color.Blue,
                            unfocusedBorderColor = Color.Magenta,
                            focusedLabelColor = Color.Blue,
                            unfocusedLabelColor = Color.Blue,
                            cursorColor = Color.Black,
                            focusedLeadingIconColor = Color.Magenta,


                            )


                    )





                }
            }
        }







    }

}


