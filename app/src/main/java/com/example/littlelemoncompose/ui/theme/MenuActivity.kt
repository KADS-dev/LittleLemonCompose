package com.example.littlelemoncompose.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemoncompose.R


@Preview(showBackground = true, showSystemUi = true)
//@PreviewScreenSizes
@Composable
fun MenuPreview() {

    Column (
        Modifier.fillMaxSize()
    , verticalArrangement = Arrangement.Center
    , horizontalAlignment = Alignment.CenterHorizontally
    ){

        Text(text= stringResource(id = R.string.little_lemon), fontSize = 32.sp, color = colorResource(
            id = R.color.yellow)
        )
        Text(text = stringResource(id = R.string.chicago), fontSize = 28.sp, color = colorResource(
            id = R.color.yellow
        )
        )
        Button(
            onClick = { /*TODO*/ }
            ,border = BorderStroke(2.dp, Color.Red)
            , colors = ButtonDefaults
                .buttonColors(Color.Gray, Color.Black, Color.Yellow, Color.Red)
        ) {
            Text(text = stringResource(id = R.string.order), fontSize = 28.sp)
        }
    }
}