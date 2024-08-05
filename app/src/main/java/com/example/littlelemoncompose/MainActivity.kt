package com.example.littlelemoncompose

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import android.widget.RadioButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemoncompose.ui.theme.LittleLemonComposeTheme
import kotlinx.coroutines.selects.select

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

        Column {

            Text(text= stringResource(id = R.string.little_lemon), fontSize = 32.sp, color = colorResource(
                id = R.color.yellow))
            Text(text = stringResource(id = R.string.chicago), fontSize = 28.sp, color = colorResource(
                id = R.color.yellow
            ))
            Button(
                onClick = { /*TODO*/ }
                ,border = BorderStroke(2.dp, Color.Red)

            ) {
                Text(text = stringResource(id = R.string.order), fontSize = 28.sp)
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


}