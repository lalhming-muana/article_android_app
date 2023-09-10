package com.example.article_android_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.article_android_app.ui.theme.Article_android_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Article_android_appTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArticleCard()
                }
            }
        }
    }
}

@Composable
fun ArticleCard(){
    ArticleImage(
        heading = stringResource(R.string.heading),
        shortDescription = stringResource(R.string.short_description),
        longDescription = stringResource(R.string.long_description),

    )
}


@Composable
fun ArticleImage(heading: String,
                 shortDescription: String,
                 longDescription: String,
                 modifier: Modifier = Modifier) {

    Column(modifier = modifier) {
        val imagePaint = painterResource(R.drawable.bg_compose_background)
        Image(
            painter = imagePaint,
            contentDescription = null,

        )

        Text(
            text = heading,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Justify,
        )

        Text(
            text = shortDescription,
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Justify,
        )

        Text(
            text = longDescription,
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Justify,
        )
    }


}

@Preview(showBackground = true)
@Composable
fun ArticleImagePreview() {
    Article_android_appTheme {
        ArticleCard()
    }
}