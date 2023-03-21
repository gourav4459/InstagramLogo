package com.example.instagramlogo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.instagramlogo.ui.theme.InstagramLogoTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstagramLogoTheme {

                // A surface container using the 'background' color from the theme

                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center

                ){
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            buildAnnotatedString {
                                withStyle(style = SpanStyle(
                                    color = Color.Red,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 50.sp
                                )){
                                    append("I")
                                }
                                append("nstagram")
                                withStyle(style = SpanStyle(
                                    color = Color.Red,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 50.sp
                                )){
                                    append("L")
                                }
                                append("ogo")
                            },
                            color = Color.Magenta,
                            fontSize = 40.sp,
                            fontWeight = FontWeight.Bold,
                            textDecoration = TextDecoration.Underline,
                            fontStyle = FontStyle.Italic
                        )
                        InstagramLogo()

                    }

                }
            }
        }
    }
}


