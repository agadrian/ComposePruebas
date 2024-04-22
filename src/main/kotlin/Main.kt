import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

@Composable
@Preview
fun MainScreen() {
    Surface(
        color = Color.LightGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Hi mates!!",
            style = MaterialTheme.typography.h5,
            modifier = Modifier.wrapContentSize(Alignment.TopEnd).background(color = Color.Red)
        )
        Text("hola")
    }
}

@Composable
@Preview
fun MainScreenn() {
    Surface(
        color = Color.LightGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Surface(
            color = Color.Green,
            modifier = Modifier.wrapContentSize(Alignment.Center)
        ) {
            Text(
                text = "Hi mates!!",
                style = MaterialTheme.typography.h5,
                modifier = Modifier.padding(20.dp)
            )
        }
    }
}

@Preview
@Composable
fun MainScreennn() {
    Surface(
        color = Color.LightGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Row {
            Surface(
                color = Color.Green,
                modifier = Modifier.size(60.dp)
            ) {}
            Surface(
                color = Color.Black,
                modifier = Modifier.size(60.dp)
            ) {}
        } }}

@Preview
@Composable
fun MainScreennnn() {
    Surface(
        color = Color.LightGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween) {
            Surface(
                color = Color.Green,
                modifier = Modifier.size(60.dp)
            ) {}
            Surface(
                color = Color.Black,
                modifier = Modifier.size(60.dp)
            ) {}
        }
    }
}
fun main() = application {
    val windowState = rememberWindowState(size = DpSize(1000.dp, 800.dp))
    Window(
        onCloseRequest = ::exitApplication,
        title = "Mi login",
        state = windowState
    ) {
        MainScreennn()
    }
}
