package com.example.instagramlogo

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable

fun InstagramLogo(){
    val instaColors = listOf(Color.Yellow,Color.Red,Color.Magenta)
    Canvas(
        modifier = Modifier
            .size(100.dp)
            .padding(15.dp)

    ){
        drawRoundRect(
            brush = Brush.linearGradient(colors = instaColors),
            style = Stroke(width = 20f),
            cornerRadius =  CornerRadius(40f)
        )
        drawCircle(
            brush = Brush.linearGradient(colors = instaColors),
            style = Stroke(width = 20f),
            radius =  45f
        )
        drawCircle(
            brush = Brush.linearGradient(colors = instaColors),
            radius = 15f,
            center = Offset(
                x = size.width * 0.8f,
                y = size.height * 0.2f
            )
        )


    }

}
@Preview
@Composable
fun InstagramLogoPrev(){
    InstagramLogo()
}