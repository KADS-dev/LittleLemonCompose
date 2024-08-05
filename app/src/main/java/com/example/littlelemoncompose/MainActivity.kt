package com.example.littlelemoncompose

import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemoncompose.ui.theme.LittleLemonComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LittleLemonComposeTheme {
//
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = R.string.Little_Lemon.toString(),
//                        modifier = Modifier.padding(innerPadding)
//                    )
//
//
//                }
                GreetingPreview()
            }
        }
    }
    data class Message(val autor: String, val body:String?)

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        fontSize = 35.sp,
        modifier = modifier
    )
}


@Composable
fun ShowMessage(message:MainActivity.Message){
    Column{
        Text(text = message.autor,
            fontSize = 26.sp,
            textAlign = TextAlign.Center
            )
        if (message.body.isNullOrEmpty())
        {
            Text(
                text = "Not Description :(",
                fontSize = 25.sp
            )
        }else{
            Text(
                text = message.body,
                fontSize = 25.sp
            )
        }
    }

}

@Composable
fun ShowButton(modifier: Modifier) {

    Row(modifier.padding(50.dp)) {
        Image(
            painter = painterResource(id = R.drawable.bread),
            contentDescription = "Picture X",
            modifier.size(100.dp)
        )


        RadioButton(selected = false, onClick = { })
    }


}


@Composable
fun ShowPicture(){
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = "Profile Picture",
            Modifier
                .size(250.dp)
        )
}
@Preview(showBackground = true, showSystemUi = true)
//@PreviewScreenSizes
@Composable
fun GreetingPreview() {

    LittleLemonComposeTheme {
        Column(Modifier.fillMaxSize()
            , verticalArrangement = Arrangement.Center
            , horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painter = painterResource(id = R.drawable.little_lemon_front)
                , contentDescription = "Little Lemon Default Image"
                ,Modifier.size(200.dp)
            )
            Text(
                text = stringResource(id = R.string.initMessage1)
                , fontSize = 20.sp
            )
            Text(
                text = stringResource(id = R.string.initMessage2)
                , fontSize = 20.sp
            )

           TextField(
               value = stringResource(id = R.string.user)
               , onValueChange = {}
               , Modifier.padding(top = 100.dp)
               , shape = RoundedCornerShape(10.dp)
           )

            TextField(
                value = stringResource(id = R.string.password)
                , onValueChange = {}
                , Modifier.padding(all = 30.dp)
                , shape = RoundedCornerShape(10.dp)
            )

            Button(
                onClick = { /*TODO*/ }
                , Modifier.padding(top = 20.dp)
                , colors = ButtonDefaults
                    .buttonColors(colorResource(id = R.color.yellow), Color.Black)
            ) {
                Text(text = stringResource(id = R.string.access_button))
            }
        }
    }
    /*
        //Surface(modifier = Modifier, color = MaterialTheme.colorScheme.background) {
            LittleLemonComposeTheme {
                Column(modifier = Modifier
                    .padding(all = 80.dp)
                ){
                    Greeting("Android")
                    ShowPicture()
                    ShowMessage(
                        message = MainActivity.Message(
                            "KADS", null
                        )
                    )
                    ShowButton(modifier = Modifier)
                }

            }
*/
}


