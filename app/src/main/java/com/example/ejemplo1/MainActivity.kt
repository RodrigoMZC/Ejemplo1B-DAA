package com.example.ejemplo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejemplo1.ui.theme.Ejemplo1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejemplo1Theme {
                GreetingPreview()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Ejemplo1Theme {
        LogIn()
    }
}

@Composable
fun LogIn() {
    var usr by remember { mutableStateOf(TextFieldValue("")) }
    var psw by remember { mutableStateOf(TextFieldValue("")) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.database),
            contentDescription = "Log in img",
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )


        TextField(
            value = usr,
            onValueChange = { usr = it },
            label = { Text(text = "Usuario") },
        )
        Spacer(modifier =  Modifier.height(8.dp))

        TextField(
            value = psw,
            onValueChange = { psw = it },
            label = { Text(text = "Contraseña") },

        )
        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = {},
            modifier = Modifier
                .width(270.dp)
        ) {
            Text(text = "Iniciar sesion", fontSize = 18.sp)
        }

    }
}
